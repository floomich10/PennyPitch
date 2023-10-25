import java.util.Random;

class Main {

  public static String assignPrize(Random rand, int remainingPuzzle, int remainingBall, int remainingPoster, int remainingGame, int remainingDoll) {

    String puzzle = "PUZZLE";
    String ball = "BALL";
    String poster = "POSTER";
    String game = "GAME";
    String doll = "DOLL";

    int randPrize = rand.nextInt(6);

    if (randPrize == 1 && remainingPuzzle > 0) {

      return puzzle;
    } else if (randPrize == 2 && remainingBall > 0) {

      return ball;
    } else if (randPrize == 3 && remainingPoster > 0) {

      return poster;
    } else if (randPrize == 4 && remainingGame > 0) {

      return game;
    } else if (randPrize == 5 && remainingDoll > 0) {

      return doll;
    } else if (randPrize != 0) {

      assignPrize(rand, remainingPuzzle, remainingBall, remainingPoster, remainingGame, remainingDoll);
    }

    return "Empty";
  }

  public static void main(String[] args) {

    Random rand = new Random();

    String[][] board = new String[5][5];

    int remainingPuzzle = 3;
    int remainingBall = 3;
    int remainingPoster = 3;
    int remainingGame = 3;
    int remainingDoll = 3;

    for (int x = 0; x < board.length; x++) {

      for (int y = 0; y < board[x].length; y++) {

        board[x][y] = assignPrize(rand, remainingPuzzle, remainingBall, remainingPoster, remainingGame, remainingDoll);

        if (board[x][y] == "PUZZLE") {

          remainingPuzzle--;
        } else if (board[x][y] == "BALL") {

          remainingBall--;
        } else if (board[x][y] == "POSTER") {

          remainingPoster--;
        } else if (board[x][y] == "GAME") {

          remainingGame--;
        } else if (board[x][y] == "DOLL") {

          remainingDoll--;
        }


        System.out.println(board[x][y] + ". " + x +""+ y);
        System.out.println("Puzzle: " + remainingPuzzle + ". Game: " + remainingGame + ". Doll: " + remainingDoll + ". Ball: " + remainingBall + ". Poster: " + remainingPoster);
      }
    }



    

  }

}
