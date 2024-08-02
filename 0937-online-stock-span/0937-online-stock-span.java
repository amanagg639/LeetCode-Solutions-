class Node{
    int stock;
    int span;
    Node(int stock, int span){
        this.stock = stock;
        this.span = span;
    }
}
class StockSpanner {
    ArrayList<Node> al;
    public StockSpanner() {
      al = new ArrayList<>();  
    }
    int largest = Integer.MIN_VALUE;
    public int next(int price) {
        if(largest<=price){
            largest = price;
            int days = 1;
            days += al.size();
            al.add(new Node(price, days));
            return days;
        }
        int days = 1;
        int n = al.size();
        while(n-days>=0 && al.get(n-days).stock<=price){
            days += al.get(n-days).span;
        }
        al.add(new Node(price, days));
        return days;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */