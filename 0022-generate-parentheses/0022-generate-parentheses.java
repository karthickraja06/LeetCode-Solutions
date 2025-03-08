class Solution {
    List<String> res = new ArrayList<>();
    public void helper(int openBal,int closeBal,StringBuilder sb){
        if(openBal == 0 && closeBal == 0){
            res.add(sb.toString());
            return;
        }
        if(openBal <= closeBal && openBal > 0){
            sb.append('(');
            helper(openBal - 1,closeBal,sb);
            sb.deleteCharAt(sb.length() - 1);
        }
        if(openBal <= closeBal && closeBal > 0){
            sb.append(')');
            helper(openBal,closeBal - 1,sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
    public List<String> generateParenthesis(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        helper(n - 1,n,sb);
        return res;
    }
}