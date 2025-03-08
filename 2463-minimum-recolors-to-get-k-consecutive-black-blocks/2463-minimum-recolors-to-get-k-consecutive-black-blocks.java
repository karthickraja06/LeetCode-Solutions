class Solution {
    public int minimumRecolors(String blocks, int k) {
        int res = Integer.MAX_VALUE,n = 0;
        for(int i = 0;i < k;i++){
            if(blocks.charAt(i) == 'W'){
                n++;
            }
        }
        res = Math.min(res,n);
        for(int i = k;i < blocks.length();i++){
            n -= (blocks.charAt(i - k) == 'W')?1:0;
            n += (blocks.charAt(i) == 'W')?1:0;
            res = Math.min(res,n); 
        }
        return res;
    }
}