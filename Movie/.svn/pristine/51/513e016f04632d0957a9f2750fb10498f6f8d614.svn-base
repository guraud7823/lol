<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
	
	function registUser(){
		var frm = document.getElementById("frm");
		var obj = new Object(); 
		obj.id = frm.id.value;
		obj.pw = frm.pw.value;
		obj.name = frm.name.value;
		obj.phone = frm.phone.value;
		obj.address = frm.address.value;
		obj.email = frm.email.value;
		var jsondata = JSON.stringify(obj); 
		if(frm.id.value == null || frm.id.value == "")
			return alert("아이디 체크 또는 아이디를 입력해주세요");
		if(frm.pw.value == null || frm.pw.value == "")
			return alert("비밀번호를 입력해주세요");
		if(frm.name.value == null || frm.name.value == "")
			return alert("이름을 입력해주세요");
		
		$.ajax({
			url: "/movie/lol/register.ajax",
			type: "POST",
			dataType: "JSON",
			async:false,
			data:"ajaxdata="+jsondata,
			success: function(data, status) {
				alert("회원가입되었습니다. \n가입한 아이디로 로그인해주세요");
				Link('main');
			},
			error: function (){
				alert("error");
			}
		});
	}
	
	function registIdCheck(){
		var frm = document.getElementById("frm");
		var obj = new Object(); 
		obj.idchk = frm.idchk.value;
		var jsondata = JSON.stringify(obj); 
		if(frm.idchk.value == null || frm.idchk.value == "")
			return alert("정보를 입력하세요");
        $.ajax({
			url: "/movie/lol/registerchk.ajax",
			type: "POST",
			dataType: "JSON",
			async:false,
			data:"ajaxdata="+jsondata,
			success: function(data, status) {
				if(data.idcheck ==0){
					alert("사용가능한 아이디 입니다");
					frm.idchk.disabled =true;
					frm.id.value = frm.idchk.value;
				}
				else{
					alert("사용중인 아이디 입니다");
				}
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
			<!-- Header -->
			<%@ include file="../../jspf/header.jspf" %> 

			<!-- Main -->
				<div id="main-wrapper">
					<div class="container">
						<div id="content">
							<!-- Content -->
								<article style="margin-right: 200px; margin-left: 200px;">

									<h2 align="center">회원가입</h2>

									<table border="1">
									<colgroup>
									<col width="150px">
									<col>
									</colgroup>
									<tbody>
									<tr>
									<td>아이디:</td>
									<td>
										<input type="hidden" name="id" id="id">
										<input type="text" name="idchk" id="idchk" style="width:200px; height:40px; display:inline;">
										&nbsp;<input type ="button" value="중복체크" onclick='javascript:registIdCheck()' style="padding: 0px 5px; font-size:12px; height:30px">
									</td>
									</tr>
									<tr>
									<td>비밀번호:</td>
									<td><input type="password" name="pw" id="pw" style="width:200px; height:40px; display:inline;"></td>
									</tr>
									<tr>
									<td>이름:</td>
									<td><input type="text" name="name" id="name" style="width:200px; height:40px; display:inline;"></td>
									</tr>
									<tr>
									<td>전화번호:</td>
									<td><input type="text" name="phone" id="phone" style="width:200px; height:40px; display:inline;"></td>
									</tr>
									<tr>
									<td>주소:</td>
									<td><input type="text" name="address"  id="address" style="width:600px; height:40px; display:inline;"></td>
									</tr>
									<tr>
									<td>이메일:</td>
									<td><input type="text" name="email" id="email" style="width:400px; height:40px; display:inline;"></td>
									</tr>
									<tr><td colspan="2" align="center"><input type="button" value="등록" onclick='javascript:registUser()'></td></tr>
									</tbody>
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