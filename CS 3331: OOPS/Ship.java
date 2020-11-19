import java.util.*;

public class Ship {
	//attributes
	int ship_size;
	int [] coor;
	int ship_value;
	
	//constructors
	public Ship() {
		Random rand=new Random(5);
		ship_size=rand.nextInt();
		ship_value=rand.nextInt();
	}
	
	//methods
	public boolean isValid(int[] shipLoc/*,the map*/ ) {
		return true; 
	}

}
