class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int [] total = new int[2*gas.length];
        int i=0;
        int j = 0;
        while(i<total.length){
            total[i] = gas[j]-cost[j];
            i++;
            j++;
            if(j==gas.length)j=0;
        }
        int cnt = 0;
        int sum = 0;
        for(i=0; i<total.length; i++){
           if(sum+total[i]>=0){
            cnt++;
            sum+=total[i];
            if(cnt>=gas.length)
            return i-gas.length+1;
           }
           else{
            cnt=0;
            sum=0;
           }
        }
        return -1;

        
    }
}