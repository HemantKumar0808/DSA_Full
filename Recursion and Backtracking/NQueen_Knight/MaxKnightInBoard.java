package NQueen_Knight;

class MaxKnightsInNBoard {
    static int maxKnights = -1;
    static int number = 8;

    public static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;
        int i, j;

        // Check all possible knight moves
        int[][] moves = {
                {-2, 1}, {-2, -1}, {2, 1}, {2, -1},
                {1, 2}, {1, -2}, {-1, 2}, {-1, -2}
        };

        for (int[] move : moves) {
            i = row + move[0];
            j = col + move[1];
            if (i >= 0 && i < n && j >= 0 && j < n && board[i][j] == 'K')
                return false;
        }
        return true;
    }

    public static void nKnight(char[][] board, int row, int col, int num) {
        int n = board.length;
        if (row == n) {
            maxKnights = Math.max(maxKnights, num);
            return;
        }

        if (col != n - 1) {
            nKnight(board, row, col + 1, num);
        } else {
            nKnight(board, row + 1, 0, num);
        }

        if (isSafe(board, row, col)) {
            board[row][col] = 'K';
            if (col != n - 1) {
                nKnight(board, row, col + 1, num + 1);
            } else {
                nKnight(board, row + 1, 0, num + 1);
            }
            board[row][col] = 'x'; // backtracking
        }
    }

    public static void main(String[] args) {
        int n = 4; // Change board size here
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }

        nKnight(board, 0, 0, 0);
        System.out.println(maxKnights);
    }
}
