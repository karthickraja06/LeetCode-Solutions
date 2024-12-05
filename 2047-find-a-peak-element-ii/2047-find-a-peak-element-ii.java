class Solution {
    public int maxi(int[][] mat,int col,int end){
        int max = 0;
        for(int i = 1;i < end;i++){
            if(mat[max][col] < mat[i][col]){
                max = i;
            }
        }
        return max;
    }
    public int[] findPeakGrid(int[][] mat) {
        int n = mat[0].length-1,m = mat.length;
        int l = 0,h = n;
        while(l <= h){
            int mid = (l + h) / 2;
            int row = maxi(mat,mid,m);
            int left = (mid > 0)?mat[row][mid - 1]: -1;
            int right = (mid < n)?mat[row][mid + 1]: -1;
            if(left < mat[row][mid] && right < mat[row][mid]){
                return new int[]{row,mid};
            }else if(left > mat[row][mid]){
                h = mid - 1;
            }else{
                l = mid + 1;
            }

        }
        return new int[]{-1,-1};
    }
}