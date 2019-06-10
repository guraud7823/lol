package movie.common.function;

import java.util.HashMap;

public class TotalPage {
	public HashMap<String, Integer> getPageInfo(int totalcount, String cellcount, String currentpage) {
		HashMap<String, Integer> result = new HashMap<String, Integer>();
		int totalpage = 0;
		
		if(cellcount == null)
			cellcount = "10";
		if(currentpage == null)
			currentpage = "0";
		
		int cellcountint = Integer.parseInt(cellcount);
		
		if(totalcount/cellcountint == 0 )
			totalpage = totalcount/cellcountint;
		else
			totalpage = totalcount/cellcountint + 1;
		
		result.put("totalpage", totalpage);
		result.put("currentpage",Integer.parseInt(currentpage));
		result.put("cellcount",Integer.parseInt(cellcount));
		return result;
	}
}
