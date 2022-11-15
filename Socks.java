import java.util.Arrays;

public class Socks {
 
    public static void main(String[] args) {
   
      // Read input from user
      System.out.print("Enter number of socks: ");
      int n = Integer.parseInt(System.console().readLine());
   
      System.out.print("Enter threshold: ");
      int threshold = Integer.parseInt(System.console().readLine());
   
      // Initialize array of socks
      int[] socks = new int[n];
   
      // Read in sock values
      for (int i = 0; i < n; i++) {
        System.out.print("Enter sock " + (i+1) + ": ");
        socks[i] = Integer.parseInt(System.console().readLine());
      }
   
      // Sort socks in increasing order
      Arrays.sort(socks);
   
      // Initialize number of pairs to 0
      int numPairs = 0;
   
      // Initialize index of first sock in the current pair
      int i = 0;
   
      // While there are still socks remaining
      while (i < n) {
   
        // Initialize index of second sock in the current pair
        int j = i + 1;
   
        // While the socks are the same color
        while (j < n && Math.abs(socks[i] - socks[j]) <= threshold) {
          j++;
        }
   
        // Update number of pairs
        numPairs += (j - i) / 2;
   
        // Move on to next sock
        i = j;
      }
   
      // Print out result
      System.out.println("Maximum number of pairs: " + numPairs);
    }
  }