class Solution {
    public int maxDepth(String s) {
        int max = 0,sub = 0;
        for(char i:s.toCharArray()){
            if(i =='(')
                sub++;
            else if(i == ')')
                sub--;
            else 
                continue;
            max = Math.max(max,sub);
        }
        return max;
    }
}