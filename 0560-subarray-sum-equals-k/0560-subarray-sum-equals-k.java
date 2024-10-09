class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int presum = 0,cnt = 0;
        map.put(0,1);
        for(int i:nums){
            presum += i;
            cnt += map.getOrDefault(presum-k,0);
            map.put(presum,map.getOrDefault(presum,0)+1);
        }
        return cnt;
    }
}