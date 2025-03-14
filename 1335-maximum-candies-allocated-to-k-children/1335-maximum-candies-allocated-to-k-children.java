class Solution {
    public boolean isPossible(int[] candies,long k,int candy){
        long child = 0;
        for(int i:candies){
            child += i / candy;
        }
        return (child >= k);
    }
    public int maximumCandies(int[] candies, long k) {
        long sum = 0;
        int max = 0;
        for(int i : candies){
            sum += i;
            max = Math.max(max,i);
        }
        if(sum < k)
            return 0;
        if(sum == k)
            return 1;
        int l = 1,r = max;
        while(l <= r){
            int mid = (l + r) / 2;
            if(isPossible(candies, k, mid)){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return r;
    }
}