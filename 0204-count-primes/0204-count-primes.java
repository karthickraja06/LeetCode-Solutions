class Solution {
    public int countPrimes(int n) {
        if(n == 0 || n == 1)return 0;
        int res = n - 2; // This is the maximum total possible output
        int[] prime = new int[n + 1];//+1 is to considering zero too

        for(int i = 2; i < n;i++){
            if(prime[i] == 0){
                for(int j = 2;i*j < n;j++){
                    prime[i * j] = 1;
                }
            }else{
                res--;
            }
        }
        return res;
    }
}