class Solution {
    public int totalSum(int[] arr){
        int sum = 0;
        for(int i:arr)sum += i;
        return sum;
    }
    public boolean isPossible(int[] arr,int capacity,int days){
        int day = 0,daysTook = 0;
        for(int i:arr){
            if(i > capacity)return false;
            if(day + i <= capacity){
                day += i;
            }else{
                daysTook++;
                day = i;
            }
        }
        return(daysTook+1 <= days);
    }
    public int shipWithinDays(int[] weights, int days) {
        int l = 1,h = totalSum(weights);
        while(l <= h){
            int mid = (l + h) / 2; 
            if(isPossible(weights,mid,days)){
                h = mid - 1; 
            }else{
                l = mid + 1;
            }
        }return l;
    }
}