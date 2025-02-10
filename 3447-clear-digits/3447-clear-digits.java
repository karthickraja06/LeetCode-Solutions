class Solution {
    public String clearDigits(String s) {
        StringBuilder res = new StringBuilder();
        for(char i:s.toCharArray()){
            if(Character.isDigit(i)){
                if(res.length() > 0)
                    res.deleteCharAt(res.length() - 1);
            }
            else
                res.append(i);
        }
        return res.toString();
    }
}