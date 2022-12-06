public enum Move {
    ROCK, PAPER, SCISSORS;

    public int compareMoves(Move move) {
        if (this == move)
            return 0;
        switch (this) {
            case ROCK:
                return (move == SCISSORS ? 1 : -1);
            case PAPER:
                return (move == ROCK ? 1 : -1);
            case SCISSORS:
                return (move == PAPER ? 1 : -1);
        }
        return 0;
    }

}
