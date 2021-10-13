public class Logic {

    public char[][] moveRandom(char[][] board, char player) {
        int number = 1 + (int)(Math.random() * 7);

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
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 7; j++){
                if(board[i][j] == ' ') return false;
            }
        }
        return true;
    }

    public boolean isWin(char[][] board){
        try {
            for(int i = 0; i < 6; i++){
                for(int j = 0; j < 7; j++){
                    if((board[i][j] == 'X' && board[i][j+1] == 'X' && board[i][j+2] == 'X' && board[i][j+3] == 'X') || 
                       (board[i][j] == 'O' && board[i][j+1] == 'O' && board[i][j+2] == 'O' && board[i][j+3] == 'O') || 
                       (board[i][j] == 'X' && board[i+1][j] == 'X' && board[i+2][j] == 'X' && board[i+3][j] == 'X') || 
                       (board[i][j] == 'O' && board[i+1][j] == 'O' && board[i+2][j] == 'O' && board[i+3][j] == 'O')) return true;

                    if((board[i][j] == 'X' && board[i+1][j+1] == 'X' && board[i+2][j+2] == 'X' && board[i+3][j+3] == 'X') || 
                       (board[i][j] == 'O' && board[i+1][j+1] == 'O' && board[i+2][j+2] == 'O' && board[i+3][j+3] == 'O') || 
                       (board[i][j] == 'X' && board[i+1][j-1] == 'X' && board[i+2][j-2] == 'X' && board[i+3][j-3] == 'X') || 
                       (board[i][j] == 'O' && board[i+1][j-1] == 'O' && board[i+2][j-2] == 'O' && board[i+3][j-3] == 'O')) return true;
                }
            }
        } catch (Exception e) {
            //TODO: handle exception
        }

        
        return false;
    }
}
