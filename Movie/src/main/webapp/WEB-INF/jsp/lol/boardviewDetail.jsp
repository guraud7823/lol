<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
	<head>
		<title>Verti by HTML5 UP</title>
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css" />
		<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
		<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
	<style>
			#lol td {
			font-size: 1.5em;
			text-align: center;
			padding: 0.5px 0.5px 0.5px 0.5px;
		}
	</style>
	</head>
	<body class="is-preload no-sidebar">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script> 
	<script type="text/javascript">
	$(document).ready(function(){
		document.getElementById("boardLi").classList.add('current');
		 });
	function Modify(){
		var frm = document.getElementById("frm");
		var subcmd = document.getElementById("subcmd");
		var cmd = document.getElementById("cmd");
		
		cmd.value="lol"
		subcmd.value = "boardmodify";
		frm.method = "post";
		frm.action = "/movie/"+cmd.value+"/"+subcmd.value+".do?bo_no="+'${boardInfo.get("bo_no")}';
		frm.submit();
	}
	function Delete(){
		var frm = document.getElementById("frm");
		var obj = new Object(); 
		obj.boNo = frm.boNo.value;
		var jsondata = JSON.stringify(obj); 
        $.ajax({
			url: "/movie/lol/boarddelete.ajax",
			type: "POST",
			dataType: "JSON",
			async:false,
			data:"ajaxdata="+jsondata,
			success: function(data, status) {
				alert("성공적으로 삭제되었습니다");
				Link('board');
			},
			error: function (){
				alert("error");
			}
		});
	}
      function CommentWrite(){
  		var frm = document.getElementById("frm");
  		var obj = new Object(); 
  		obj.co_content = frm.co_content.value;
  		obj.boNo = frm.boNo.value;
  		var jsondata = JSON.stringify(obj); 
          $.ajax({
  			url: "/movie/lol/commentboardwrite.ajax",
  			type: "POST",
  			dataType: "JSON",
  			async:false,
  			data:"ajaxdata="+jsondata,
  			success: function(data, status) {
  				location.reload();
  			},
  			error: function (){
  				alert("error");
  			}
  		});
        }
        function CommentDelete(coNo){
    		var frm = document.getElementById("frm");
    		var obj = new Object(); 
    		obj.coNo = coNo;
    		var jsondata = JSON.stringify(obj); 
            $.ajax({
    			url: "/movie/lol/commentboarddelete.ajax",
    			type: "POST",
    			dataType: "JSON",
    			async:false,
    			data:"ajaxdata="+jsondata,
    			success: function(data, status) {
    				location.reload();
    			},
    			error: function (){
    				alert("error");
    			}
    		});
        }
	</script>
	<form id="frm">
	<input type="hidden" id="cmd"/>
	<input type="hidden" id="subcmd"/>
	<input type="hidden" id="boNo" value='${boardInfo.get("bo_no")}'/>
	
		<div id="page-wrapper">
		
		<%@ include file="../../jspf/header.jspf" %> 
		
				<div id="main-wrapper">
					<div class="container">
						<div id="content">

							<!-- Content -->
								<article>
									<table>
									<tr><tr><td>
									<h2 style="display:inline">자유게시판</h2></td>
									<td align="right">
									<c:if test='${account != "" &&  account != null && account == boardInfo.get("id")}'>
									<input type="button" value="수정" onclick="javascript:Modify();">
									<input type="button" value="삭제" onclick="javascript:Delete();">
									</c:if>
									</td></tr>
									</table>
									
									<table>
									<tr>
									<td colspan="1">제목</td>
									<td colspan="3">${boardInfo.get("title")}</td>
									</tr>
									<tr>
									<td>작성자</td>
									<td>${boardInfo.get("id")}</td>
									<td>등록일</td>
									<c:choose>
										<c:when test='${boardInfo.get("regdt") == null}'>
										<td>${boardInfo.get("moddt")}</td>
										</c:when>
										<c:otherwise>
										<td>${boardInfo.get("regdt")}</td>
										</c:otherwise>
									</c:choose>
									</tr>
									<tr>
									<td colspan="4">
									${boardInfo.get("content")}
									</td>
									</tr>
									</table>
									<br><br>
									
									<table border="1">
									<c:if test='${account != null && account !=""}'>
									<tr><td><textarea name="co_content" id="co_content" cols="60" rows="3" style="dislplay:inline"></textarea></td>
									<td><input type="button" value="등록" onclick='javascript:CommentWrite()'></td></tr>
									</c:if>
									<c:forEach items='${commentBoardlist}' var="row" varStatus="status">
									<tr style="padding: 2px 0px;">
									<td>${row.get("co_content")}</td>
									<td>
									<c:if test='${account == row.get("co_id") }'>
									<input type="button" value="삭제" onclick='javascript:CommentDelete(${row.get("co_no") })' style="padding: 0px 10px;">
									</c:if>
									</td>
									</tr>
									</c:forEach>
									</table>
																		
								</article>

						</div>
					</div>
				</div>

			<!-- Footer -->
				<%@ include file="../../jspf/footer.jspf" %> 

			</div>
</form>

	</body>
</html>