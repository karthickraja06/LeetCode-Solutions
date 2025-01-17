class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder longestPref = new StringBuilder(strs[0]);
        for(int i = 1;i < strs.length;i++){
            int j = 0, m = longestPref.length();
            for(;j < strs[i].length();j++){
                if(j < m && longestPref.charAt(j) != strs[i].charAt(j)){
                    break;
                }else if(j >= m) break;
            }
            longestPref.delete(j,m);
            if(m == 0)return "";
            System.out.println(longestPref);
        }
        return longestPref.toString();
    }
}