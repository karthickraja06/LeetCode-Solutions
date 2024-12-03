class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length - 1;
        for(int i = 0;i < matrix[0].length && matrix[0][i] <= target;i++){
            if(matrix[0][i] == target)return true;
            int l = 0,h = n;
            while(l <= h){
                int mid = (l + h) / 2;
                if(matrix[mid][i] == target)return true;
                else if(matrix[mid][i] < target){
                    l = mid + 1;
                }else{
                    h = mid - 1;
                }
            }
        }
        return false;
    }
}