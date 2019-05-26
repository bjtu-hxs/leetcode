public class Q064_MinimumPathSum {
    // Method 1 6ms 84.65%
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int x = grid[0].length;
        int[][] res = new int[m][x];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < x; j++) {
                if (i == 0 && j == 0) {
                    res[i][j] = grid[i][j];
                }
                else if (i == 0) {
                    res[i][j] = res[i][j-1] + grid[i][j];
                }
                else if (j == 0) {
                    res[i][j] = res[i-1][j] + grid[i][j];
                }
                else{
                    res[i][j] = Math.min(res[i-1][j], res[i][j-1]) + grid[i][j];
                }
            }
        }
        return res[m-1][x-1];
    }
}
