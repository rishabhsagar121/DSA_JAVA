class Solution {

    public void setZeroes(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (matrix[i][j] == 0) {
                    markRow(matrix, i);
                    markColumn(matrix, j);
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    private void markRow(int[][] matrix, int r) {

        int cols = matrix[0].length;

        for (int j = 0; j < cols; j++) {
            if (matrix[r][j] != 0) {
                matrix[r][j] = -1;
            }
        }
    }

    private void markColumn(int[][] matrix, int c) {

        int rows = matrix.length;

        for (int i = 0; i < rows; i++) {
            if (matrix[i][c] != 0) {
                matrix[i][c] = -1;
            }
        }
    }
}

public class setMatrixZeroes {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        Solution sol = new Solution();
        sol.setZeroes(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
