import java.util.*;
public class AddAnyCharacter {
    public static void main(String[] args) {
        String str = "abc";
        str += 'x';
        str += 10;
        str += 20;
        str += 20+10;
        System.out.println(str); 
    }
}
