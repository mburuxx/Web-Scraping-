import java.util.*;
 
public class MusicalChairs
{
 
   public static void main(String[] args)
   {
      try (Scanner keyboard = new Scanner(System.in)) {
        int numPlayers, numChairs;
 
          System.out.print("Enter the number of players: ");
          numPlayers = keyboard.nextInt();
 
          System.out.print("Enter the number of chairs: ");
          numChairs = keyboard.nextInt();
 
          // YOUR CODE HERE
          int[] players = new int[numPlayers];
          int[] chairs = new int[numChairs];
          int currentPlayer = 0;
          int currentChair = 0;
 
 
          for (int i = 0; i < numPlayers; i++)
          {
             players[i] = i + 1;
          }
 
          for (int i = 0; i < numChairs; i++)
          {
             chairs[i] = i + 1;
          }
 
          while (numPlayers > 1)
          {
             System.out.println("Player " + players[currentPlayer] + " is in chair " + chairs[currentChair]);
             System.out.println("Switch!");
 
             currentPlayer++;
             if (currentPlayer == numPlayers)
             {
                currentPlayer = 0;
             }
 
             currentChair++;
             if (currentChair == numChairs)
             {
                currentChair = 0;
             }
 
             System.out.println("Player " + players[currentPlayer] + " is in chair " + chairs[currentChair]);
             System.out.println("A chair is tipped over!");
 
             int playerToEliminate = currentPlayer - 1;
             if (playerToEliminate == -1)
             {
                playerToEliminate = numPlayers - 1;
             }
 
             for (int i = playerToEliminate; i < numPlayers - 1; i++)
             {
                players[i] = players[i + 1];
             }
 
             numPlayers--;
 
             System.out.println("Player " + players[currentPlayer] + " is eliminated!");
          }
 
          System.out.println("Player " + players[0] + " is the winner!");
    }
   }
}