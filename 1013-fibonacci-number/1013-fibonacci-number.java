class Solution {
    public int fib(int n) {

        return fibonaci(n);
        
    }
    static int fibonaci(int n){
        if(n<2){
            return n;
        }

        return fibonaci(n-1)+ fibonaci(n-2);
    }
}