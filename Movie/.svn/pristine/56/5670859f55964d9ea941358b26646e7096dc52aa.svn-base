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
	function Search(){
		//Riot.DDragon.fn();
		var frm = document.getElementById("frm");
		var subcmd = document.getElementById("subcmd");
		var cmd = document.getElementById("cmd");
		
		cmd.value="lol"
		subcmd.value = "board";
		frm.method = "post";
		frm.action = "/movie/"+cmd.value+"/"+subcmd.value+".do";
		frm.submit(); 
	}
	function ChampDetail(champkey){
 		var frm = document.getElementById("frm");
		var subcmd = document.getElementById("subcmd");
		var cmd = document.getElementById("cmd");
		
		cmd.value="lol"
		subcmd.value = "championinfodetail";
		frm.method = "post";
		frm.action = "/movie/"+cmd.value+"/"+subcmd.value+".do?championKey="+champkey;
		frm.submit(); 
	}
	function PageLink(currentpage){
		var frm = document.getElementById("frm");
		var subcmd = document.getElementById("subcmd");
		var cmd = document.getElementById("cmd");

		cmd.value="lol"
		subcmd.value = "board";
		frm.method = "post";
		frm.action = '/movie/'+cmd.value+'/'+subcmd.value+'.do?currentpage='+currentpage+'&searchvalue='+encodeURIComponent('${boardInfo.get("selectInfo")}')+'&selectbox='+'${boardInfo.get("searchvalue")}';
		frm.submit(); 
	}
	function boardViewDetail(bo_no){
		var frm = document.getElementById("frm");
		var subcmd = document.getElementById("subcmd");
		var cmd = document.getElementById("cmd");
		
		cmd.value="lol"
		subcmd.value = "boarddetail";
		frm.method = "post";
		frm.action = '/movie/'+cmd.value+'/'+subcmd.value+'.do?&bo_no='+bo_no;
		frm.submit(); 
	}
	function Write(){
		var frm = document.getElementById("frm");
		var subcmd = document.getElementById("subcmd");
		var cmd = document.getElementById("cmd");
		
		cmd.value="lol"
		subcmd.value = "boardwrite";
		frm.method = "post";
		frm.action = '/movie/'+cmd.value+'/'+subcmd.value+'.do';
		frm.submit(); 
	}
	</script>
	<form id="frm">
	<input type="hidden" id="cmd"/>
	<input type="hidden" id="subcmd"/>
	
		<div id="page-wrapper">
		
		<%@ include file="../../jspf/header.jspf" %> 
		
				<div id="main-wrapper">
					<div class="container">
					<table>
						<tr align="right">
							<td>
								<select name="selectbox" style="width:150px; height:48px; display:inline;">
								    <option value="all">전체</option>
								    <option value="title">제목</option>
								    <option value="id">작성자</option>
								    <option value="content">제목+내용</option>
								</select>
								<input type="text" id="searchvalue" name="searchvalue" style=" width: 500px; height: 50px; display:inline;">&nbsp;&nbsp;&nbsp;
								<input type="button" value="검색" onclick="javascript:Search();">
							</td>
						</tr>
					</table>
						<div id="content">

							<!-- Content -->
								<article>
									<table>
									<tr><tr><td>
									<h2 style="display:inline">자유게시판</h2></td>
									<td align="right">
									<c:if test='${account != "" &&  account != null}'>
									<input type="button" value="글쓰기" onclick="javascript:Write();">
									</c:if>
									</td></tr>
									</table>
									<table>
									<tr>
									<th>제목</th>
									<th>작성자</th>
									<th>작성일</th>
									</tr>
									<c:forEach items='${boardlist}' var="row" varStatus="status">
									<tr>
									<td><a href='javascript:boardViewDetail(${row.get("bo_no")})' style="color: gray; text-decoration: underline; text-decoration: none;">${row.get("title")}</a></td>
									<td>${row.get("id")}</td>
									<td>${row.get("regdt")}</td>
									</tr>
									</c:forEach>
									</table>
									<br><br>
									
									<%@ include file="../../jspf/paging.jspf" %> 
									
									
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