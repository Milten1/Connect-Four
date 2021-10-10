public class Logic {

    public char[][] moveRandom(char[][] board, char player) {
        int number = 1 + (int)(Math.random() * 6);

        for(int i = 5; i >= 0; i--){
            if(board[i][number-1] == (' ')){
                board[i][number-1] = player;
                break;
            }
        }

        return board;
    }

    public char[][] move(char[][] board, String command, char player){
        int number = Integer.valueOf(command);

        for(int i = 5; i >= 0; i--){
            if(board[i][number-1] == (' ')){
                board[i][number-1] = player;
                break;
            }
        }

        return board;
    }

    public boolean isDraw(char[][] board){
        return false;
    }

    public boolean isWin(char[][] board){
        return false;
    }
}
