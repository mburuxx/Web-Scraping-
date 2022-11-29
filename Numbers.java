
public class Numbers {
 
  public static void main(String[] args) {
    
    //declare variables
    int i, j, sumOdd = 0, sumEven = 0;
    
    //nested for loop for prime numbers
    for(i=2; i<=100; i++) {
      for(j=2; j<i; j++) {
        if(i%j == 0) break;
      }
      //if condition to check if the number is prime
      if(i == j) {
        System.out.print(i + " ");
      }
    }
    
    System.out.println("");
    
    //for loop for even numbers
    for(i=1; i<=100; i++) {
      if(i%2 == 0) {
        System.out.print(i + " ");
        sumEven += i;
      }
    }
    
    System.out.println("");
    
    //for loop for odd numbers
    for(i=1; i<=100; i++) {
      if(i%2 != 0) {
        System.out.print(i + " ");
        sumOdd += i;
      }
    }
    
    //display output
    System.out.println("\nSum of odd numbers: " + sumOdd);
    System.out.println("\nSum of even numbers: " + sumEven);
  }
}