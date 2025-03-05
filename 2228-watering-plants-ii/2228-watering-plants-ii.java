class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int cntRefil = 0;
        int i=0;
        int j=plants.length-1;
        int a = capacityA;
        int b = capacityB;
        while(i<j){
            if(plants[i]<= a && plants[j]<=b){
                a -= plants[i++];
                b -= plants[j--];
            }
            else if(plants[i]>a && plants[j]>b){
                a = capacityA;
                b = capacityB;
                cntRefil += 2;
            }
            else if(plants[i]>a){
                a = capacityA;
                cntRefil++;
            }
            else{
                b = capacityB;
                cntRefil++;
            }

        }
        if(i==j){
            if(plants[i]>a && plants[i]>b){
                cntRefil++;
            }
        }
        return cntRefil;
    }
}