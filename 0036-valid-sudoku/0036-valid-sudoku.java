class Solution {
    public boolean laneCheck(char[][] board){
         
        for(int i=0;i<9;i++){
             HashMap<Integer,Integer> cot = new HashMap<>();
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    int t = board[i][j]-'0';
                    cot.put(t,cot.getOrDefault(t,0)+1);
                    if(cot.get(t)==2) return false;
                }
                
            }
        }
        return true;
    }
    public boolean laneCheck1(char[][] board){
        
        for(int i=0;i<9;i++){
             HashMap<Integer,Integer> cot = new HashMap<>();
            for(int j=0;j<9;j++){
                if(board[j][i]!='.'){
                    int t = board[j][i]-'0';
                    cot.put(t,cot.getOrDefault(t,0)+1);
                    if(cot.get(t)==2) return false;
                }
                
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
       return laneCheck(board)&&laneCheck1(board)&&boxCheck(board);
    }

    public boolean boxCheck(char[][] board){
        boolean istrue = true;
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                HashMap<Integer,Integer> cot = new HashMap<>();
                for(int r=i;r<i+3;r++){
                    for(int c=j;c<j+3;c++){
                        if(board[r][c]!='.'){
                    int t = board[r][c]-'0';
                    cot.put(t,cot.getOrDefault(t,0)+1);
                    if(cot.get(t)==2) return false;
                        }
                    }
                }
            }
        }
        return true;

    }
    
}