import java.util.Scanner;

public class Game {
    User user = new User();
    Computer computer = new Computer();
    static int userScore = 0;
    static int computerScore = 0;
    static int draw = 0;
    static int numberOfGames = 0;

    public static void startGame(){
        Move userMove = User.getMove();
        Move computerMove = Computer.getMove();
        System.out.println("\nВаш ход  " + userMove + ".");
        System.out.println("Ход компьютера  " + computerMove + ".\n");

        if((userMove.equals(Move.SPOCK) && computerMove.equals(Move.LIZARD)) ||
                (userMove.equals(Move.PAPER) && computerMove.equals(Move.LIZARD)) ||
                (userMove.equals(Move.SCISSORS) && computerMove.equals(Move.SPOCK))||
                (userMove.equals(Move.ROCK) && computerMove.equals(Move.SPOCK))||
                (userMove.equals(Move.ROCK) && computerMove.equals(Move.PAPER)) ||
                (userMove.equals(Move.SPOCK) && computerMove.equals(Move.PAPER)) ||
                (userMove.equals(Move.PAPER) && computerMove.equals(Move.SCISSORS)) ||
                (userMove.equals(Move.LIZARD) && computerMove.equals(Move.SCISSORS)) ||
                (userMove.equals(Move.SCISSORS) && computerMove.equals(Move.ROCK)) ||
                (userMove.equals(Move.LIZARD) && computerMove.equals(Move.ROCK))){
            System.out.println("Компьютер победил");
            computerScore++;
        }else if((userMove.equals(Move.LIZARD) && computerMove.equals(Move.SPOCK)) ||
                (userMove.equals(Move.LIZARD) && computerMove.equals(Move.PAPER)) ||
                (userMove.equals(Move.SPOCK) && computerMove.equals(Move.ROCK))||
                (userMove.equals(Move.SPOCK) && computerMove.equals(Move.SCISSORS))||
                (userMove.equals(Move.PAPER) && computerMove.equals(Move.ROCK)) ||
                (userMove.equals(Move.PAPER) && computerMove.equals(Move.SPOCK)) ||
                (userMove.equals(Move.SCISSORS) && computerMove.equals(Move.PAPER)) ||
                (userMove.equals(Move.SCISSORS) && computerMove.equals(Move.LIZARD)) ||
                (userMove.equals(Move.ROCK) && computerMove.equals(Move.SCISSORS)) ||
                (userMove.equals(Move.ROCK) && computerMove.equals(Move.LIZARD))){
            System.out.println("Вы победили");
            userScore++;
        }else {
            draw++;
            System.out.println("Ничья");
        }
        numberOfGames++;
    }
    public static void allGame() {
        Scanner s = new Scanner(System.in);
        System.out.println("Хотите ли вы сыграть ещё раз?(Y/N)");
        String answer = null;
        try {
            answer = s.nextLine();
        } catch (ArithmeticException e) {
            System.out.println("Вы ввели не коректные данные,попробуйте ещё раз");
            allGame();
        }
        String correctAnswer = answer.toUpperCase();
        switch (correctAnswer) {
            case "Y":
                startGame();
                allGame();
            case "N":
                break;
            default:
                System.out.println("Вы ввели не коректные данные,попробуйте ещё раз");
                allGame();
        }
    }

    public static void printGame(){
        int winRate = (userScore*100) / numberOfGames;
        System.out.println("+------------------------------------------------------+");
        System.out.println("| ПОБЕД | ПОРАЖЕНИЙ | НИЧЬИ | ВСЕГО ИГР | ПРОЦЕН ПОБЕД |");
        System.out.printf("|%-7s|%-11s|%-7s|%-11s|%-14s|\n", userScore, computerScore, draw, numberOfGames, winRate);
        System.out.println("+------------------------------------------------------+");
    }
}
