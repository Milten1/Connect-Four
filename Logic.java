public class Logic {
    private char[][] logicBoard;

    public Logic(){
        this.logicBoard = new char[7][6];
    }

    public int[] convertCommandToCoordinates(String command){
        
        
        //coordinates format example; a3
        
        String[] cmd = command.split("");

        int[] coordinates = new int[2];
        
        coordinates[1] = letterToNumber(cmd[0])-1;
        coordinates[0] = Integer.valueOf(cmd[1])-1;
        
        
        return coordinates;
    }

    public int letterToNumber(String letter){
        switch(letter){
            case "a": return 1;
            case "b": return 2;
            case "c": return 3;
            case "d": return 4;
            case "e": return 5;
            case "f": return 6;

        }
        return 0;
    }

    public char[][] moveRandom(char[][] board) {
        return board;
    }

    public char[][] move(char[][] board, String command){
        logicBoard = board;
        int[] coor = convertCommandToCoordinates(command);
        
        logicBoard[coor[0]][coor[1]] = 'X';

        return logicBoard;
    }
}
