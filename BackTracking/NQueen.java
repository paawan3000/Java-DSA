// Time Complexity O(N!)
public class NQueen {
    public static void main(String[] args) {
        int n = 6;
         char board [][] = new char[n][n];
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j]='.';
            }
        }

        chessBoard(board,0);
        System.out.println( " Number of Ways to arrange " + n + " queens are " + count);
    }

    public static boolean isSafe(char board[][],int row,int col){

        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }


        for(int i=row-1, j = col-1; i >=0 && j>=0;i--,j--){

            if(board[i][j]=='Q'){
                return false;
            }

        }


        for(int i= row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        return true;

    }

   static int count = 0;
    
    public static void chessBoard(char board[][],int row){
         if(row == board.length  ){
            // print(board);
            count++;
            return;

         }


        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)==true){
            board[row][col] = 'Q';
            chessBoard(board, row+1);
            board[row][col] = '.';
            }
        }
       
    }


    public static void print(char board[][]){

        System.out.println("---------Chess Board---------");
        for(int i = 0; i<board.length;i++ ){
            for(int j =0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
