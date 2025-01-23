class Solution {
    public int countServers(int[][] grid) {
        int res = 0;
        for(int i = 0;i < grid.length;i++){
            int sub = 0,ind = -1;
            for(int j = 0;j < grid[0].length;j++){
                if(grid[i][j] == 1){
                    sub++;
                    ind = j;
                }
            }
            if(sub > 1)
                res += sub;
            else if(ind != -1){
                for(int k = 0;k < grid.length;k++){
                    if(k != i && grid[k][ind] == 1){
                        res++;
                        break;
                    }
                }
            }
        }
        return res;
    }
}