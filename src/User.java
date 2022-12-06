import java.util.Scanner;

public class User {
    public static Move getMove(){
        Scanner s = new Scanner(System.in);
        System.out.printf("1 - Камень \n2 - Ножницы \n3 - Бумага\n");
        System.out.print("Выберите чем будете ходить (1, 2 или 3): ");
        int chooseMove = s.nextInt();
        switch (chooseMove){
            case 1:
                return Move.ROCK;
            case 2:
                return Move.SCISSORS;
            case 3:
                return Move.PAPER;
            default:
                System.out.println("Вы ввели не коректные данные, попробуйте ещё раз");
                return getMove();
        }


    }
}
