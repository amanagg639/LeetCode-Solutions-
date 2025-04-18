class MyQueue {

    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();
    
    public void push(int x) {
        while (input.empty() == false) {
            output.push(input.pop());
        }
        input.push(x);
       
        while (output.empty() == false) {
            input.push(output.pop());
        }

    }
    
    public int pop() {
        return input.pop();
    }
    
    public int peek() {
       return input.peek();
    }
    
    public boolean empty() {
        return input.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */