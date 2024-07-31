class Node{
        int key;
        int value;
        Node prev;
        Node next;
        int freq = 1;
        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
}
class Dll{
    Node head;
    Node tail;
    Dll(){
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
    }
    void addNode(Node curr){
        Node next = head.next;
        head.next = curr;
        curr.prev = head;
        curr.next = next;
        next.prev = curr;
    }
    Node removeNode(){
        Node node = tail.prev;
        node.prev.next = tail;
        tail.prev = node.prev;
        return node;
    }
    Node removeNode(Node curr){
        Node prev = curr.prev;
        Node next = curr.next;
        prev.next = next;
        next.prev = prev;
        return curr;
    }
    boolean isEmpty(){
        if(head.next == tail){
            return true;
        }
        return false;
    }
}
class LFUCache {
    HashMap<Integer, Node> cache = new HashMap<>();
    HashMap<Integer, Dll> freqList = new HashMap<>();
    int cap;
    int minFreq;
    public LFUCache(int capacity) {
        cap = capacity;
        minFreq = 1;
    }
    public int get(int key) {
        if(cache.get(key) == null)
            return -1;
            Node curr = cache.get(key);
            freqList.get(curr.freq).removeNode(curr);
        if(freqList.get(curr.freq).isEmpty()){
                if(minFreq == curr.freq){
                    minFreq = curr.freq+1;
                }
        }
        curr.freq += 1;
        if(freqList.get(curr.freq) == null){
            Dll d = new Dll();
            d.addNode(curr);
            freqList.put(curr.freq, d);
        }
        else{
            freqList.get(curr.freq).addNode(curr);
        }
        return curr.value;
    }
    
    public void put(int key, int value) {
        if(cap == 0)return;
        if(cache.get(key) != null){
            Node curr = cache.get(key);
            freqList.get(curr.freq).removeNode(curr);
            if(freqList.get(curr.freq).isEmpty()){
                if(minFreq == curr.freq){
                    minFreq = curr.freq+1;
                }
            }
            curr.freq += 1;
            if(freqList.get(curr.freq) == null){
            Dll d = new Dll();
            d.addNode(curr);
            freqList.put(curr.freq, d);
            }
            else{
            freqList.get(curr.freq).addNode(curr);
            }
            curr.value = value;
        }
        else{
            if(cache.size() == cap){
                Node curr = freqList.get(minFreq).removeNode();
                cache.remove(curr.key);
            }
            Node newNode = new Node(key, value);
            cache.put(key, newNode);
            if(freqList.get(1) != null){
                freqList.get(1).addNode(newNode);
            }
            else{
                Dll d = new Dll();
                d.addNode(newNode);
                freqList.put(1, d);
            }
            minFreq = 1;
        }
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */