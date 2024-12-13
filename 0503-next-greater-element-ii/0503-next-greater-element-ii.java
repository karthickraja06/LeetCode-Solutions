class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[n];
        for(int i = 2 * n - 1;i >= 0;i--){
            res[i % n] = (stack.empty() || stack.peek() < nums[i % n])?-1:stack.peek();
            if(stack.empty() || nums[i % n] < stack.peek()){
                stack.push(nums[i % n]);
            }
            else{
                while(!stack.empty() && nums[i % n] >= stack.peek()){
                    stack.pop();
                }
                res[i % n] = (stack.empty())?-1:stack.peek();
                stack.push(nums[i % n]);
            }
        }
        return res;
    }
}