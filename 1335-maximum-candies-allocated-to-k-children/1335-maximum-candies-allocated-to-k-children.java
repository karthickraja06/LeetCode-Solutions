class Solution {
    public boolean isPossible(int[] candies,long k,long candy){
        long child = 0;
        for(int i:candies){
            child += i / candy;
        }
        return (child >= k);
    }
    public int maximumCandies(int[] candies, long k) {
        long sum = 0;
        for(int i : candies){
            sum += i;
        }
        if(sum < k)
            return 0;
        if(sum == k)
            return 1;
        long l = 1,r = sum;
        while(l <= r){
            long mid = (l + r) / 2;
            if(isPossible(candies, k, mid)){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return (int)r;
    }
}