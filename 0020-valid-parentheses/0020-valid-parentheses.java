class Solution {
    public boolean isValid(String s) { 
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i < s.length();i++){
            char j = s.charAt(i);
            if(j == '(' || j == '[' || j == '{'){
                stack.push(j);
            }else{
                if(stack.empty())return false;
                char k = stack.peek(); 
                if((j == ')' && k =='(') || (j == ']' && k =='[') ||(j == '}' && k == '{')){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.empty();
    }
}