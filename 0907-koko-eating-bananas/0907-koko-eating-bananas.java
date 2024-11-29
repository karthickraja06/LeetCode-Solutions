class Solution {
    public int maximum(int[] arr){
        int maxi = -1;
        for(int i:arr){
            maxi = Math.max(maxi,i);
        }
        return maxi;
    }
    public int totalH(int[] arr,int hourly){
        int total = 0;
        for(int i:arr){
            total += Math.ceil((double)i/(double)hourly);
        }
        return total;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = maximum(piles),mid = 0;
        while(low <= high){
            mid = (low + high) / 2;
            int total = totalH(piles,mid);
            if(total <= h){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
}