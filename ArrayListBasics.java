import java.util.ArrayList;

public class ArrayListBasics {
    public static void main(String[] args) {
        // wapper classes
        //Integer i = Integer.valueOf(0);
        //System.out.println(i);

        //Float f = Float.valueOf(9.9f);
        //System.out.println(f);

        // syntax of array list
        ArrayList<Integer>l1 = new ArrayList <Integer>();

        // add element in array list
        l1.add(5);
        l1.add(4);
        l1.add(7);
        l1.add(8);

        // get an element at index i
        System.out.println(l1.get(0));  

        //print with for loop
        for(int i = 0; i < l1.size(); i++){
            System.out.print(l1.get(i)+" ");
        }
        System.out.println();

        // direct print array list without using for loop
        System.out.println(l1);

        //adding element at some index i // [5, 100, 7, 8]
        l1.add(1, 100);
        System.out.println(l1);

        //modifying element at index i
        l1.set(1, 10);
        System.out.println(l1);

        // remove an index i in array list
        l1.remove(1);
        System.out.println(l1);

        // remove an element in array list
        l1.remove(Integer.valueOf(7));
        System.out.println(l1);

        // checking if an element exists
        boolean ans = l1.contains(Integer.valueOf(4));
        System.out.println(ans);

        // if you don't specify class, you can put anything inside l

        ArrayList l = new ArrayList();
        l.add("please");
        l.add(1);
        l.add('a');
        System.out.println(l);

    }
}
