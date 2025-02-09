class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer,Integer> pref = new HashMap<>();
        long res = 0;
        for(int i = 0;i < nums.length;i++){
            pref.put(nums[i] - i,pref.getOrDefault(nums[i] - i, 0) + 1);
            res += i + 1 - pref.get(nums[i] - i);
        }
        return res;
    }
}