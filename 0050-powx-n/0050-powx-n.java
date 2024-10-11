class Solution {
    double mul, c;
    public void helper(long n){
        if(n <= 1){
            return;
        }
        System.out.println(n);
        helper(n/2);
        System.out.println(mul + "-" + n);
        mul *= mul;
        if(n%2 != 0){
           mul *= c;
        }

    }
    public double myPow(double x, long n) {
        if(n == 0)return 1;
        mul = x;
        c = x;
        helper(Math.abs(n));
        return(n < 0)?1/mul:mul;
    }
}