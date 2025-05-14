class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) return false; 

        int sum = 1;
        int divisor = 2;

        while (divisor * divisor <= num) {
            if (num % divisor == 0) {
                sum += divisor;
                int otherDivisor = num / divisor;
                if (otherDivisor != divisor) {
                    sum += otherDivisor;
                }
            }
            divisor++;
        }

        return sum == num;
    }
}
