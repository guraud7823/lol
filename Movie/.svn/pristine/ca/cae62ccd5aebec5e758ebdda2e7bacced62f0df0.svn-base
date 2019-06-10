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
			font-size: 1.7em;
			text-align: left;
			padding: 0.5px 0.5px 0.5px 0.5px;
		}
	</style>
	</head>
	<body class="is-preload left-sidebar">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script> 
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>
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
	var app = angular.module('ChampInfo', []);
	app.controller('spellQ', function($scope) {
		  $scope.e1 = '${sdffdsd}';
		  $scope.e2 = '${SpellQ.getEffectBurn().get(2)}';
		  $scope.e3 = '${SpellQ.getEffectBurn().get(3)}';
		  $scope.e4 = '${SpellQ.getEffectBurn().get(4)}';
		  $scope.e5 = '${SpellQ.getEffectBurn().get(5)}';
		  $scope.e6 = '${SpellQ.getEffectBurn().get(6)}';
		  $scope.e7 = '${SpellQ.getEffectBurn().get(7)}';
		  $scope.e8 = '${SpellQ.getEffectBurn().get(8)}';
		  $scope.e9 = '${SpellQ.getEffectBurn().get(9)}';
		  $scope.e10 = '${SpellQ.getEffectBurn().get(10)}';	
		  
		  $scope.a1 = '${SpellVars.get(0).get("a1")}';	
		  $scope.a2 = '${SpellVars.get(0).get("a2")}';	
		  $scope.a3 = '${SpellVars.get(0).get("a3")}';	
		  $scope.a4 = '${SpellVars.get(0).get("a4")}';	
		  $scope.a5 = '${SpellVars.get(0).get("a5")}';	
		  
		  $scope.f1 = '${SpellVars.get(0).get("f1")}';	
		  $scope.f2 = '${SpellVars.get(0).get("f2")}';	
		  $scope.f3 = '${SpellVars.get(0).get("f3")}';	

	});
	app.controller('spellW', function($scope) {
		 $scope.e1 = '${SpellW.getEffectBurn().get(1)}';
		  $scope.e2 = '${SpellW.getEffectBurn().get(2)}';
		  $scope.e3 = '${SpellW.getEffectBurn().get(3)}';
		  $scope.e4 = '${SpellW.getEffectBurn().get(4)}';
		  $scope.e5 = '${SpellW.getEffectBurn().get(5)}';
		  $scope.e6 = '${SpellW.getEffectBurn().get(6)}';
		  $scope.e7 = '${SpellW.getEffectBurn().get(7)}';
		  $scope.e8 = '${SpellW.getEffectBurn().get(8)}';
		  $scope.e9 = '${SpellW.getEffectBurn().get(9)}';
		  $scope.e10 = '${SpellW.getEffectBurn().get(10)}';

		  $scope.a1 = '${SpellVars.get(1).get("a1")}';	
		  $scope.a2 = '${SpellVars.get(1).get("a2")}';	
		  $scope.a3 = '${SpellVars.get(1).get("a3")}';	
		  $scope.a4 = '${SpellVars.get(1).get("a4")}';	
		  $scope.a5 = '${SpellVars.get(1).get("a5")}';	
		  
		  $scope.f1 = '${SpellVars.get(1).get("f1")}';	
		  $scope.f2 = '${SpellVars.get(1).get("f2")}';	
		  $scope.f3 = '${SpellVars.get(1).get("f3")}';	

	});
	app.controller('spellE', function($scope) {
		 $scope.e1 = '${SpellE.getEffectBurn().get(1)}';
		  $scope.e2 = '${SpellE.getEffectBurn().get(2)}';
		  $scope.e3 = '${SpellE.getEffectBurn().get(3)}';
		  $scope.e4 = '${SpellE.getEffectBurn().get(4)}';
		  $scope.e5 = '${SpellE.getEffectBurn().get(5)}';
		  $scope.e6 = '${SpellE.getEffectBurn().get(6)}';
		  $scope.e7 = '${SpellE.getEffectBurn().get(7)}';
		  $scope.e8 = '${SpellE.getEffectBurn().get(8)}';
		  $scope.e9 = '${SpellE.getEffectBurn().get(9)}';
		  $scope.e10 = '${SpellE.getEffectBurn().get(10)}';

		  $scope.a1 = '${SpellVars.get(2).get("a1")}';	
		  $scope.a2 = '${SpellVars.get(2).get("a2")}';	
		  $scope.a3 = '${SpellVars.get(2).get("a3")}';	
		  $scope.a4 = '${SpellVars.get(2).get("a4")}';	
		  $scope.a5 = '${SpellVars.get(2).get("a5")}';	
		  
		  $scope.f1 = '${SpellVars.get(2).get("f1")}';	
		  $scope.f2 = '${SpellVars.get(2).get("f2")}';	
		  $scope.f3 = '${SpellVars.get(2).get("f3")}';	
	});
	app.controller('spellR', function($scope) {
		 $scope.e1 = '${SpellR.getEffectBurn().get(1)}';
		  $scope.e2 = '${SpellR.getEffectBurn().get(2)}';
		  $scope.e3 = '${SpellR.getEffectBurn().get(3)}';
		  $scope.e4 = '${SpellR.getEffectBurn().get(4)}';
		  $scope.e5 = '${SpellR.getEffectBurn().get(5)}';
		  $scope.e6 = '${SpellR.getEffectBurn().get(6)}';
		  $scope.e7 = '${SpellR.getEffectBurn().get(7)}';
		  $scope.e8 = '${SpellR.getEffectBurn().get(8)}';
		  $scope.e9 = '${SpellR.getEffectBurn().get(9)}';
		  $scope.e10 = '${SpellR.getEffectBurn().get(10)}';

		  $scope.a1 = '${SpellVars.get(3).get("a1")}';	
		  $scope.a2 = '${SpellVars.get(3).get("a2")}';	
		  $scope.a3 = '${SpellVars.get(3).get("a3")}';	
		  $scope.a4 = '${SpellVars.get(3).get("a4")}';	
		  $scope.a5 = '${SpellVars.get(3).get("a5")}';	
		  
		  $scope.f1 = '${SpellVars.get(3).get("f1")}';	
		  $scope.f2 = '${SpellVars.get(3).get("f2")}';	
		  $scope.f3 = '${SpellVars.get(3).get("f3")}';	
	});
	</script>
	<form id="frm">
	<input type="hidden" id="cmd"/>
	<input type="hidden" id="subcmd"/>
	
	
		<div id="page-wrapper">
		
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
											<p>Phasellus quam turpis, feugiat sit amet ornare in, hendrerit in lectus.
											Praesent semper mod quis eget mi. Etiam eu ante risus. Aliquam erat volutpat.
											Aliquam luctus et mattis lectus sit amet pulvinar. Nam turpis nisi
											consequat etiam.</p>
											<footer>
												<a href="#" class="button icon fa-info-circle">Find out more</a>
											</footer>
										</section>

										<section>
											<h3>자유랭크</h3>
											<ul class="style2">
												<li><a href="#">Amet turpis, feugiat et sit amet</a></li>
												<li><a href="#">Ornare in hendrerit in lectus</a></li>
												<li><a href="#">Semper mod quis eget mi dolore</a></li>
												<li><a href="#">Quam turpis feugiat sit dolor</a></li>
												<li><a href="#">Amet ornare in hendrerit in lectus</a></li>
												<li><a href="#">Semper mod quisturpis nisi</a></li>
											</ul>
										</section>

								</div>
							</div>
							<div class="col-8 col-12-medium imp-medium" style="padding-top: 20px;">
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
										<div id="lol">
																		
											<table border="1">
											<tr>
											
											<td width="350"><img src='${pageContext.request.contextPath}/images/champion/${ChampInfo.get("img")}' height="128" width="148" align="left" style="padding-right: 20px;">
												<h3>${ChampInfo.get("title")}</h3><br>
												<h2>${ChampInfo.get("name")}</h2></td>
											<td> 
											체력: ${ChampStats.getHp()}(+${ChampStats.getHpperlevel()}) -> ${Math.round((ChampStats.getHp()+ChampStats.getHpperlevel()*17)*100)/100.0}<br>
											체력 재생: ${ChampStats.getHpregen()}(+${ChampStats.getHpregenperlevel()}) -> ${Math.round((ChampStats.getHpregen()+ChampStats.getHpregenperlevel()*17)*100)/100.0}<br>
											마나: ${ChampStats.getMp()}(+${ChampStats.getMpperlevel()}) -> ${Math.round((ChampStats.getMp()+ChampStats.getMpperlevel()*17)*100)/100.0}<br>
											마나 재생: ${ChampStats.getMpregen()}(+${ChampStats.getMpregenperlevel()}) -> ${Math.round((ChampStats.getMpregen()+ChampStats.getMpregenperlevel()*17)*100)/100.0}<br>
											공격력: ${ChampStats.getAttackdamage()}(+${ChampStats.getAttackdamageperlevel()}) -> ${Math.round((ChampStats.getAttackdamage()+ChampStats.getAttackdamageperlevel()*17)*100)/100.0}<br>
											공격속도: ${ChampStats.getAttackspeed()}(+${ChampStats.getAttackspeedperlevel()}) -> ${Math.round((ChampStats.getAttackspeed()+ChampStats.getAttackspeedperlevel()*17)*100)/100.0}<br>
											치명타: ${ChampStats.getCrit()}(+${ChampStats.getCritperlevel()}) -> ${Math.round((ChampStats.getCrit()+ChampStats.getCritperlevel()*17)*100)/100.0}<br>
											방어력: ${ChampStats.getArmor()}(+${ChampStats.getArmorperlevel()}) -> ${Math.round((ChampStats.getArmor()+ChampStats.getArmorperlevel()*17)*100)/100.0}<br>
											마법저항력: ${ChampStats.getSpellblock()}(+${ChampStats.getSpellblockperlevel()}) -> ${Math.round((ChampStats.getSpellblock()+ChampStats.getSpellblockperlevel()*17)*100)/100.0}<br>
											사거리: ${ChampStats.getAttackrange()}(-) -> ${ChampStats.getAttackrange()}<br>
											이동속도: ${ChampStats.getMovespeed()}(-) -> ${ChampStats.getMovespeed()}
											</td>
											</tr>
											<tr>
											<td>
<%-- 											<c:forEach items='${ChampSkins}' var="row" varStatus="status">
											<c:choose>
											<c:when test='${status.index == 0}'>
												<a href="#">기본</a><img src='${pageContext.request.contextPath}/images/champion/splash/${ChampInfo.get("id")}_${status.index}.jpg' height="128" width="148" align="left" style="padding-right: 20px;">
											</c:when>
												<c:otherwise>
												<a href="#">${row.getName()}</a><img src='${pageContext.request.contextPath}/images/champion/splash/${ChampInfo.get("id")}_${status.index}.jpg' height="128" width="148" align="left" style="padding-right: 20px;">
												</c:otherwise>
											</c:choose>
											</c:forEach> --%>
											</td>
											</tr>
											</table>
											<div ng-app="ChampInfo">
											<table border="1">
											<tr>
											<td width="320"><img src='${pageContext.request.contextPath}/images/passive/${Passive.getImage().getFull()}' align="left" style="padding-right: 10px;">
											${Passive.getName()}</td>
											<td>${Passive.getDescription()}</td>
											</tr>
											</table>
											
											<div ng-controller="spellQ">
											<table border="1">
											<tr>
											<td width="320"><img src='${pageContext.request.contextPath}/images/spell/${SpellQ.getImage().getFull()}' align="left" style="padding-right: 10px;">
											
											스킬명: ${SpellQ.getName()}<br>
											재사용대기시간: ${SpellQ.getCooldownBurn()}<br>
											소모: ${SpellQ.getCostBurn()}<br>
											범위: ${SpellQ.getRangeBurn()}<br>
											</td>
											<td>${SpellQ.getTooltip()}</td>
											</tr>
											</table>
											</div>
											
											<div ng-controller="spellW">
											<table border="1">
											<tr>
											<td width="320"><img src='${pageContext.request.contextPath}/images/spell/${SpellW.getImage().getFull()}' align="left" style="padding-right: 10px;">
											스킬명: ${SpellW.getName()}<br>
											재사용대기시간: ${SpellW.getCooldownBurn()}<br>
											소모: ${SpellW.getCostBurn()}<br>
											범위: ${SpellW.getRangeBurn()}<br>
											</td>
											<td>${SpellW.getTooltip()}</td>
											</tr>
											</table>
											</div>
											
											<div ng-controller="spellE">
											<table border="1">
											<tr>
											<td width="320"><img src='${pageContext.request.contextPath}/images/spell/${SpellE.getImage().getFull()}' align="left" style="padding-right: 10px;">
											스킬명: ${SpellE.getName()}<br>
											재사용대기시간: ${SpellE.getCooldownBurn()}<br>
											소모: ${SpellE.getCostBurn()}<br>
											범위: ${SpellE.getRangeBurn()}<br>
											</td>
											<td>${SpellE.getTooltip()}</td>
											</tr>
											</table>
											</div>
											
											<div ng-controller="spellR">
											<table border="1">
											<tr>
											<td width="320"><img src='${pageContext.request.contextPath}/images/spell/${SpellR.getImage().getFull()}' align="left" style="padding-right: 10px;">
											스킬명: ${SpellR.getName()}<br>
											재사용대기시간: ${SpellR.getCooldownBurn()}<br>
											소모: ${SpellR.getCostBurn()}<br>
											범위: ${SpellR.getRangeBurn()}<br>
											</td>
											<td>${SpellR.getTooltip()}</td>
											</tr>
											</table>
											</div>
										</div>
										</div>
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