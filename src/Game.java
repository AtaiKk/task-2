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


        int compareMoves = userMove.compareMoves(computerMove);
        switch (compareMoves) {
            case 0:
                System.out.println("Ничья!");
                draw++;
                break;
            case 1:
                System.out.println(userMove + " beats " + computerMove + ". Вы победили!");
                userScore++;
                break;
            case -1:
                System.out.println(computerMove + " beats " + userMove + ". Вы проиграли.");
                computerScore++;
                break;
        }
        numberOfGames++;
    }

    public static void printGame(){
        int winRate = userScore / computerScore*100;
        System.out.println("+------------------------------------------------------+");
        System.out.println("| ПОБЕД | ПОРАЖЕНИЙ | НИЧЬИ | ВСЕГО ИГР | ПРОЦЕН ПОБЕД |");
        System.out.printf("|%-7s|%-11s|%-7s|%-11s|%-14s", userScore, computerScore, draw, numberOfGames, winRate);
        System.out.println("+------------------------------------------------------+");
    }
}
