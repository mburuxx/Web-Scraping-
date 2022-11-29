import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
 
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
 
        students.add(new Student("John", "Math", "No", "Mike", 20));
        students.add(new Student("Jessy", "English", "No", "Mary", 22));
        students.add(new Student("Jully", "Math", "Yes", "Mike", 19));
        students.add(new Student("Tom", "Biology", "No", "John", 18));
        students.add(new Student("Stive", "Computer Science", "Yes", "Mike", 21));
        students.add(new Student("Linda", "English", "No", "Mike", 23));
 
        // print all students
        for (Student student : students) {
            System.out.println(student);
        }
 
        // print all students that have passed the test
        for (Student student : students) {
            if (student.getTestPass().equals("Yes")) {
                System.out.println(student);
            }
        }
 
        // print all students that their age is above 20
        for (Student student : students) {
            if (student.getAge() > 20) {
                System.out.println(student);
            }
        }
 
        // print all students of English major
        for (Student student : students) {
            if (student.getMajor().equals("English")) {
                System.out.println(student);
            }
        }
 
        // sort students by age
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
 
        // print all students
        for (Student student : students) {
            System.out.println(student);
        }
    }
}