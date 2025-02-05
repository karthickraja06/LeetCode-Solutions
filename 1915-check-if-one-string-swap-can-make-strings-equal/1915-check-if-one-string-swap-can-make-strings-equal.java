class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int ind = -1,cnt = 0;
        for(int i = 0;i < s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)){
                cnt++;
                if(ind == -1)
                    ind = i;
                else if(cnt > 2 || s1.charAt(ind) != s2.charAt(i) || s1.charAt(i) != s2.charAt(ind))
                    return false;
            }
        }
        return (cnt != 1);
    }
}