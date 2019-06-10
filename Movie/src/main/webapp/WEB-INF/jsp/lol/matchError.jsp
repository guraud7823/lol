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
			#lolmain{
			font-size: 14px;
		}
		#lolmain td{
			padding: 0px 5px 0px 5px;
		}
	</style>
	</head>
	<body class="is-preload left-sidebar">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script> 
	<script type="text/javascript">
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
	</script>
	<form id="frm">
	<input type="hidden" id="cmd"/>
	<input type="hidden" id="subcmd"/>
	
	
		<div id="page-wrapper">

			<!-- Header -->
			<%@ include file="../../jspf/header.jspf" %> 

			<!-- Main -->
				<div id="main-wrapper">
					<div class="container">
						<div class="row gtr-200">
							<div class="col-4 col-12-medium">
								<div id="sidebar">

									<!-- Sidebar -->
										<section>
										</section>

										<section>
										</section>

								</div>
							</div>
							<div class="col-8 col-12-medium imp-medium" style="padding-top: 20px; padding-left: 0px;">
								<table>
									<tr align="right">
										<td>
											<input type="text" id="summonerID" name="summonerID" style=" width: 500px; height: 50px; display:inline;">&nbsp;&nbsp;&nbsp;
											<input type="button" value="검색" onclick="javascript:Search();">
										</td>
									</tr>
								</table>
								<div id="content">

									<!-- Content -->
										<article>
										<h1>잘못된 소환사 명입니다.<br>
										제대로 쳤다구요? 한국서버만 지원하니까 참고하세요.</h1>
										</article>

								</div>
							</div>
						</div>
					</div>
				</div>

			<!-- Footer -->
				<%@ include file="../../jspf/footer.jspf" %>

			</div>

</form>
	</body>
</html>