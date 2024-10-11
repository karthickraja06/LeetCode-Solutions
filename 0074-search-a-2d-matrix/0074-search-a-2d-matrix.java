class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int l = 0, h = m * n -1;

        while(l <= h){
            int mid = (l+h)/2;
            if(matrix[mid/n][mid%n] == target){
                return true;
            }else if(target > matrix[mid/n][mid%n]){
                l = mid+1;
            }else{
                h = mid-1;
            }
        }
        return false;
    }
}