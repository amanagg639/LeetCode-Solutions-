class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int maxA = 0;
        int n = heights.length;
        for(int i=0; i<=n; i++){
            while(!st.isEmpty() && (i==n || heights[st.peek()]>=heights[i])){
                int h = heights[st.peek()];
                st.pop();
                int w;
                if(st.isEmpty())w = i;
                else w = i-st.peek() -1;
                maxA = Math.max(maxA, h*w);
            }
            st.push(i);
        }
        return maxA;
    }
}