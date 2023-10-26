public class Ball {

    private int remainingBall = 3;

    public Ball(int remainingBall) {

        this.remainingBall = remainingBall;
    }

    public int getBall() {

        return remainingBall;
    }

    public void setBall(int remainingBall) {

        this.remainingBall = remainingBall;
    }
}