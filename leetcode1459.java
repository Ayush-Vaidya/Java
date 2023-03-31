class Solution {
    int MOD = (int)Math.pow(10, 9) + 7;
    boolean[][] grid;
    int m, n;
    
    public int ways(String[] pizza, int k) {
        m = pizza.length; n = pizza[0].length();
        Integer[][][] memo = new Integer[m][n][k + 1];
        grid = new boolean[m][n];
        for (int i = 0; i < pizza.length; i++)
            for (int j = 0; j < pizza[i].length(); j++)
                grid[i][j] = pizza[i].charAt(j) == 'A';
        return dfs(0, 0, k, memo);
    }
    
    private int dfs(int row, int col, int k, Integer[][][] memo) {
        if (row >= m || col >= n) return 0;
        if (memo[row][col][k] != null) return memo[row][col][k];
        if (k == 1) {
            for (int i = row; i < m; i++)
                for (int j = col; j < n; j++)
                    if (grid[i][j]) return memo[i][j][k] = 1;
            return 0;
        }
        
        //horizontal
        int res = 0;
        boolean previousRowHasApple = false;
        for (int i = row; i < m; i++) {
            for (int j = col; j < n; j++)
                previousRowHasApple |= grid[i][j];
            if (previousRowHasApple) 
                res = (res + dfs(i + 1, col, k - 1, memo)) % MOD;
        }
        
        //vertical
        boolean previousColHasApple = false;
        for (int j = col; j < n; j++) {
            for (int i = row; i < m; i++)
                previousColHasApple |= grid[i][j];
            if (previousColHasApple)
                res = (res + dfs(row, j + 1, k - 1, memo)) % MOD;
        }
        return memo[row][col][k] = res;
    }
}
