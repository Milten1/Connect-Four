public class Board {
    private char[][] board;

    public Board(){
        board = new char[7][6];
        initializeBoard();
    }   

    public char[][] getBoard(){
        return this.board;
    }

    public void setBoard(char[][] board){
        this.board = board;
    }

    public void printBoard(){
        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 6; j++){
                System.out.print("[" + this.board[i][j] + "]");
            }
            System.out.println();
        }
    }

    public void initializeBoard() {
        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 6; j++){
                this.board[i][j] = ' ';
            }
        }
    }


}
