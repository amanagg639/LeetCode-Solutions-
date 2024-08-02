class StockSpanner {
    ArrayList<Integer> al;
    public StockSpanner() {
        al = new ArrayList<>();
    }
    int i=0;
    public int next(int price) {
        al.add(price);
        int cnt = 1;
        for(int j=i-1; j>=0; j--){
            if(al.get(j)<=price)cnt++;

            else break;
        }
        i++;
        return cnt;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */