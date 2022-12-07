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

        if((userMove.equals(Move.ROCK) && computerMove.equals(Move.PAPER)) || (userMove.equals(Move.PAPER) && computerMove.equals(Move.SCISSORS)) ||
                (userMove.equals(Move.SCISSORS) && computerMove.equals(Move.ROCK))){
            System.out.println("Компьютер победил");
            computerScore++;
        }else if((userMove.equals(Move.PAPER) && computerMove.equals(Move.ROCK)) || (userMove.equals(Move.SCISSORS) && computerMove.equals(Move.PAPER)) ||
                (userMove.equals(Move.ROCK) && computerMove.equals(Move.SCISSORS))){
            System.out.println("Вы победили");
            userScore++;
        }else {
            draw++;
            System.out.println("Ничья");
        }
    }

    public static void printGame(){
        int winRate = (userScore / computerScore)*100;
        System.out.println("+------------------------------------------------------+");
        System.out.println("| ПОБЕД | ПОРАЖЕНИЙ | НИЧЬИ | ВСЕГО ИГР | ПРОЦЕН ПОБЕД |");
        System.out.printf("|%-7s|%-11s|%-7s|%-11s|%-14s|\n", userScore, computerScore, draw, numberOfGames, winRate);
        System.out.println("+------------------------------------------------------+");
    }
}
