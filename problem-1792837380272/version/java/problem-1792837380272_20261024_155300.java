// Last updated: 10/24/2026, 3:53:00 PM
1class Solution {
2    public boolean isValidSudoku(char[][] board) {
3        boolean [][] rows= new boolean[9][9];
4        boolean [][] cols= new boolean[9][9];
5        boolean [][] boxes=new boolean[9][9];
6
7        for(int i=0;i<9;i++){
8            for(int j=0;j<9;j++){
9                char c= board[i][j];
10
11                if(c == '.'){ continue;
12                }
13
14                int num=c - '1';
15                int box=(i/3)* 3+(j/3);
16                
17                if(rows[i][num] || cols[j][num] || boxes [box][num]){
18                    return false;
19                }
20                rows[i][num]=true;
21                cols[j][num]=true;
22                boxes[box][num]=true;
23            }
24        } 
25        return true;
26    }
27}