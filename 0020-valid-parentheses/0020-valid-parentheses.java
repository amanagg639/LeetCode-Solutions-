class Solution {
    public boolean isValid(String s) {
        Stack<Character> sc = new Stack<>();
         for(char c:s.toCharArray()){
            if(c=='('){
                sc.push(')');
            } else if(c=='{'){
                sc.push('}');
            }else if(c=='['){
                sc.push(']');
            }else if(sc.isEmpty() || sc.pop() != c)
            return false;
        }
        return sc.isEmpty();
    }
}