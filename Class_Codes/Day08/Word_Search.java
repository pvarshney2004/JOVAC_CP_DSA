package Class_Codes.Day08;

public class Word_Search {
    public static void main(String[] args) {
        char[][] board = {  { 'A', 'B', 'C', 'E' },
                            { 'S', 'F', 'C', 'S' },
                            { 'A', 'D', 'E', 'E' } };
        String word = "ABCB";
        for(int i=0; i< board.length; i++){
            for(int j=0; j< board[0].length; j++){
                if(board[i][j]==word.charAt(0)){
                    boolean ans = search(board,i,j,word,0);
                    if(ans){
                        System.out.println(true);
                        return;
                    }
                }
            }
        }
        System.out.println(false);
    }
    public static boolean search(char[][]board, int cr, int cc, String word, int idx){
        if(idx==word.length()){
            return true;
        }
        if(cc<0 || cr<0 || cc>=board[0].length || cr>=board.length || word.charAt(idx) != board[cr][cc]){
            return false;
        }
//        char[] ch = {u,l,b,r};
//        char ch = board[cr][cc];
        board[cr][cc]='*';
        int[] r = { -1, 0, 1, 0 };
        int[] c = { 0, -1, 0, 1 };
        for(int i=0; i<r.length; i++){
            boolean ans = search(board,cr+r[i],cc+c[i],word,idx+1);
            if(ans){
                return true;
            }
        }
        board[cr][cc]=word.charAt(idx);
        return false;
    }
}
