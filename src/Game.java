public class Game {
    public static void startGame(){
        Move userMove = User.getMove();
        Move computerMove = Computer.getMove();
        System.out.println("\nВаш ход  " + userMove + ".");
        System.out.println("Ход компьютера  " + computerMove + ".\n");
    }
}
