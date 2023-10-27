import java.util.Random;

class Main {

  public static String fillSpot(Random rand, Game game, Doll doll, Ball ball, Poster poster, Puzzle puzzle) {

    int randomSelection = rand.nextInt(7);

    switch(randomSelection) {

      case 0: 
        return "Empty";
      case 1:
        return "Empty";
      case 2:
        if (game.getGame() > 0) {

          game.setGame(game.getGame() - 1);
          return "Game";
        } else {

          randomSelection++;
        }
      case 3:
        if (doll.getDoll() > 0) {

          doll.setDoll(doll.getDoll() - 1);
          return "Doll";
        } else {

          randomSelection++;
        }
      case 4:
        if (poster.getPoster() > 0) {

          poster.setPoster(poster.getPoster() - 1);
          return "Poster";
        } else {

          randomSelection++;
        }
      case 5:
        if (ball.getBall() > 0) {

          ball.setBall(ball.getBall() - 1);
          return "Ball";
        } else {

          randomSelection++;
        }
      case 6:
        if (puzzle.getPuzzle() > 0) {

          puzzle.setPuzzle(puzzle.getPuzzle() - 1);
          return "Puzzle";
        } else {

          randomSelection++;
        }
      case 7:
        randomSelection = rand.nextInt(6);
    }

    return("Empty");




  }


  public static void main(String[] args) {

    Random rand = new Random();

    String[][] board = new String[5][5];

    int remainingPuzzle = 3;
    int remainingBall = 3;
    int remainingPoster = 3;
    int remainingGame = 3;
    int remainingDoll = 3;

    boolean first = false;

    Game game = new Game(remainingGame);
    Doll doll = new Doll(remainingDoll);
    Ball ball = new Ball(remainingBall);
    Poster poster = new Poster(remainingPoster);
    Puzzle puzzle = new Puzzle(remainingPuzzle);
    

    for (int x = 0; x < board.length; x++) {

      // loops through each row

      if (x == 0) {

        first = true;
      } else {

        first = false;
      }

      for (int y = 0; y < board[x].length; y++) {

        // loops through each cell in given row

        if (y == 0) {

          if (first != true) {

              System.out.println("\n");
              System.out.print(fillSpot(rand, game, doll, ball, poster, puzzle));
          } else {

              System.out.print(fillSpot(rand, game, doll, ball, poster, puzzle));
          }
        } else {

          System.out.print(" | " + fillSpot(rand, game, doll, ball, poster, puzzle));
        }
      }
    }

    System.out.println("\n");
    System.out.println(game.getGame());
    System.out.println(ball.getBall());
    System.out.println(doll.getDoll());
    System.out.println(poster.getPoster());
    System.out.println(puzzle.getPuzzle());


    

  }

}
