import java.util.*;
public class ReverseArrayList {
    
    static void reverseArraylist(ArrayList<Integer> list){

        int i = 0;
        int j = list.size() - 1;

        while(i < j){

            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j,temp);

            i++;
            j--;
        }

        System.out.println("Reversed Array List :");

        System.out.println(list);

    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original Array List : ");
        System.out.println(list);


        reverseArraylist(list);

    }
}
