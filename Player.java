import java.util.ArrayList;
import java.util.*;

public class Player {
	String user_name;
	String user_id;
	int x_coor;
	int y_coor;
	ArrayList<Torpedo> user_torpedos=new ArrayList<Torpedo>(30);
	ArrayList<Ship> user_ships=new ArrayList<Ship>(6);
	
	
	//methods
	//throw torpedo method
	public void throwTorp() {
		//select the coordinates
		Scanner scnr=new Scanner(System.in);
		System.out.println("Enter Coordinates");
		int x_coor=scnr.nextInt();
		int y_coor=scnr.nextInt();
		//fire torpedo
	}
	
	public void addShip() {
		user_ships.add(new Ship());
	}
	public void removeShip() {
		Random rand=new Random();
		int toRemove=rand.nextInt(5);
		user_ships.remove(toRemove);
	}
	public void addTorpedo() {
		user_torpedos.add(new Torpedo());
	}
	public void removeTorpedo() {
		Random rand=new Random();
		user_torpedos.remove(user_torpedos.get(rand.nextInt(30)));
	}
	
	
}
