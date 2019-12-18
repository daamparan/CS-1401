import java.util.*;

public class Torpedo {
	int x_coor;
	int y_coor;
	boolean didHit=false;
	
	//constructors 
	public Torpedo() {
		Random rand=new Random();
		x_coor=rand.nextInt(20);
		y_coor=rand.nextInt(20);
	}
	
	//methods
	public void viewResults() {
	
	}
}
