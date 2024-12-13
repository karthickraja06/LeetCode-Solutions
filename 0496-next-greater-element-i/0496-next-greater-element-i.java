class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> sub = new HashMap<>();
        for(int i = 0; i < nums1.length;i++){
            if(!sub.containsKey(nums1[i])){
                sub.put(nums1[i],i);
            }
        }
        for(int i = nums2.length - 1;i >= 0;i--){
            while(!st.empty() && nums2[i] >= st.peek()){
                st.pop();
            }
            if(sub.containsKey(nums2[i])){
                res[sub.get(nums2[i])] = (st.empty())?-1:st.peek();
            }
            st.push(nums2[i]);
        }
        return res;
    }
}