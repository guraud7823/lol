<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.io.BufferedReader" %>
<%@ page import="java.io.InputStreamReader" %>
<%@ page import="java.net.HttpURLConnection" %>
<%@ page import="java.net.URL" %>
<%@ page import="java.net.URLEncoder" %>
<%@ page import="movie.common.dao.UserDao" %>
<%@ page import="movie.common.bean.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
String clientId = "YOUR_CLIENT_ID";//애플리케이션 클라이언트 아이디값";
String clientSecret = "YOUR_CLIENT_SECRET";//애플리케이션 클라이언트 시크릿값";
try {
    String text = URLEncoder.encode("azury%20haru", "UTF-8");
    String apiKey = URLEncoder.encode("RGAPI-61ba0189-3fd0-4afc-8a8f-8769c9a8f526", "UTF-8");
    String apiURL = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/azury%20haru?api_key=RGAPI-61ba0189-3fd0-4afc-8a8f-8769c9a8f526"; // json 결과
    //String apiURL = "https://openapi.naver.com/v1/search/blog.xml?query="+ text; // xml 결과
    URL url = new URL(apiURL);
    HttpURLConnection con = (HttpURLConnection)url.openConnection();
    con.setRequestMethod("GET");
    con.setRequestProperty("X-Naver-Client-Id", clientId);
    con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
    int responseCode = con.getResponseCode();
    BufferedReader br;
    if(responseCode==200) { // 정상 호출
        br = new BufferedReader(new InputStreamReader(con.getInputStream()));
    } else {  // 에러 발생
        br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
    }
    String inputLine;
    StringBuffer response2 = new StringBuffer();
    while ((inputLine = br.readLine()) != null) {
        %>
        <h1><%=response2.append(inputLine) %></h1>
        <%
    }
    br.close();
} catch (Exception e) {
    System.out.println(e);
}
%>

<%
//UserDao dao = new UserDao();
//User user = new User();
//user.setId("whiteship");
//user.setName("백기선");
//user.setPassword("married");

//dao.add(user);

//User user2 = dao.get("whiteship");
%>
<%-- <h1>이름: <%=user2.getName() %></h1>
<h1>비번: <%=user2.getPassword() %></h1>
<h1>이름: <%=user2.getId() %> 조회성공!!</h1>
 --%>
<form id="test">
	<input type="text" id="sumonner"></input>
	<a href="#">검색</a>
</form>
</body>
</html>