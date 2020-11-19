import java.time.*;
import java.util.*;

public class Game {
	//attributes
	LocalTime start_time;
	LocalTime end_time;
	String game_type;
	String who_won;
	List<Round> rounds=new ArrayList<Round>();
	
	//constructor
	public Game() {	
		start_time=LocalTime.now();
		end_time=LocalTime.now();
		
	}
	
	public void addRound() {
		rounds.add(new Round());
	}
	public void deleteRound(Round e) {
		rounds.remove(e);
	}
	

}
