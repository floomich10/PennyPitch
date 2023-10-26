public class Poster {

    private int remainingPoster = 3;

    public Poster(int remainingPoster) {

        this.remainingPoster = remainingPoster;
    }

    public int getPoster() {

        return remainingPoster;
    }

    public void setPoster(int remainingPoster) {

        this.remainingPoster = remainingPoster;
    }
}