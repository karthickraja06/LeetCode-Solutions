class Solution {
    public boolean prefix(String k,String j){
        if(k.length() < j.length())return false;
        for(int i = 0;i < j.length();i++){
            if(j.charAt(i) != k.charAt(i))return false;
        }
        return true;
    }
    public int prefixCount(String[] words, String pref) {
        int cnt = 0;
        for(String i: words){
            if(prefix(i,pref)){
               cnt++; 
            }
        }
        return cnt;
    }
}