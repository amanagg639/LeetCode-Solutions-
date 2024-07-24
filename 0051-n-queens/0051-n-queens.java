class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char [][] out = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                out[i][j] = '.';
            }
        }
        solve(0, n, ans, out);
        return ans;
    }
    public void solve(int col, int n, List<List<String>> ans, char[][] out){
        if(col == n){
            addSol(ans, out, n);
            return;
        }
        for(int row = 0; row<n; row++){
            if(isSafe(row, col, out, n)){
                out[row][col] = 'Q';
                solve(col+1, n, ans, out);
                out[row][col] = '.';
            }
        }
    }
    public boolean isSafe(int row, int col, char[][] out, int n){
        int x = row;
        int y = col;
        while(y>=0){
            if(out[x][y] == 'Q')return false;
            y--;
        }
        y = col;
        while(y>=0 && x>=0){
            if(out[x][y] == 'Q')return false;
            x--;
            y--;
        }
        x = row;
        y = col;
        while(y>=0 && x<n){
            if(out[x][y] == 'Q')return false;
            x++;
            y--;
        }
        return true;
    }
    public void addSol(List<List<String>> ans, char[][] out, int n){
        List<String> temp = new ArrayList<>();
        for(int i=0; i<n; i++){
            String s = new String(out[i]);
            temp.add(s);
        }
        ans.add(temp);
    }
}