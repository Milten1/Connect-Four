public class Board {
    private char[][] board;

    public Board(){
        board = new char[7][7];
        initializeBoard();
    }   

    public char[][] getBoard(){
        return this.board;
    }

    public void setBoard(char[][] board){
        this.board = board;
    }

    public void printBoard(){
        for(int i = 1; i <= 7; i++ ){
            System.out.print(" " + i + " ");
        }
        
        System.out.println();
         for(int i = 0; i < 6; i++){
            for(int j = 0; j < 7; j++){
                System.out.print("[" + board[i][j] + "]");
            }
             System.out.println();
        }
    }

    public void initializeBoard() {
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 7; j++){
                this.board[i][j] = ' ';
            }
        }
    }

    public void printEmptyBoard(){
        for(int i = 1; i <= 7; i++ ){
            System.out.print(" " + i + " ");
        }
        
        System.out.println();
         for(int i = 0; i < 6; i++){
            for(int j = 0; j < 7; j++){
                System.out.print("[" + i + "" + j + "]");
            }
             System.out.println();
        }
    }


}
