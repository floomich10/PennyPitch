public class Puzzle {

    private int remainingPuzzle = 3;

    public Puzzle(int remainingPuzzle) {

        this.remainingPuzzle = remainingPuzzle;
    }

    public int getPuzzle() {

        return remainingPuzzle;
    }

    public void setPuzzle(int remainingPuzzle) {

        this.remainingPuzzle = remainingPuzzle;
    }
}