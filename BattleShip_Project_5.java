import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* CS 125 - Intro to Computer Science II
 * File Name: CS125_Project5.java
 * Project 5 - Due 4/14/2019
 * Instructor: Dr. Dan Grissom
 * 
 * Name: Brandon Watanabe
 * Description: Making Battleship in Java using 2D arrays, arraylists, and maps.
 */

public class CS125_Project5
{
	// 2D array of the game board
	public static String[][] grid = new String[7][7];
	public static String[][] board = new String[7][7];
	public static Map<String, String> history = new HashMap<String, String>();

	// add guesses to array list
	public static ArrayList<String> guesses = new ArrayList<String>();

	// add the rows and columns to array list
	public static ArrayList<String> rowCol = new ArrayList<String>();

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		// Your program should always output your name and the project number.
		// DO NOT DELETE OR COMMENT OUT. Replace with relevant info.
		System.out.println("Brandon Watanabe");
		System.out.println("Project 5");
		System.out.println("");

		// Your code should go below this line
		int srtRw;
		int srtCo;
		int row;
		int col;
		int guess = 0;
		String extend;
		int i;
		int j; 
		int alive = 0;
		int guessed = 0;
		boolean yeet = true;
		boolean oof = true;
		// print out the game board
		System.out.println("---------------  Welcome to Battleship!  ---------------");

		// prints top row of column numbers
		System.out.println("r\\c\t0\t1\t2\t3\t4\t5\t6"); 

		// reads/prints in the 2D array with "-" and prints array
		for (i = 0; i < 7; i++) {
			System.out.print(i);
			for(j = 0; j < 7; j++) {
				grid[i][j] = "\t-";
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}

		// Prompts user to insert ships on board of length 2
		do { 
			System.out.println("Please enter coordinates for ship of length 2:");
			System.out.println("Starting Row (0-6):");
			srtRw = sc.nextInt();
			System.out.println("Starting Column (0-6)");
			srtCo = sc.nextInt();
			grid[srtRw][srtCo] = "\tS";
			System.out.println("From the starting point, extend down or right? (d/r):");
			extend = sc.next();

			// if user chooses to place ship vertically down
			if (extend.equalsIgnoreCase("d")) {
				grid[srtRw+1][srtCo] = "\tS";
				// prints top row of column numbers
				System.out.println("r\\c\t0\t1\t2\t3\t4\t5\t6");
				// reads in the 2D array with "-" and prints array
				for (i = 0; i < 7; i++) {
					System.out.print(i);
					for(j = 0; j < 7; j++) {
						System.out.print(grid[i][j]);
					}
					System.out.println();
				}
				yeet = false;
			}
			// if user chooses to place the ship horizontally right
			else {
				grid[srtRw][srtCo+1] = "\tS";
				// prints top row of column numbers
				System.out.println("r\\c\t0\t1\t2\t3\t4\t5\t6");
				// reads in the 2D array with "-" and prints array
				for (i = 0; i < 7; i++) {
					System.out.print(i);
					for(j = 0; j < 7; j++) {
						System.out.print(grid[i][j]);
					}
					System.out.println();
				}
				yeet = false;
			}
		} while (yeet);

		// Prompts user to insert ships on board of length 3
		do { 
			System.out.println("Please enter coordinates for ship of length 3:");
			System.out.println("Starting Row (0-6):");
			srtRw = sc.nextInt();
			System.out.println("Starting Column (0-6)");
			srtCo = sc.nextInt();
			grid[srtRw][srtCo] = "\tS";
			System.out.println("From the starting point, extend down or right? (d/r):");
			extend = sc.next();

			// if user chooses to place ship vertically down
			if (extend.equalsIgnoreCase("d")) {
				grid[srtRw+1][srtCo] = "\tS";
				grid[srtRw+2][srtCo] = "\tS";
				// prints top row of column numbers
				System.out.println("r\\c\t0\t1\t2\t3\t4\t5\t6");
				// reads in the 2D array with "-" and prints array
				for (i = 0; i < 7; i++) {
					System.out.print(i);
					for(j = 0; j < 7; j++) {
						System.out.print(grid[i][j]);
					}
					System.out.println();
				}
				yeet = false;
			}
			// if user chooses to place the ship horizontally right
			else {
				grid[srtRw][srtCo+1] = "\tS";
				grid[srtRw][srtCo+2] = "\tS";
				// prints top row of column numbers
				System.out.println("r\\c\t0\t1\t2\t3\t4\t5\t6");
				// reads in the 2D array with "-" and prints array
				for (i = 0; i < 7; i++) {
					System.out.print(i);
					for(j = 0; j < 7; j++) {
						System.out.print(grid[i][j]);
					}
					System.out.println();
				}
				yeet = false;
			}
		} while (yeet);

		// Prompts user to insert ships on board of length 3
		do { 
			System.out.println("Please enter coordinates for ship of length 4:");
			System.out.println("Starting Row (0-6):");
			srtRw = sc.nextInt();
			System.out.println("Starting Column (0-6)");
			srtCo = sc.nextInt();
			grid[srtRw][srtCo] = "\tS";
			System.out.println("From the starting point, extend down or right? (d/r):");
			extend = sc.next();

			// if user chooses to place ship vertically down
			if (extend.equalsIgnoreCase("d")) {
				grid[srtRw+1][srtCo] = "\tS";
				grid[srtRw+2][srtCo] = "\tS";
				grid[srtRw+3][srtCo] = "\tS";
				// prints top row of column numbers
				System.out.println("r\\c\t0\t1\t2\t3\t4\t5\t6");
				// reads in the 2D array with "-" and prints array
				for (i = 0; i < 7; i++) {
					System.out.print(i);
					for(j = 0; j < 7; j++) {
						System.out.print(grid[i][j]);
					}
					System.out.println();
				}
				yeet = false;
			}
			// if user chooses to place the ship horizontally right
			else {
				grid[srtRw][srtCo+1] = "\tS";
				grid[srtRw][srtCo+2] = "\tS";
				grid[srtRw][srtCo+3] = "\tS";
				// prints top row of column numbers
				System.out.println("r\\c\t0\t1\t2\t3\t4\t5\t6");
				// reads in the 2D array with "-" and prints array
				for (i = 0; i < 7; i++) {
					System.out.print(i);
					for(j = 0; j < 7; j++) {
						System.out.print(grid[i][j]);
					}
					System.out.println();
				}
				yeet = false;
			}
		} while (yeet);

		// another user guesses where the ships are
		System.out.println("Here's the final game grid... press Enter to begin playing!");
		String enter = sc.nextLine();

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("---------------  Begin!  ---------------");
		System.out.println();

		// prints top row of column numbers
		System.out.println("r\\c\t0\t1\t2\t3\t4\t5\t6"); 

		// reads in the 2D array with "-" and prints array
		for (i = 0; i < 7; i++) {
			System.out.print(i);
			for(j = 0; j < 7; j++) {
				board[i][j] = "\t-";
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------------------------");

		// prompts user to guess where the ships are
		do {
			guess++;
			System.out.println("Guess number " + guess + "...");
			System.out.println("Guess a row (0-6):");
			row = sc.nextInt();
			System.out.println("Guess a column (0-6):");
			col = sc.nextInt();

			// if ship at particular coordinate has a ship, than shows an "X" on the printed board for hit and if the coordinates was not already guessed
			if (grid[row][col] == "\tS" && !rowCol.contains(row + "\t" + col)) {
				board[row][col] = "\tX";
				System.out.println("HIT!");
				System.out.println();
				// hit counter increases
				alive++;

				// prints top row of column numbers
				System.out.println("r\\c\t0\t1\t2\t3\t4\t5\t6"); 

				// reads in the 2D array with "-" and prints array
				for (i = 0; i < 7; i++) {
					System.out.print(i);
					for(j = 0; j < 7; j++) {
						System.out.print(board[i][j]);
					}
					System.out.println();
				}
			}
			// if row and column coordinates were already guessed then it does not count
			else if (rowCol.contains(row + "\t" + col)) {
				// guessed already counter increases
				guessed++;
				System.out.println("r\\c=" + row + "\\" + col + " has already been guessed " + guessed + " time");
				//rowCol.remove(row + "\t" + col);
				//guesses.remove(guess + "");
				//history.remove(guess + "", row + "\t" + col);
				//guess--;
			}

			// if ship not at particular coordinate has a ship, than shows an "m" on the printed board for miss
			else {
				board[row][col] = "\tm";
				System.out.println("MISS!");
				System.out.println();
				// prints top row of column numbers
				System.out.println("r\\c\t0\t1\t2\t3\t4\t5\t6"); 

				// reads in the 2D array with "-" and prints array
				for (i = 0; i < 7; i++) {
					System.out.print(i);
					for(j = 0; j < 7; j++) {
						System.out.print(board[i][j]);
					}
					System.out.println();
				}
			}

			// add guesses to array list
			guesses.add(guess + "");

			// add the rows and columns to array list
			rowCol.add(row + "\t" + col);

			// adds the guesses and rows and column array lists to the map
			history.put(guess + "", row + "\t" + col);

			// if all ships are sunk (if death count of ships is 9) then game is over
			if (alive > 8) {
				oof = false;
			}

		} while (oof);

		//prints map at game over
		System.out.println("Congratulations, you've sunk all the battleships!");
		System.out.println("You made a total of " + guess + " guesses, listed as follows:");
		System.out.println("Guess   | Row   Col");
		System.out.println("-------------------------");
		//prints the map
// 		for (String g : history.keySet()) {
// 			String rowCol = history.get(g);
// 			System.out.println(g + "\t| " + rowCol);
// 		}
 		
		int p = 0;
		//prints map
		for (String g : rowCol) {
		p++;
			System.out.println(p + "\t| " + g.charAt(0) + "\t" + g.charAt(2));
		}
		System.out.println("Thanks for playing! Goodbye.");
	}
}
