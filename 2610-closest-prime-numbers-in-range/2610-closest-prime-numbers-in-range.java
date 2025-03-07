class Solution {
    public int[] closestPrimes(int left, int right) {
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i=left; i<=right; i++){
            if(isPrime(i)){
                ls.add(i);
            }
        }
        int num1 = -1, num2 = -1;
        int prev = 0;
        for(int i : ls){
               if(num1>0){
                 if(num2 > 0){
                    if(num2-num1 > i-num2){
                        num1 = num2;
                        num2 = i;
                    }
                    if(prev!= 0 && num2-num1 > i-prev){
                        num1 = prev;
                        num2 = i;
                    }
                    prev = i;

                 }
                 else{
                    num2 = i;
                 }
               }
               else{
                num1 = i;
               }
        }
        if(num1==-1 || num2==-1){
        return new int[]{-1, -1};
        }
        return new int[]{num1, num2};
    }
    public boolean isPrime(int n){
        if(n<=1)return false;
        for(int i=2; i<=Math.sqrt(n); i++){
           if(n%i==0)return false;
        }
        return true;
    }
    
}