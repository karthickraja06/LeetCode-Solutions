class Solution {
    public int maxScore(String s) {
        int zeros = 0,ones = 0,res = -1,n = s.length();
        for(int i = 0;i < n;i++){
            if(s.charAt(i) == '1')ones++;
        }
        for(int i = 0;i < n -1;i++){
            if(s.charAt(i) == '0')zeros++;
            else ones--;
            res = Math.max(res,ones+zeros);
        }
        return res;
    }
}