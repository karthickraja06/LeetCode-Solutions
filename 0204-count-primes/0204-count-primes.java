class Solution {
    public int countPrimes(int n) {
        if(n == 0 || n == 1)return 0;
        int[] prime = new int[n + 1];//+1 is to considering zero too

        for(int i = 2; i < Math.sqrt(n);i++){
            if(prime[i] == 0){
                for(int j = i;i*j < n;j++){
                    prime[i * j] = 1;
                }
            }
        }
        int res = 0;
        for(int i = 2;i < n;i++){
            if(prime[i] == 0)res++;
        }
        return res;
    }
}