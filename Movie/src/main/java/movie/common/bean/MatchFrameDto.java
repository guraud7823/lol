package movie.common.bean;

import java.util.ArrayList;
import java.util.HashMap;

public class MatchFrameDto {
	private long timestamp;
	private HashMap<String, MatchParticipantFrameDto> participantFrames = new HashMap();
	private ArrayList<MatchEventDto> events = new ArrayList();
}
