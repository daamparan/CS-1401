import java.util.Scanner;

public class Lab1 {
	/*METHOD NAME:printArr | RETURN TYPE: Void | PARAMETERS: String[][]
	 * Description: Will simply print out the array
	 */
	public static void printArr(String[][] theGrid) {
		for(int i=0;i<theGrid.length;i++) {
			for(int j=0;j<theGrid[i].length;j++) {
				//here we copy the thing 
				System.out.print(theGrid[i][j]+" | ");
			}
			System.out.println("");
			System.out.println("-----------------------------------");
			//System.out.println("");
		}
	}
	/*Method Name: intitalGrid Return: String[][] Parameters: None
	 * Description:will intialize the grid and return the array with the 
	 * items filled in alreadyy
	 */
	public static String[][] intialGrid(){
		String theMap[][]=new String[9][9];
		//String letRows="ABCDEFGHI";
		for(int i=0;i<theMap.length;i++) {
			for(int j=0;j<theMap[i].length;j++) {
				//here we copy the thing 
				//theMap[i][j]=letRows.charAt(i)+Integer.toString(j);
				theMap[i][j]="0";
				//System.out.print(theMap[i][j]);
			}
			//System.out.println();
		}
		
		return theMap;
	}
	/*METHOD NAME:userRequest | RETURN TYPE:String | PARAMETERS:none
	 * This method will request for the user to input the desired area
	 * it will then return the numbers, the method will hopefully work with all 
	 * possible inputs (IN THE INSTRUCTIONS)
	 */
	public static String userRequest(String userAns) {
		//here we try to find the things that match the letters and numbers
		String letRows="ABCDEFGHI";
		String letColumns="012345678";
		//System.out.print(theSquare);
		//here we will test out for finding the letters a-i or 0-8
		String theSquare="";
		String possChar;
		for(int i=0;i<userAns.length();i++) {
			possChar=Character.toString(userAns.charAt(i));
			if(letRows.contains(possChar)){
				theSquare=theSquare.concat(possChar);
				}
			else if(letColumns.contains(possChar)) {
				theSquare=theSquare.concat(possChar);
			}
		}
			
		//System.out.println(theSquare);
		
		return theSquare;
	}
	/*
	 * Method Name: adjSquares | Return Type void | Parameters: theSquare
	 * Functionality: Will 
	 */
	public static void adjSquares(String theSquare,String[][] theGrid) {
		//first must convert to numbers like in the upfate method 
		String letRows="ABCDEFGHI";
		String letColumns="012345678";
		//we first convert to number if letters are present
		int [] toPlot= {10,10};
		for(int i=0;i<letRows.length();i++) {
			if(theSquare.charAt(0)==letRows.charAt(i)) {
				toPlot[0]=i;
			}
		}
		//this means there was no letter present and string coor was two numbers
		if(toPlot[0]==10) {
			toPlot[0]=Integer.parseInt(String.valueOf(theSquare.charAt(0)));
		}
		toPlot[1]=Integer.parseInt(String.valueOf(theSquare.charAt(1)));
		
		//now here we plot the edges and corners keep in mind we will have special cases 
		//Corners
		if (toPlot[0]==0 && toPlot[1]==0) {//our first corner
			int [] corner= {toPlot[0],toPlot[1]};
			corner[0]=corner[0]+1;
			corEdge(theGrid,corner,0);
			corner[1]=corner[1]+1;
			corEdge(theGrid,corner,1);
			corner[0]=corner[0]-1;
			corEdge(theGrid,corner,0);
		}
		else if(toPlot[0]==8 && toPlot[1]==8) {
			int [] corner= {toPlot[0],toPlot[1]};
			corner[0]=corner[0]-1;
			corEdge(theGrid,corner,0);
			corner[1]=corner[1]-1;
			corEdge(theGrid,corner,1);
			corner[0]=corner[0]+1;
			corEdge(theGrid,corner,0);
			
		}
		else if(toPlot[0]==0 && toPlot[1]==8) {
			int [] corner= {toPlot[0],toPlot[1]};
			corner[0]=corner[0]+1;
			corEdge(theGrid,corner,0);
			corner[1]=corner[1]-1;
			corEdge(theGrid,corner,1);
			corner[0]=corner[0]-1;
			corEdge(theGrid,corner,0);
		}
		else if(toPlot[0]==8 && toPlot[1]==0) {
			int [] corner= {toPlot[0],toPlot[1]};
			corner[0]=corner[0]-1;
			corEdge(theGrid,corner,0);
			corner[1]=corner[1]+1;
			corEdge(theGrid,corner,1);
			corner[0]=corner[0]+1;
			corEdge(theGrid,corner,0);
		}
		else {//finally we are at the general statements all other squares
			int [][] listSquares=new int[8][2];//there is 8 possible corners and edges
			int [] square={toPlot[0],toPlot[1]};
			//first we do all edges
			//top
			listSquares[0][0]=square[0]-1;
			listSquares[0][1]=square[1];
			//left
			listSquares[1][0]=square[0];
			listSquares[1][1]=square[1]-1;
			//right
			listSquares[2][0]=square[0];
			listSquares[2][1]=square[1]+1;
			//bottom
			listSquares[3][0]=square[0]+1;
			listSquares[3][1]=square[1];
			//now we do corners
			//right tp corner
			listSquares[4][0]=square[0]-1;
			listSquares[4][1]=square[1]+1;
			//left tp corner
			listSquares[5][0]=square[0]-1;
			listSquares[5][1]=square[1]-1;
			//bottom left
			listSquares[6][0]=square[0]+1;
			listSquares[6][1]=square[1]-1;
			//bottom right
			listSquares[7][0]=square[0]+1;
			listSquares[7][1]=square[1]+1;
			
			for(int i=0;i<listSquares.length;i++) {
				//this seperates the edges and corners 
				if(listSquares[i][0]>=0 && listSquares[i][1]>=0){
					if(listSquares[i][0]<8 && listSquares[i][1]<8) {
						if(i<4) {
							corEdge(theGrid,listSquares[i],0);
						}
						//after 5 we have all corners
						else {
							corEdge(theGrid,listSquares[i],1);
						}
					}
				}	
			}
		}
	}
	/*METHOD NAME: printLists | RETURN TYPE: void | PARAMETERS: theGrid
	 * Functionality: Will print out the required lists for the items
	 * requested
	 */
	/*public static void printLists(String[][] theGrid,String userAns,String templateAns) {
		//userAns can be a template, need to find where the letters or num are
		String letRows="ABCDEFGHI";
		String letColumns="012345678";
		boolean hasLetter=false;
		int indexLetter=10;
		for(int i=0;i<templateAns.length();i++) {
			if(letColumns.contains(Character.toString(templateAns.charAt(i)))) {
				hasLetter=true;
				indexLetter=i;
			}
		} 
		if(hasLetter==true) {
			//here we will replace print out the things based on the template
			//System.out.println(templateAns);
			String toPrint="";
			char letterUsed=templateAns.charAt(indexLetter);

			//print the lists
			for(int j=0;j<theGrid.length;j++) {
				for(int k=0;k<theGrid[j].length;k++) {
					if(theGrid[j][k].equals("0")) {
						//here we copy the template then replace the chars with the new ones
						toPrint=templateAns;
						toPrint=toPrint.replace(letterUsed, letRows.charAt(j));
						toPrint=toPrint.replace(toPrint.charAt(1), letColumns.charAt(k));
						System.out.print(toPrint+", ");
					}
				}
			}
		}
	}
	/*Method Name: updateGrid | Return Type: void | Parameters: coordinates,int letter
	 * Functionality: will update the grid coordinate 
	 */
	public static void updateGrid(String coorGrid,String[][] theGrid) {
		String letRows="ABCDEFGHI";
		String letColumns="012345678";
		//we first convert to number if letters are present
		int [] toPlot= {10,10};
		for(int i=0;i<letRows.length();i++) {
			if(coorGrid.charAt(0)==letRows.charAt(i)) {
				toPlot[0]=i;
			}
		}
		//this means there was no letter present and string coor was two numbers
		if(toPlot[0]==10) {
			toPlot[0]=Integer.parseInt(String.valueOf(coorGrid.charAt(0)));
		}
		toPlot[1]=Integer.parseInt(String.valueOf(coorGrid.charAt(1)));
		//after converting we now plot depending on the letter which will be edge corner or center
		theGrid[toPlot[0]][toPlot[1]]="X";
	}
	/*METHOD NAME: corEdge | REUTRN TYPE: void | PARAMETERS: grid, position, type
	 * Functionality: This will update the corners and edges for the square we aare looking 
	 * for 
	 * grid is the map. position will be the location of that edge or corner
	 * and the type will define what it is
	 */
	public static void corEdge(String[][] theGrid,int[] position, int type) {
		if(type==0) {//0 will define the edge
			theGrid[position[0]][position[1]]="E";
		}
		else {///the number one or anything else will define corners
			theGrid[position[0]][position[1]]="C";
		}
	}
	/*METHOD NAME printList | RETURN TYPE void | PARAMETERS: THEgRID
	 * Functionality: 3 methods that will print out the requested lists
	 *  
	 * 
	 */
	public static void printEdges(String[][] theGrid) {
		//print ot the edges
		int count=0;
		for(int i=0; i<theGrid.length;i++) {
			for(int j=0;j<theGrid.length;j++) {
				//System.out.println(theGrid[i][j]);
				if(theGrid[i][j].contentEquals("E")){
					count++;
					System.out.print("["+i+","+j+"]");
					}
				}
			}
		System.out.println("");
		System.out.println("The Number of total edges is:"+count);
		}
	public static void printCorners(String[][] theGrid) {
		//print ot the coorners
		int count=0;
		for(int i=0; i<theGrid.length;i++) {
			for(int j=0;j<theGrid.length;j++) {
				//System.out.println(theGrid[i][j]);
				if(theGrid[i][j].contentEquals("C")){
					count++;
					System.out.print("["+i+","+j+"]");
					}
				}
			}
		System.out.println("");
		System.out.println("The Number of total corners is:"+count);
	}
	public static void printZeroes(String[][] theGrid) {
		//print ot the zeroes
		int count=0;
		for(int i=0; i<theGrid.length;i++) {
			for(int j=0;j<theGrid.length;j++) {
				//System.out.println(theGrid[i][j]);
				if(theGrid[i][j].contentEquals("0")){
					count++;
					System.out.print("["+i+","+j+"]");
					}
				}
			System.out.println();
			}
		System.out.println("");
		System.out.println("The number of total zeroes is:"+count);
	}
	

	
	public static void main(String[] args) {
		System.out.println("The Grid of Battleship");
		System.out.println("-----------------------");
		Scanner scnr=new Scanner(System.in);
		System.out.println("YOU CAN ENTER INFORMATION IN WHICEVER WAY E.I A1,11,[0,0]");
		System.out.println("Please input the square you would like information for:");
		String userAns=scnr.nextLine();
		
		String finalGrid [][]=intialGrid();
		//printArr(finalGrid);
		String finalAns=userRequest(userAns);
		updateGrid(finalAns,finalGrid);
		adjSquares(finalAns, finalGrid);
		//printLists(finalGrid,finalAns,userAns);
		printEdges(finalGrid);
		System.out.println();
		printCorners(finalGrid);
		System.out.println("");
		printZeroes(finalGrid);
		System.out.println();
		System.out.println("The Grid");
		printArr(finalGrid);	
	}
}
