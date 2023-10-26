
public class Prizes {

    private int remainingPuzzle = 3;
    private int remainingBall = 3;
    private int remainingPoster = 3;
    private int remainingGame = 3;
    private int remainingDoll = 3;

    public Prizes(int remainingPuzzle, int remainingBall, int remainingPoster, int remainingGame, int remainingDoll) {

        this.remainingPuzzle = remainingPuzzle;
        this.remainingBall = remainingBall;
        this.remainingPoster = remainingPoster;
        this.remainingGame = remainingGame;
        this.remainingDoll = remainingDoll;
    }

    public int getPuzzle() {

        return remainingPuzzle;
    }

    public void setPuzzle(int remainingPuzzle) {

        this.remainingPuzzle = remainingPuzzle;
    }

    public int getBall() {

        return remainingBall;
    }

    public void setBall(int remainingBall) {

        this.remainingBall = remainingBall;
    }

    public int getPoster() {

        return remainingPoster;
    }

    public void setPoster(int remainingPoster) {

        this.remainingPoster = remainingPoster;
    }

    public int getGame() {

        return remainingGame;
    }

    public void setGame(int remainingGame) {

        this.remainingGame = remainingGame;
    }

    public int getDoll() {

        return remainingDoll;
    }

    public void setDoll(int remainingDoll) {

        this.remainingDoll = remainingDoll;
    }

    public String toString() {

        String prizesString;

        prizesString = "Remaining Puzzles: " + this.remainingPuzzle + ". Remaining Games: " + this.remainingGame + ". Remaining Dolls: " + this.remainingDoll + ". Remaining Balls: " + this.remainingBall + ". Remaining Posters: " + this.remainingPoster;
    
        return prizesString;
    }




}