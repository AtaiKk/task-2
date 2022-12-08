import java.util.Random;

public class Computer {

    public static MoveForFirstGame getMoveForFirstGame(){
        MoveForFirstGame[] moves = MoveForFirstGame.values();
        Random random = new Random();
        int index = random.nextInt(moves.length);
        return moves[index];
    }
    public static Move getMoveForSecondGame(){
        Move[] moves = Move.values();
        Random random = new Random();
        int index = random.nextInt(moves.length);
        return moves[index];
    }
}
