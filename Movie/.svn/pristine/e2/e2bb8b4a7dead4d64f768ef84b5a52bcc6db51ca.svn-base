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
		document.getElementById("champLi").classList.add('current');
		 });
	function Search(){
		//Riot.DDragon.fn();
		var frm = document.getElementById("frm");
		var subcmd = document.getElementById("subcmd");
		var cmd = document.getElementById("cmd");
		
		cmd.value="sample"
		subcmd.value = "list";
		Submit(frm,cmd,subcmd);
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
		
		<%@ include file="../../jspf/header.jspf" %> 
		
				<div id="main-wrapper">
					<div class="container">
						<div id="content">

							<!-- Content -->
								<article>
									<h2>챔피언 목록</h2>
									
									<div id="lol">
									<table border="1">
									
										<c:forEach items='${ChampImg}' var="row" varStatus="status">
										<c:if test="${status.index%11 == 0 }">
										<tr>
										</c:if>
											<td>
												<a href="javascript:ChampDetail(${ChampKey.get(status.index)})">
												<img src="${pageContext.request.contextPath}/images/champion/${row}" height="100" width="100"></a>
												<br>${ChampName.get(status.index)}
											</td>	
										<c:if test="${status.index%11 == 10}">
										</tr>
										</c:if>	
										</c:forEach>	
									</table>
									</div>
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