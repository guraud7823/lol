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
	function Save(){
		var frm = document.getElementById("frm");
		var obj = new Object(); 
		obj.content = frm.content.value;
		obj.title = frm.title.value;
		var jsondata = JSON.stringify(obj); 
		if(frm.title.value == null || frm.title.value == "")
			return alert("제목을 입력하세요");
        $.ajax({
			url: "/movie/lol/boardsave.ajax",
			type: "POST",
			dataType: "JSON",
			async:false,
			data:"ajaxdata="+jsondata,
			success: function(data, status) {
				alert("성공적으로 등록되었습니다");
				Link('board');
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
		<div id="page-wrapper">
		
		<%@ include file="../../jspf/header.jspf" %> 
		
				<div id="main-wrapper">
					<div class="container">
						<div id="content">

							<!-- Content -->
								<article>
									<h2>자유게시판</h2>
									
									<table>
									<tr>
									<td>제목</td>
									<td><input type="text" name="title" id="title" style="height:40px"></td>
									</tr>
									<tr>
									<td colspan="2"><textarea name="content" id="content" cols="40" rows="8" ></textarea>
									</td>
									</tr>
									</table>
									<br><br>
									<input type="button" value="저장" onclick="javascript:Save();" style="align:center">
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