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
	$(document).ready(function(){
		document.getElementById("matchLi").classList.add('current');
		
		 });
	function moreInfo(summonerName){		
		var summonerID = 'summonerID='+encodeURIComponent(summonerName);
		alert("미구현");
		return;
		$.ajax({
			url: "/movie/lol/match.ajax",
			type: "POST",
			dataType: "JSON",
			async:false,
			data:summonerID,
			success: function(data, status) {
			},
			error: function (){
				alert("error");
			}
		});
	}
	function SummonerDetail(summonerName){
		var frm = document.getElementById("frm");
		var subcmd = document.getElementById("subcmd");
		var cmd = document.getElementById("cmd");
		
		cmd.value="lol"
		subcmd.value = "match";
		frm.method = "post";
		frm.action = "/movie/"+cmd.value+"/"+subcmd.value+".do?summonerID="+encodeURIComponent(summonerName);
		frm.submit();
	}
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
											<h3>솔로랭크</h3>
											<table>
											<tr><td>
											<c:choose>
											<c:when test='${soloRank.getTier() == "IRON"}'>
											<img src="${pageContext.request.contextPath}/images/emblems/Emblem_Iron.png" align="left" style="padding-right: 10px;" height="128" width="138">
											</c:when>
											<c:when test='${soloRank.getTier() == "BRONZE"}'>
											<img src="${pageContext.request.contextPath}/images/emblems/Emblem_Bronze.png" align="left" style="padding-right: 10px;" height="128" width="138">
											</c:when>
											<c:when test='${soloRank.getTier() == "SILVER"}'>
											<img src="${pageContext.request.contextPath}/images/emblems/Emblem_Silver.png" align="left" style="padding-right: 10px;" height="128" width="138">
											</c:when>
											<c:when test='${soloRank.getTier() == "GOLD"}'>
											<img src="${pageContext.request.contextPath}/images/emblems/Emblem_Gold.png" align="left" style="padding-right: 10px;" height="128" width="138">
											</c:when>
											<c:when test='${soloRank.getTier() == "PLATINUM"}'>
											<img src="${pageContext.request.contextPath}/images/emblems/Emblem_Platinum.png" align="left" style="padding-right: 10px;" height="128" width="138">
											</c:when>
											<c:when test='${soloRank.getTier() == "DIAMOND"}'>
											<img src="${pageContext.request.contextPath}/images/emblems/Emblem_Diamond.png" align="left" style="padding-right: 10px;" height="128" width="138">
											</c:when>
											<c:when test='${soloRank.getTier() == "MASTER"}'>
											<img src="${pageContext.request.contextPath}/images/emblems/Emblem_Master.png" align="left" style="padding-right: 10px;" height="128" width="138">
											</c:when>
											<c:when test='${soloRank.getTier() == "GRANDMASTER"}'>
											<img src="${pageContext.request.contextPath}/images/emblems/Emblem_Grandmaster.png" align="left" style="padding-right: 10px;" height="128" width="138">
											</c:when>
											<c:when test='${soloRank.getTier() == "CHALLENGER"}'>
											<img src="${pageContext.request.contextPath}/images/emblems/Emblem_Challenger.png" align="left" style="padding-right: 10px;" height="128" width="138">
											</c:when>								
											</c:choose>
											${soloRank.getTier()} ${soloRank.getRank()} <br>
											${soloRank.getLeaguePoints()}LP <br>
											${soloRank.getWins()}승  / ${soloRank.getLosses()}패 <br>
											승률: ${Math.round(soloRank.getWins()/(soloRank.getWins()+soloRank.getLosses())*1000.0)/10.0}										
											</td></tr></table>
										</section>

										<section>
											<h3>자유랭크</h3>
											<table>
											<tr><td>
											<c:choose>
											<c:when test='${teamRank.getTier() == "IRON"}'>
											<img src="${pageContext.request.contextPath}/images/emblems/Emblem_Iron.png" align="left" style="padding-right: 10px;" height="128" width="138">
											</c:when>
											<c:when test='${teamRank.getTier() == "BRONZE"}'>
											<img src="${pageContext.request.contextPath}/images/emblems/Emblem_Bronze.png" align="left" style="padding-right: 10px;" height="128" width="138">
											</c:when>
											<c:when test='${teamRank.getTier() == "SILVER"}'>
											<img src="${pageContext.request.contextPath}/images/emblems/Emblem_Silver.png" align="left" style="padding-right: 10px;" height="128" width="138">
											</c:when>
											<c:when test='${teamRank.getTier() == "GOLD"}'>
											<img src="${pageContext.request.contextPath}/images/emblems/Emblem_Gold.png" align="left" style="padding-right: 10px;" height="128" width="138">
											</c:when>
											<c:when test='${teamRank.getTier() == "PLATINUM"}'>
											<img src="${pageContext.request.contextPath}/images/emblems/Emblem_Platinum.png" align="left" style="padding-right: 10px;" height="128" width="138">
											</c:when>
											<c:when test='${teamRank.getTier() == "DIAMOND"}'>
											<img src="${pageContext.request.contextPath}/images/emblems/Emblem_Diamond.png" align="left" style="padding-right: 10px;" height="128" width="138">
											</c:when>
											<c:when test='${teamRank.getTier() == "MASTER"}'>
											<img src="${pageContext.request.contextPath}/images/emblems/Emblem_Master.png" align="left" style="padding-right: 10px;" height="128" width="138">
											</c:when>
											<c:when test='${teamRank.getTier() == "GRANDMASTER"}'>
											<img src="${pageContext.request.contextPath}/images/emblems/Emblem_Grandmaster.png" align="left" style="padding-right: 10px;" height="128" width="138">
											</c:when>
											<c:when test='${teamRank.getTier() == "CHALLENGER"}'>
											<img src="${pageContext.request.contextPath}/images/emblems/Emblem_Challenger.png" align="left" style="padding-right: 10px;" height="128" width="138">
											</c:when>								
											</c:choose>
											${teamRank.getTier()} ${teamRank.getRank()} <br>
											${teamRank.getLeaguePoints()}LP <br>
											${teamRank.getWins()}승  / ${teamRank.getLosses()}패 <br>
											승률: ${Math.round(teamRank.getWins()/(teamRank.getWins()+teamRank.getLosses())*1000.0)/10.0}										
											</td></tr></table>
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
											
											<table>
											<tr>
											<td style="display:inline;"><img src="${pageContext.request.contextPath}/images/profileicon/${profileiconFile.getImage().getFull()}" height="128" width="128" align="left"></td>
											<td width="80%"><br><h3> ${summonerinfo.getName()}</h3><br>level: ${summonerinfo.getSummonerLevel()}</td>
											</tr>
											</table>
											
											<br>
											<%@ include file="../../jspf/matchDetail.jspf" %> 
											
											<div id="dataArea"></div>
											<table><tr><td><input type="button" value="더보기" onclick='javascript:moreInfo("test");' style="width:100%"></td></tr></table>
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