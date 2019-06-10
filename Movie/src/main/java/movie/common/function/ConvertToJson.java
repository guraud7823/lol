package movie.common.function;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConvertToJson {
	private String apikey = "RGAPI-62f8926a-d888-4f0a-9e4c-043ef0478464";
	public ConvertToJson() {
	}
	public String convertJson(String apiUrl) {
	String json = null;
	try {
	    URL url = new URL(apiUrl);
	    HttpURLConnection con = (HttpURLConnection)url.openConnection();
	    con.setRequestMethod("GET");
	    con.setRequestProperty("X-Riot-Token", this.apikey);
	    con.setRequestProperty("Accept-Charset", "application/x-www-form-urlencoded; charset=UTF-8;");

	    int responseCode = con.getResponseCode();
	    BufferedReader br;
	    if(responseCode==200) { // 정상 호출
	        br = new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
	    } else {  // 에러 발생
	        br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
	    }
	    String inputLine;
	    StringBuffer response = new StringBuffer();
	    while ((inputLine = br.readLine()) != null) {
	    	response.append(inputLine);
	    }
	    json = response.toString();
	} catch (Exception e) {
		e.printStackTrace();
	}
	return json;
	}
}
