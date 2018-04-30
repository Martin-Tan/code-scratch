/******************************************************************************
 *  Compilation:  javac MineSweeper.java
 *  Execution:    java MineSweeper
 *  
 *  Creates an M*N sweeper game board where each cell is a bomb with 
 *  probability p. 
 *  Prints out the m-by-n game and the neighboaring bomb counts.
 * 
 *  % java MineSweeper 4 4 0.3
 *  Bomb board:
 *  . . . *
 *  * . . *
 *  . . * .
 *  . * * .
 *  
 *  Solution board:
 *  1 1 2 *
 *  * 2 3 *
 *  2 4 * 3
 *  1 * * 2
 *
 ******************************************************************************/

public class MineSweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        double p = Double.parseDouble(args[2]);

        // Create a bomb board.
        boolean[][] bombBoard = new boolean[m + 2][n + 2];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m; j++) {
                bombBoard[i][j] = (Math.random() < p);
            }
        }

        // Print the game board.
        System.out.println("Bomb board: ");
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(bombBoard[i][j] ? "* " : ". ");
            }
            System.out.println();
        }
        System.out.println();

        // Create a solution board, only collect the bombs count individually
        // without considering the output process.
        int[][] solutionBoard = new int[m + 2][n + 2];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m; j++) {
                // To caculate the cells around a specifie cell with distance 1.
                for (int ii = -1; ii <= 1; ii++) {
                    for (int jj = -1; jj <= 1; jj++) {
                        if (bombBoard[i + ii][j + jj]) {
                            solutionBoard[i][j]++;
                        }   
                    }
                }
            }
        }

        // Print the solution board.
        System.out.println("Solution board: ");
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(bombBoard[i][j] ? "* " : solutionBoard[i][j] + " ");
            }

            System.out.println();
        }
    }
}