import java.util.Scanner;

public class Game {
    private Board board;
    private Logic logic;

    public Game(){
        this.board = new Board();
        this.logic - new Logic();
    }

    public void start() {
        System.out.print("Do you want to play with AI or second player? (y/n): ");
        Scanner scanner = new Scanner(System.in);
        Char yn = scanner.next();
        System.out.println();

        while(true){
            System.out.println("Choose field: ");
            String command = scanner.next();

        }

        board.printBoard();

    }
}
