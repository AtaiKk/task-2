import java.util.Scanner;

public class User {
    public static Move getMove() {
        Scanner s = new Scanner(System.in);
        System.out.printf("1 - ROCK \n2 - SCISSORS \n3 - PAPER\n");
        System.out.print("Выберите чем будете ходить (1, 2 или 3): ");
        int chooseMove = 0;
        try {
            chooseMove = s.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Вы ввели не коректные данные, попробуйте ещё раз");
            getMove();
        }
        switch (chooseMove) {
            case 1:
                return Move.ROCK;
            case 2:
                return Move.SCISSORS;
            case 3:
                return Move.PAPER;
            case 4:
                return Move.LIZARD;
            case 5:
                return Move.SPOCK;
            default:
                System.out.println("Вы ввели не коректные данные, попробуйте ещё раз");
                return getMove();
        }


    }
}
