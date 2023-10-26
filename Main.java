import java.util.Random;

class Main {

  public static String fillSpot(Random rand) {

    int randomSelection = rand.nextInt(6);

    switch(randomSelection) {

      case 0: 
        return "Empty spot";
        break;
      case 1:
        return "Game";
        break;
      case 2:
        return "Doll";
        break;
      case 3:
        return "Poster";
        break;
      case 4:
        return "Ball";
        break;
      case 5:
        return "Puzzle";
        break;
    }




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

      // loops through each row

      for (int y = 0; y < board[x].length; y++) {

        // loops through each cell in given row

        fillSpot(rand);

        
      }
    }



    

  }

}
