import java.util.InputMismatchException;
import java.util.Scanner;

public class User {
    public static Move getMoveForSecondGame() {
        Scanner s = new Scanner(System.in);
        System.out.println("1 - ROCK \n2 - SCISSORS \n3 - PAPER\n4 - LIZARD\n5 - SPOCK");
        System.out.print("Выберите чем будете ходить (1, 2, 3, 4 или 5): ");
        int chooseMove = 0;
        try {
            chooseMove = s.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не коректные данные, попробуйте ещё раз");
            getMoveForSecondGame();
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
                return getMoveForSecondGame();
        }
    }

    public static MoveForFirstGame getMoveForFirstGame(){
        Scanner s = new Scanner(System.in);
        System.out.println("1 - ROCK \n2 - SCISSORS \n3 - PAPER");
        System.out.print("Выберите чем будете ходить (1, 2 или 3): ");
        int chooseMove = 0;
        try {
            chooseMove = s.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не коректные данные, попробуйте ещё раз");
            getMoveForSecondGame();
        }
        switch (chooseMove) {
            case 1:
                return MoveForFirstGame.ROCK;
            case 2:
                return MoveForFirstGame.SCISSORS;
            case 3:
                return MoveForFirstGame.PAPER;
            default:
                System.out.println("Вы ввели не коректные данные, попробуйте ещё раз");
                return getMoveForFirstGame();
        }
    }

}
