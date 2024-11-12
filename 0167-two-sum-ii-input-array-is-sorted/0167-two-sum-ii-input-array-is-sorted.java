class Solution {
    public int binarySearch(int[] arr,int l,int h,int tar){
        while(l<=h){
            int mid = (l+h) / 2;
            if(arr[mid] == tar){
                return mid;
            }else if(tar > arr[mid]){
                l = mid + 1;
            }else{
                h = mid - 1;
            }
        }
        return -1;
    }
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int[] res = new int[2]; 
        for(int i = 0;i < n;i++){
            int isFound = binarySearch(numbers,i+1,n-1,target - numbers[i]);
            if(isFound != -1){
                res[0] = i+1;
                res[1] = isFound+1;
                break;
            }
        }
        return res;
    }
}