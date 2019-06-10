package movie.common.bean;

import java.util.ArrayList;

public class FeaturedGames {
	private long clientRefreshInterval; // The suggested interval to wait before requesting FeaturedGames again  
	private ArrayList<FeaturedGameInfo> gameList = new ArrayList(); // The list of featured games  
}
