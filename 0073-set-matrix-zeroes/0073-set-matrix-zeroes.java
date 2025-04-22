class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        
        List<int[]> zeroPositions = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    zeroPositions.add(new int[]{i, j});
                }
            }
        }

        
        for (int[] pos : zeroPositions) {
            int row = pos[0];
            int col = pos[1];

            for (int i = 0; i < m; i++) {
                matrix[row][i] = 0;
            }

            for (int i = 0; i < n; i++) {
                matrix[i][col] = 0;
            }
        }
    }
}
