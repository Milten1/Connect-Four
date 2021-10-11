public class Logic {

    public char[][] moveRandom(char[][] board, char player) {
        int number = 1 + (int)(Math.random() * 6);

        for(int i = 5; i >= 0; i--){
            if(board[i][number-1] == ' '){
                board[i][number-1] = player;
                break;
            }
            if(board[i][number-1] != ' ' && i == 0) board[6][6] = 't';
        }

        return board;
    }

    public char[][] move(char[][] board, String command, char player){
        int number = Integer.valueOf(command);

        for(int i = 5; i >= 0; i--){
            if(board[i][number-1] == ' '){
                board[i][number-1] = player;
                break;
            }
            if(board[i][number-1] != ' ' && i == 0) board[6][6] = 't';
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
