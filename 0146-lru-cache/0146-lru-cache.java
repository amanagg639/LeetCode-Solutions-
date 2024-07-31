class LRUCache {
    class Node{
        int key;
        int value;
        Node prev;
        Node next;
        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
    Node head = new Node(-1, -1);
    Node tail = new Node(-1, -1);
    int cap;
    HashMap<Integer, Node> map = new HashMap<>();
    public LRUCache(int capacity) {
        cap = capacity;
        head.next = tail;
        tail.prev = head;
    }
    public void deleteNode(Node del){
        Node pr = del.prev;
        Node ne = del.next;
        pr.next = ne;
        ne.prev = pr;
    }
    public void addNode(Node ad){
        Node temp = head.next;
        head.next = ad;
        ad.prev = head;
        ad.next = temp;
        temp.prev = ad;
    }
    public int get(int key) {
        if(map.containsKey(key)){
            Node curr = map.get(key);
            int ans = curr.value;
            deleteNode(curr);
            addNode(curr);
            map.put(key, head.next);
            return ans;
        }
        
            return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node curr = map.get(key);
            map.remove(key);
            deleteNode(curr);
        }
        if(map.size() == cap){
            map.remove(tail.prev.key);
            deleteNode(tail.prev);
        }
        addNode(new Node(key, value));
        map.put(key, head.next);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */