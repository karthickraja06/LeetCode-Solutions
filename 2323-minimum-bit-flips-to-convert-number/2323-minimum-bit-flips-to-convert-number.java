class Solution {
    public int minBitFlips(int start, int goal) {
        int num = start ^ goal,res = 0;
        while(num > 0){
            if((num & 1) == 1)res++;
            num >>= 1;
        }
        return res;
    }
}