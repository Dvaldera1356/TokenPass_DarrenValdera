package DarrenValdera;

public class TokenPassRunner {
    public static void main(String [] args){
        //create a testGame using the constructor
        TokenPass testGame = new TokenPass (playerCount: 10);
        //Print the board to see what's in it
        int [] testBoard = testGame.getBoard();
        System.out.println("Constructed a testBoard: ");
        for (int i = 0; i < testBoard.length; i++ )
        {
            System.out.print(testBoard[i] + " ");
        }
        System.out.println();
        //Now test distributeCurrentPlayerTokens
        testGame.distributeCurrentPlayerTokens();
        System.out.println("After distributing tokens from player " + testGame.getCurrentPlayer() + ": ");
        for (int i = 0; i < testBoard.length; i++)
        {
            System.out.print(testBoard[i] + " ");
        }
    }
}
