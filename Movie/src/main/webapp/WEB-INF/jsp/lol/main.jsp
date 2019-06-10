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
			font-size: 2em;
			text-align: center;
			padding: 0.5px 0.5px 0.5px 0.5px;
		}
	</style>
	</head>
	<body class="is-preload homepage">
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script> 
	<script type="text/javascript">
	$(document).ready(function(){
		document.getElementById("homeLi").classList.add('current');
		 });
	function Search(){
		//Riot.DDragon.fn();
		var frm = document.getElementById("frm");
		var subcmd = document.getElementById("subcmd");
		var cmd = document.getElementById("cmd");
		var summonerId = document.getElementById("summonerID");
		
		cmd.value="lol"
		subcmd.value = "match";
		frm.method = "post";
		frm.action = "/movie/"+cmd.value+"/"+subcmd.value+".do?summonerID="+encodeURIComponent(summonerId.value);
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
	</script>
	<form id="frm">
	<input type="hidden" id="cmd"/>
	<input type="hidden" id="subcmd"/>
	
		<div id="page-wrapper">
			<!-- Banner -->
			<%@ include file="../../jspf/header.jspf" %> 

				<div id="banner-wrapper">
					<div id="banner" class="box container">
						<div class="row">
							<div class="col-7 col-12-medium">
								<p>It's a League Of Legends search site.</p>
						</div>
					</div>
					<br>
					<table>
						<tr align="center">
							<td>
								<input type="text" id="summonerID" name="summonerID" style=" width: 500px; height: 50px; display:inline;">&nbsp;&nbsp;&nbsp;
								<input type="button" value="검색" onclick="javascript:Search();">
							</td>
						</tr>
					</table>
				</div>
			</div>
			
			<div id="banner-wrapper" style="margin-top:50px">
				<div id="banner" class="box container">
					
					<h3>이번주 로테이션</h3>
					<div id="lol">
					<table border="1">
					<tr>
						<c:forEach items='${freeChampImg }' var="row" varStatus="status"  >
						<td><a href="javascript:ChampDetail(${freeChampKey.get(status.index)})"><img src="${pageContext.request.contextPath}/images/champion/${row}" height="64" width="64"></a></td>
						</c:forEach>
					</tr>
					<tr>
						<c:forEach items='${freeChampName}' var="row">
								<td>${row}</td>
						</c:forEach>
					</tr>
					</table>
					</div>
					<br><br>
					<h3>신규 유저를 위한 추가 로테이션(10레벨 이하만 해당됩니다.)</h3>
					<div id="lol">
					<table border="1">
					<tr>
						<c:forEach items='${freeNewChampImg}' var="row" varStatus="status">
						<td><a href="javascript:ChampDetail(${freeNewChampKey.get(status.index)})"><img src="${pageContext.request.contextPath}/images/champion/${row}" height="64" width="64"></a></td>
						</c:forEach>
					
					</tr>
					<tr>
						<c:forEach items='${freeNewChampName}' var="row">
								<td>${row}</td>
						</c:forEach>
					</tr>
					</table>
					</div>
				</div>
			</div>
			
			
			<!-- Footer -->
				<%@ include file="../../jspf/footer.jspf" %>
			</div>
</form>
	</body>
</html>