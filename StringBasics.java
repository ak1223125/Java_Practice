import java.util.Scanner;
public class StringBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a any name :");
        String name = sc.nextLine();

        System.out.println("Enter a another name :");
        String name2 = sc.next();

        System.out.println("Difference between nextLine() and next() :");
        System.out.println(name);
        System.out.println(name2);
    }
}
