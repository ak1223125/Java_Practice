import java.util.Scanner;

public class StringMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any name :");
        String name = sc.nextLine();

        System.out.println("Upper case (method):");
        System.out.println(name.toUpperCase());
    }
    
}
