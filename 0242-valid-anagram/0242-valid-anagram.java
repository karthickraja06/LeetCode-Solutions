class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sn = s.toCharArray();
        char[] tn = t.toCharArray();
        Arrays.sort(sn);
        Arrays.sort(tn);
        return Arrays.equals(sn,tn);
    }
}