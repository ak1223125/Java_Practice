import java.util.Scanner;

class Student{ // creating a class for student.
    int roll;
    int age;
    String name;
}

public class Oops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();// creating an object.
        Student s2 = new Student();// creating another object.

        System.out.println("Enter a student name and his age :");
        s1.name = sc.next();
        s1.age = sc.nextInt();

        System.out.println("Enter a student name and his age :");
        s2.name = sc.next();
        s2.age = sc.nextInt();


        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}
