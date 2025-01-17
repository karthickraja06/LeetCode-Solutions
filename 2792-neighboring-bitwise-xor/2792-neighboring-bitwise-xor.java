class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int zero = 0;
        for(int i = 0;i < derived.length;i++){
            zero ^= derived[i];
        }
        return (zero == 0)?true:false;
    }
}