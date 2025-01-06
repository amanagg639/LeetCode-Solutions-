class Solution {
    private long mod = 1000000007;
    public int countGoodNumbers(long n) {
        long even = (n+1)/2;
        long odd = n/2;
        long first = pow(5, even)%mod;
        long second = pow(4, odd)%mod;
        return (int) ((first * second)%mod);
    }
    public long pow(long x, long n){
        if(n==0)return 1;
        long half = pow(x, n/2);
        if(n%2 == 0){
            return (half*half)%mod;
        }
        else return (half*half*x)%mod;
    }
}