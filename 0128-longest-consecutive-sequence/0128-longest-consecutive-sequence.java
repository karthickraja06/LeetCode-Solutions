class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)return 0;
        Set<Integer> uni = new HashSet<>();
        for(int i: nums){
            uni.add(i);
        }
        int longest = 1;
        for(int i:uni){
            if(!uni.contains(i-1)){
                int cnt = 1, x = i+1;
                while(uni.contains(x++)){
                    cnt++;
                }
                longest = Math.max(longest,cnt);
            }
        }
        return longest;
    }
}