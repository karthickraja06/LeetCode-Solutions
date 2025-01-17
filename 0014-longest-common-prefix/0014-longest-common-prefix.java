class Solution {
    public boolean isPrefix(String[] arr,int s,int e,int n){
        String pref = (arr[0].length() - 1 >= e)?arr[0].substring(s, e + 1):"";
        if(pref == "")return false;
        for(int i = 1;i < n;i++){
            if(arr[i].length() - 1 < e)return false;
            if(!pref.equals(arr[i].substring(s, e + 1)))return false;
        }
        return true;
    }
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length,minLen = Integer.MAX_VALUE; 
        if(n == 1)return strs[0];
        //to find the index of the minimum length word
        for(int i = 0;i < n;i++){
            int m = strs[i].length();
            if(m == 0)return ""; //if any word is empty there cannot be any longer options left
            if(minLen > m){
                minLen = m;
            }
        }
        
        int l = 0,h = minLen - 1;
        while(l <= h){
            int mid = (l + h)/2;
            if(isPrefix(strs,l,mid,n)){
                l = mid + 1;
            }else{
                h = mid - 1;
            }
        }
        return strs[0].substring(0, l);
    }
}