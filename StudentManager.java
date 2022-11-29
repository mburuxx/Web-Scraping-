import java.util.Scanner;

public class StudentManager {

public static void main(String[] args) {

try (Scanner sc = new Scanner(System.in)) {
    int choice;
    
    do {
    
    System.out.println("Enter your choice:");
    
    System.out.println("1. Add a Student");
    
    System.out.println("2. Delete a Student");
    
    System.out.println("3. Edit a Student");
    
    System.out.println("4. Mark a student as having 'passed' the test");
    
    System.out.println("5. Display all students and all their information");
    
    System.out.println("6. Display all students that have passed the test");
    
    System.out.println("7. Display all students that their age is above a certain age");
    
    System.out.println("8. Display all students of a specific major");
    
    System.out.println("9. Sort students by age");
    
    System.out.println("10.Exit");
    
    choice = sc.nextInt();
    
    switch (choice) {
    
    case 1:
    
       //Add a Student
    
    break;
    
    case 2:
    
       //Delete a Student
    
    break;
    
    case 3:
    
       //Edit a Student
    
    break;
    
    case 4:
    
       //Mark a student as having "passed" the test
    
    break;
    
    case 5:
    
       //Display all students and all their information
    
    break;
    
    case 6:
    
       //Display all students that have passed the test
    
    break;
    
    case 7:
    
       //Display all students that their age is above a certain age
    
    break;
    
    case 8:
    
       //Display all students of a specific major
    
    break;
    
    case 9:
    
       //Sort students by age
    
    break;
    
    case 10:
    
       //Exit
    
    break;
    
    default:
    
       System.out.println("Invalid choice");
    
    }
    
    } while (choice != 10);
}

}

}