class Solution {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    public void helper(int[] nums,int i,int n,List<Integer> sub){
        if(i>= n){
            res.add(new ArrayList<>(sub));
            return;
        }
        helper(nums,i+1,n,sub);
        sub.add(nums[i]);
        helper(nums,i+1,n,sub);
        sub.remove(sub.size() - 1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> sub = new ArrayList<Integer>();
        // int i = 0;
        helper(nums,0,nums.length,sub);
        return res;
    }
}