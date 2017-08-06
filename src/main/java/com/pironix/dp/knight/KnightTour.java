package com.pironix.dp.knight;

/**
 * Created by ikarayel on 3/12/2017.
 */
public class KnightTour {

    private static int[][] solution = new int[8][8];
    int path = 0;


    public static void main(String[] args) {
        KnightTour knightTour = new KnightTour();
        knightTour.solve();
    }

    private void printTour(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(solution[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void solve() {
        if (findPath(0, 0, 0, solution.length)) {
            printTour(solution.length);
        } else {
            System.out.println("No Path Found");
        }
    }

    private boolean findPath(int row, int column, int index, int N) {
        // check if current is not used already
        if (solution[row][column] != 0) {
            return false;
        }

        // mark the current cell is as used
        solution[row][column] = path++;
        // if (index == 63) {
        if (index == N * N - 1) {
            // if we are here means we have solved the problem
            return true;
        }
        // try to solve the rest of the problem recursively

        // 1 go down and right
        if (canMove(row + 2, column + 1, N)
                && findPath(row + 2, column + 1, index + 1, N)) {
            return true;
        }
        //2  go right and down
        if (canMove(row + 1, column + 2, N)
                && findPath(row + 1, column + 2, index + 1, N)) {
            return true;
        }
        //3  go right and up
        if (canMove(row - 1, column + 2, N)
                && findPath(row - 1, column + 2, index + 1, N)) {
            return true;
        }
        //4  go up and right
        if (canMove(row - 2, column + 1, N)
                && findPath(row - 2, column + 1, index + 1, N)) {
            return true;
        }
        //5 go up and left
        if (canMove(row - 2, column - 1, N)
                && findPath(row - 2, column - 1, index + 1, N)) {
            return true;
        }
        //6  go left and up
        if (canMove(row - 1, column - 2, N)
                && findPath(row - 1, column - 2, index + 1, N)) {
            return true;
        }
        //7 go left and down
        if (canMove(row + 1, column - 2, N)
                && findPath(row + 1, column - 2, index + 1, N)) {
            return true;
        }
        //8  go down and left
        if (canMove(row + 2, column - 1, N)
                && findPath(row + 2, column - 1, index + 1, N)) {
            return true;
        }
        // if we are here means nothing has worked , backtrack
        solution[row][column] = 0;
        path--;
        return false;
    }

    public boolean canMove(int row, int col, int N) {
        return row >= 0 && col >= 0 && row < N && col < N;
    }


    /*public boolean canMove(int row, int col, int N) {
        if ((row >= 0 && col >= 0) &&  (row < N && col < N) && (solution[row][col] == 0)) {
     return true;
     }
     return false;
     }*/


}
