import java.util.ArrayList;
import java.util.Collections;

public class CollectionArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(12);
        list.add(3);
        list.add(41);
        list.add(57);

        System.out.println("Original Array List : ");
        System.out.println(list);

        //Collections.reverse(list);

        //System.out.println("Reversed Array List : ");
        //System.out.println(list);

        Collections.sort(list);
        System.out.println("Sorted list in ascending order : ");
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted list in decending order : ");
        System.out.println(list);

    }
}
