/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokusolver;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author John
 */
public class SudokuSolver {

/**
	 * @param args
	 */
	static long count = 0;
	static boolean[][] cellLocked = new boolean[9][9];

	public static void main(String[] args) {
		byte[][] grid = new byte[9][9];
		try {
                try (BufferedReader read = new BufferedReader(new FileReader("ss1.1.in"))) {
                    int T = Integer.parseInt(read.readLine());

                    String line;
                    for (int iter = 0; iter < T; iter++) {

                            count = 0;
                            for (byte j = 0; j < 9; j++) {
                                    line = read.readLine();
                                    for (byte i = 0; i < 9; i++) {
                                            grid[i][j] = Byte.parseByte(String.valueOf(line
                                                            .charAt(i)));
                                            if (grid[i][j] == 0) {
                                            cellLocked[i][j] = false;
                                        }
                                            else {
                                            cellLocked[i][j] = true;
                                        }

                                    }
                            }
                            System.out.println("\rProblem #" + (iter + 1) + "\r");
                            for (byte j = 0; j < 9; j++) {
                                    for (byte i = 0; i < 9; i++) {

                                            System.out.print(grid[i][j] + " ");

                                    }
                                    System.out.println();
                            }
                            if (solved((byte) 16, (byte) 0, grid)) {
                                    System.out.println("\rSolved after " + count
                                                    + " recursive calls!\r");
                            } else {
                                    System.out.println("\rThis puzzle is unsolvable! (" + count + " recursive calls)\r");
                            }
                            for (byte j = 0; j < 9; j++) {
                                    for (byte i = 0; i < 9; i++) {

                                            System.out.print(grid[i][j] + " ");

                                    }
                                    System.out.println();
                            }

                    }
                }

		} catch (IOException | NumberFormatException e) {
                    System.out.println("oops!");
		}

	}

	public static boolean solved(byte x, byte y, byte[][] grid)

	{
		count++;
		if (y == 8 && x == 8) {
                return true;
            }
		else if (x == 16) {
                x = 0;
            }
		else if (x == 8) {
			x = 0;
			y++;
		} else {
                x++;
            }
		while (cellLocked[x][y]) {
			if(rowOK(x, y, grid) && colOK(x, y, grid) && boxOK(x, y, grid)){
			if (y == 8 && x == 8) {
                                return true;
                            }
			else if (x == 8) {
				x = 0;
				y++;
			} else {
                                x++;
                            }
			}
			else {
                        return false;
                    }
		}

		if (grid[x][y] == 0) {
                grid[x][y]++;
            }
		while (!(rowOK(x, y, grid) && colOK(x, y, grid) && boxOK(x, y, grid) && solved(
				x, y, grid))) {
			if (grid[x][y] < 9) {
                                        grid[x][y]++;
                                    }
			else {
				grid[x][y] = 0;
				return false;
			}
		}
		return true;

	}

	public static boolean rowOK(byte x, byte y, byte[][] grid) {

		// Check row for duplicate number
		for (byte i = 0; i < 9; i++) {
			if (i != x) {
				if (((grid[i][y]) == (grid[x][y])) && grid[i][y] != 0) {
                                return false;
                            }
			}
		}
		return true;
	}

	public static boolean colOK(byte x, byte y, byte[][] grid) {
		// Check column for duplicate number
		for (byte j = 0; j < 9; j++) {
			if (j != y) {
				if (((grid[x][j]) == (grid[x][y])) && grid[x][j] != 0) {
                                return false;
                            }
			}
		}
		return true;
	}

	public static boolean boxOK(byte x, byte y, byte[][] grid) {
		// Check box for duplicate number
		byte boxy = (byte) (Math.floor(y / 3) * 3);
		byte boxx = (byte) (Math.floor(x / 3) * 3);

		for (byte j = boxy; j < boxy + 3; j++) {
			for (byte i = boxx; i < boxx + 3; i++) {
				if ((i != x) || (j != y)) {
					if (((grid[i][j]) == (grid[x][y])) && grid[i][j] != 0) {
                                        return false;
                                    }
				}
			}
		}
		return true;
	}

}

