package homeWork.extra.youtube.ticTacToe;

import java.util.*;

public class TicTacToe {

    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();

    public static void main(String[] args) {

        char[][] gameBoard = {{'1','|','2','|','3'},
                {'-','+','-','+','-'},
                {'4','|','5','|','6'},
                {'-','+','-','+','-'},
                {'7','|','8','|','9'}};

        printGameBoard(gameBoard);

        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Выберите поле от 1 до 9: ");
            int playerPosition = scanner.nextInt();
            while (playerPositions.contains(playerPosition) || cpuPositions.contains(playerPosition)){
                System.out.println("Поле занято! Выберите другое");
                playerPosition = scanner.nextInt();
            }

            placePiece(gameBoard, playerPosition, "player");

            String result = checkWinner();
            if(result.length() > 0){
                System.out.println(result);
                break;
            }
            Random random = new Random();
            int cpuPosition = random.nextInt(9) + 1;
            while (playerPositions.contains(cpuPosition) || cpuPositions.contains(cpuPosition)){
                cpuPosition = random.nextInt(9) + 1;
            }
            placePiece(gameBoard, cpuPosition, "cpu");

            printGameBoard(gameBoard);
            result = checkWinner();
            if(result.length() > 0){
                System.out.println(result);
                break;
            }
        }
    }
    public static void printGameBoard (char[][] gameBoard){
        for (char[] i : gameBoard){
            for(char j : i){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void placePiece(char[][] gameBoard, int position, String user){
        char symbol = ' ';

        if(user.equals("player")){
            symbol = 'X';
            playerPositions.add(position);
        } else if (user.equals("cpu")){
            symbol = '0';
            cpuPositions.add(position);
        }
        switch (position){
            case 1 :
                gameBoard[0][0] = symbol;
                break;
            case 2 :
                gameBoard[0][2] = symbol;
                break;
            case 3 :
                gameBoard[0][4] = symbol;
                break;
            case 4 :
                gameBoard[2][0] = symbol;
                break;
            case 5 :
                gameBoard[2][2] = symbol;
                break;
            case 6 :
                gameBoard[2][4] = symbol;
                break;
            case 7 :
                gameBoard[4][0] = symbol;
                break;
            case 8 :
                gameBoard[4][2] = symbol;
                break;
            case 9 :
                gameBoard[4][4] = symbol;
                break;
            default:
                break;
        }
    }
    public static String checkWinner(){
        List topRow = Arrays.asList(1,2,3);
        List midRow = Arrays.asList(4,5,6);
        List botRow = Arrays.asList(7,8,9);
        List leftCol = Arrays.asList(1,4,7);
        List midCol = Arrays.asList(2,5,8);
        List rightCol = Arrays.asList(3,6,9);
        List cross1 = Arrays.asList(1,5,9);
        List cross2 = Arrays.asList(7,5,3);

        List<List> winning = new ArrayList<>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(botRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rightCol);
        winning.add(cross1);
        winning.add(cross2);
        for(List list : winning){
            if (playerPositions.containsAll(list)){
                return "Поздравляю, вы выиграли!";
            }else if (cpuPositions.containsAll(list)) {
                return "Выиграл компьютер! :(\nВам повезет в следующий раз!";
            }else if (playerPositions.size() + cpuPositions.size() == 9){
                return "Ничья!";
            }
        }
        return "";
    }
}
