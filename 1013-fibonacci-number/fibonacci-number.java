class Solution {
    public int fib(int n) {
        // 3 steps 1st is base case
        if(n==0 || n==1)
        return n;

        int a=fib(n-1);
        int b=fib(n-2);
        return a+b;
    }
}