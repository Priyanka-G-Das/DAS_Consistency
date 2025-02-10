class Solution {
    public double myPow(double x, int n) {
        
        //converting negative power to positive
        if (n < 0) {
            x = 1 / x;
            n = -n; // make n  posative
        }
        
        return power(x, n);
    }
    
    private double power(double x, int n) {
      if (n == 0) {
            return 1;
        }
        //findind power of x^(n/2) because x^n= x^(n/2) * x^(n/2)
        double half = power(x, n / 2);
        
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}