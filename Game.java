import java.util.Scanner;

public class Game {
    private Board board;
    private Logic logic;

    public Game(){
        this.board = new Board();
        this.logic = new Logic();
    }

    public void start() {
        System.out.print("Do you want to play with AI? If not you will be playing with second player (y/n): ");
        Scanner scanner = new Scanner(System.in);
        String yn = scanner.nextLine();
        System.out.println();

        int i = 0;

        while(true){
            if(i % 2 == 0 && yn.equals("y")){
                board.setBoard(logic.moveRandom(board.getBoard(), 'O'));
            }else{
                board.printBoard();
                System.out.println("Choose number or type 'exit' to end game: ");
                String command = scanner.next();
                if(command.toLowerCase().equals("exit")) break;

                if(command.toLowerCase().matches("[1-6]")) {
                    if(i % 2 == 0) board.setBoard(logic.move(board.getBoard(), command, 'O'));
                    else board.setBoard(logic.move(board.getBoard(), command, 'X'));
                }
            }           

            if(logic.isDraw(board.getBoard()) || logic.isWin(board.getBoard())) break;


            i++;
        }

        System.out.println("Game over. Do you want to play again? (y/n)");
        yn = scanner.next();

        if(yn.toLowerCase().equals("y")) {
            board.initializeBoard();
            start();
        }
    }
}