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


/******************************************************************************
Insert 2 test cases, which represent program input/output for two different
combinations of inputs. You may literally copy and paste your console contents,
but your two test cases should be DIFFERENT from any test cases given in the
Project description itself.

------------
Test Case 1:
------------
Brandon Watanabe
Project 5

---------------  Welcome to Battleship!  ---------------
r\c	0	1	2	3	4	5	6
0	-	-	-	-	-	-	-
1	-	-	-	-	-	-	-
2	-	-	-	-	-	-	-
3	-	-	-	-	-	-	-
4	-	-	-	-	-	-	-
5	-	-	-	-	-	-	-
6	-	-	-	-	-	-	-
Please enter coordinates for ship of length 2:
Starting Row (0-6):
0
Starting Column (0-6)
0
From the starting point, extend down or right? (d/r):
d
r\c	0	1	2	3	4	5	6
0	S	-	-	-	-	-	-
1	S	-	-	-	-	-	-
2	-	-	-	-	-	-	-
3	-	-	-	-	-	-	-
4	-	-	-	-	-	-	-
5	-	-	-	-	-	-	-
6	-	-	-	-	-	-	-
Please enter coordinates for ship of length 3:
Starting Row (0-6):
2
Starting Column (0-6)
0
From the starting point, extend down or right? (d/r):
d
r\c	0	1	2	3	4	5	6
0	S	-	-	-	-	-	-
1	S	-	-	-	-	-	-
2	S	-	-	-	-	-	-
3	S	-	-	-	-	-	-
4	S	-	-	-	-	-	-
5	-	-	-	-	-	-	-
6	-	-	-	-	-	-	-
Please enter coordinates for ship of length 4:
Starting Row (0-6):
0
Starting Column (0-6)
1
From the starting point, extend down or right? (d/r):
r
r\c	0	1	2	3	4	5	6
0	S	S	S	S	S	-	-
1	S	-	-	-	-	-	-
2	S	-	-	-	-	-	-
3	S	-	-	-	-	-	-
4	S	-	-	-	-	-	-
5	-	-	-	-	-	-	-
6	-	-	-	-	-	-	-
Here's the final game grid... press Enter to begin playing!











---------------  Begin!  ---------------

r\c	0	1	2	3	4	5	6
0	-	-	-	-	-	-	-
1	-	-	-	-	-	-	-
2	-	-	-	-	-	-	-
3	-	-	-	-	-	-	-
4	-	-	-	-	-	-	-
5	-	-	-	-	-	-	-
6	-	-	-	-	-	-	-
------------------------------------------------------------------
Guess number 1...
Guess a row (0-6):
0
Guess a column (0-6):
0
HIT!

r\c	0	1	2	3	4	5	6
0	X	-	-	-	-	-	-
1	-	-	-	-	-	-	-
2	-	-	-	-	-	-	-
3	-	-	-	-	-	-	-
4	-	-	-	-	-	-	-
5	-	-	-	-	-	-	-
6	-	-	-	-	-	-	-
Guess number 2...
Guess a row (0-6):
0
Guess a column (0-6):
0
r\c=0\0 has already been guessed 1 time
Guess number 3...
Guess a row (0-6):
1
Guess a column (0-6):
0
HIT!

r\c	0	1	2	3	4	5	6
0	X	-	-	-	-	-	-
1	X	-	-	-	-	-	-
2	-	-	-	-	-	-	-
3	-	-	-	-	-	-	-
4	-	-	-	-	-	-	-
5	-	-	-	-	-	-	-
6	-	-	-	-	-	-	-
Guess number 4...
Guess a row (0-6):
2
Guess a column (0-6):
0
HIT!

r\c	0	1	2	3	4	5	6
0	X	-	-	-	-	-	-
1	X	-	-	-	-	-	-
2	X	-	-	-	-	-	-
3	-	-	-	-	-	-	-
4	-	-	-	-	-	-	-
5	-	-	-	-	-	-	-
6	-	-	-	-	-	-	-
Guess number 5...
Guess a row (0-6):
3
Guess a column (0-6):
0
HIT!

r\c	0	1	2	3	4	5	6
0	X	-	-	-	-	-	-
1	X	-	-	-	-	-	-
2	X	-	-	-	-	-	-
3	X	-	-	-	-	-	-
4	-	-	-	-	-	-	-
5	-	-	-	-	-	-	-
6	-	-	-	-	-	-	-
Guess number 6...
Guess a row (0-6):
4
Guess a column (0-6):
0
HIT!

r\c	0	1	2	3	4	5	6
0	X	-	-	-	-	-	-
1	X	-	-	-	-	-	-
2	X	-	-	-	-	-	-
3	X	-	-	-	-	-	-
4	X	-	-	-	-	-	-
5	-	-	-	-	-	-	-
6	-	-	-	-	-	-	-
Guess number 7...
Guess a row (0-6):
5
Guess a column (0-6):
0
MISS!

r\c	0	1	2	3	4	5	6
0	X	-	-	-	-	-	-
1	X	-	-	-	-	-	-
2	X	-	-	-	-	-	-
3	X	-	-	-	-	-	-
4	X	-	-	-	-	-	-
5	m	-	-	-	-	-	-
6	-	-	-	-	-	-	-
Guess number 8...
Guess a row (0-6):
01
Guess a column (0-6):
1
MISS!

r\c	0	1	2	3	4	5	6
0	X	-	-	-	-	-	-
1	X	m	-	-	-	-	-
2	X	-	-	-	-	-	-
3	X	-	-	-	-	-	-
4	X	-	-	-	-	-	-
5	m	-	-	-	-	-	-
6	-	-	-	-	-	-	-
Guess number 9...
Guess a row (0-6):
0
Guess a column (0-6):
1
HIT!

r\c	0	1	2	3	4	5	6
0	X	X	-	-	-	-	-
1	X	m	-	-	-	-	-
2	X	-	-	-	-	-	-
3	X	-	-	-	-	-	-
4	X	-	-	-	-	-	-
5	m	-	-	-	-	-	-
6	-	-	-	-	-	-	-
Guess number 10...
Guess a row (0-6):
0
Guess a column (0-6):
2
HIT!

r\c	0	1	2	3	4	5	6
0	X	X	X	-	-	-	-
1	X	m	-	-	-	-	-
2	X	-	-	-	-	-	-
3	X	-	-	-	-	-	-
4	X	-	-	-	-	-	-
5	m	-	-	-	-	-	-
6	-	-	-	-	-	-	-
Guess number 11...
Guess a row (0-6):
0
Guess a column (0-6):
3
HIT!

r\c	0	1	2	3	4	5	6
0	X	X	X	X	-	-	-
1	X	m	-	-	-	-	-
2	X	-	-	-	-	-	-
3	X	-	-	-	-	-	-
4	X	-	-	-	-	-	-
5	m	-	-	-	-	-	-
6	-	-	-	-	-	-	-
Guess number 12...
Guess a row (0-6):
0
Guess a column (0-6):
4
HIT!

r\c	0	1	2	3	4	5	6
0	X	X	X	X	X	-	-
1	X	m	-	-	-	-	-
2	X	-	-	-	-	-	-
3	X	-	-	-	-	-	-
4	X	-	-	-	-	-	-
5	m	-	-	-	-	-	-
6	-	-	-	-	-	-	-
Congratulations, you've sunk all the battleships!
You made a total of 12 guesses, listed as follows:
Guess   | Row   Col
-------------------------
1	| 0	0
2	| 0	0
3	| 1	0
4	| 2	0
5	| 3	0
6	| 4	0
7	| 5	0
8	| 1	1
9	| 0	1
10	| 0	2
11	| 0	3
12	| 0	4
Thanks for playing! Goodbye.


------------
Test Case 2:
------------
Brandon Watanabe
Project 5

---------------  Welcome to Battleship!  ---------------
r\c	0	1	2	3	4	5	6
0	-	-	-	-	-	-	-
1	-	-	-	-	-	-	-
2	-	-	-	-	-	-	-
3	-	-	-	-	-	-	-
4	-	-	-	-	-	-	-
5	-	-	-	-	-	-	-
6	-	-	-	-	-	-	-
Please enter coordinates for ship of length 2:
Starting Row (0-6):
5
Starting Column (0-6)
5
From the starting point, extend down or right? (d/r):
d
r\c	0	1	2	3	4	5	6
0	-	-	-	-	-	-	-
1	-	-	-	-	-	-	-
2	-	-	-	-	-	-	-
3	-	-	-	-	-	-	-
4	-	-	-	-	-	-	-
5	-	-	-	-	-	S	-
6	-	-	-	-	-	S	-
Please enter coordinates for ship of length 3:
Starting Row (0-6):
6
Starting Column (0-6)
0
From the starting point, extend down or right? (d/r):
r
r\c	0	1	2	3	4	5	6
0	-	-	-	-	-	-	-
1	-	-	-	-	-	-	-
2	-	-	-	-	-	-	-
3	-	-	-	-	-	-	-
4	-	-	-	-	-	-	-
5	-	-	-	-	-	S	-
6	S	S	S	-	-	S	-
Please enter coordinates for ship of length 4:
Starting Row (0-6):
5
Starting Column (0-6)
0
From the starting point, extend down or right? (d/r):
r
r\c	0	1	2	3	4	5	6
0	-	-	-	-	-	-	-
1	-	-	-	-	-	-	-
2	-	-	-	-	-	-	-
3	-	-	-	-	-	-	-
4	-	-	-	-	-	-	-
5	S	S	S	S	-	S	-
6	S	S	S	-	-	S	-
Here's the final game grid... press Enter to begin playing!











---------------  Begin!  ---------------

r\c	0	1	2	3	4	5	6
0	-	-	-	-	-	-	-
1	-	-	-	-	-	-	-
2	-	-	-	-	-	-	-
3	-	-	-	-	-	-	-
4	-	-	-	-	-	-	-
5	-	-	-	-	-	-	-
6	-	-	-	-	-	-	-
------------------------------------------------------------------
Guess number 1...
Guess a row (0-6):
5
Guess a column (0-6):
0
HIT!

r\c	0	1	2	3	4	5	6
0	-	-	-	-	-	-	-
1	-	-	-	-	-	-	-
2	-	-	-	-	-	-	-
3	-	-	-	-	-	-	-
4	-	-	-	-	-	-	-
5	X	-	-	-	-	-	-
6	-	-	-	-	-	-	-
Guess number 2...
Guess a row (0-6):
5
Guess a column (0-6):
0
r\c=5\0 has already been guessed 1 time
Guess number 3...
Guess a row (0-6):
5
Guess a column (0-6):
1
HIT!

r\c	0	1	2	3	4	5	6
0	-	-	-	-	-	-	-
1	-	-	-	-	-	-	-
2	-	-	-	-	-	-	-
3	-	-	-	-	-	-	-
4	-	-	-	-	-	-	-
5	X	X	-	-	-	-	-
6	-	-	-	-	-	-	-
Guess number 4...
Guess a row (0-6):
5
Guess a column (0-6):
2
HIT!

r\c	0	1	2	3	4	5	6
0	-	-	-	-	-	-	-
1	-	-	-	-	-	-	-
2	-	-	-	-	-	-	-
3	-	-	-	-	-	-	-
4	-	-	-	-	-	-	-
5	X	X	X	-	-	-	-
6	-	-	-	-	-	-	-
Guess number 5...
Guess a row (0-6):
5
Guess a column (0-6):
3
HIT!

r\c	0	1	2	3	4	5	6
0	-	-	-	-	-	-	-
1	-	-	-	-	-	-	-
2	-	-	-	-	-	-	-
3	-	-	-	-	-	-	-
4	-	-	-	-	-	-	-
5	X	X	X	X	-	-	-
6	-	-	-	-	-	-	-
Guess number 6...
Guess a row (0-6):
5
Guess a column (0-6):
4
MISS!

r\c	0	1	2	3	4	5	6
0	-	-	-	-	-	-	-
1	-	-	-	-	-	-	-
2	-	-	-	-	-	-	-
3	-	-	-	-	-	-	-
4	-	-	-	-	-	-	-
5	X	X	X	X	m	-	-
6	-	-	-	-	-	-	-
Guess number 7...
Guess a row (0-6):
6
Guess a column (0-6):
0
HIT!

r\c	0	1	2	3	4	5	6
0	-	-	-	-	-	-	-
1	-	-	-	-	-	-	-
2	-	-	-	-	-	-	-
3	-	-	-	-	-	-	-
4	-	-	-	-	-	-	-
5	X	X	X	X	m	-	-
6	X	-	-	-	-	-	-
Guess number 8...
Guess a row (0-6):
6
Guess a column (0-6):
1
HIT!

r\c	0	1	2	3	4	5	6
0	-	-	-	-	-	-	-
1	-	-	-	-	-	-	-
2	-	-	-	-	-	-	-
3	-	-	-	-	-	-	-
4	-	-	-	-	-	-	-
5	X	X	X	X	m	-	-
6	X	X	-	-	-	-	-
Guess number 9...
Guess a row (0-6):
6
Guess a column (0-6):
2
HIT!

r\c	0	1	2	3	4	5	6
0	-	-	-	-	-	-	-
1	-	-	-	-	-	-	-
2	-	-	-	-	-	-	-
3	-	-	-	-	-	-	-
4	-	-	-	-	-	-	-
5	X	X	X	X	m	-	-
6	X	X	X	-	-	-	-
Guess number 10...
Guess a row (0-6):
6
Guess a column (0-6):
3
MISS!

r\c	0	1	2	3	4	5	6
0	-	-	-	-	-	-	-
1	-	-	-	-	-	-	-
2	-	-	-	-	-	-	-
3	-	-	-	-	-	-	-
4	-	-	-	-	-	-	-
5	X	X	X	X	m	-	-
6	X	X	X	m	-	-	-
Guess number 11...
Guess a row (0-6):
6
Guess a column (0-6):
5
HIT!

r\c	0	1	2	3	4	5	6
0	-	-	-	-	-	-	-
1	-	-	-	-	-	-	-
2	-	-	-	-	-	-	-
3	-	-	-	-	-	-	-
4	-	-	-	-	-	-	-
5	X	X	X	X	m	-	-
6	X	X	X	m	-	X	-
Guess number 12...
Guess a row (0-6):
6
Guess a column (0-6):
6
MISS!

r\c	0	1	2	3	4	5	6
0	-	-	-	-	-	-	-
1	-	-	-	-	-	-	-
2	-	-	-	-	-	-	-
3	-	-	-	-	-	-	-
4	-	-	-	-	-	-	-
5	X	X	X	X	m	-	-
6	X	X	X	m	-	X	m
Guess number 13...
Guess a row (0-6):
5
Guess a column (0-6):
5
HIT!

r\c	0	1	2	3	4	5	6
0	-	-	-	-	-	-	-
1	-	-	-	-	-	-	-
2	-	-	-	-	-	-	-
3	-	-	-	-	-	-	-
4	-	-	-	-	-	-	-
5	X	X	X	X	m	X	-
6	X	X	X	m	-	X	m
Congratulations, you've sunk all the battleships!
You made a total of 13 guesses, listed as follows:
Guess   | Row   Col
-------------------------
1	| 5	0
2	| 5	0
3	| 5	1
4	| 5	2
5	| 5	3
6	| 5	4
7	| 6	0
8	| 6	1
9	| 6	2
10	| 6	3
11	| 6	5
12	| 6	6
13	| 5	5
Thanks for playing! Goodbye.

 ******************************************************************************/