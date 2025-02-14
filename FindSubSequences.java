import java.util.*;

public class FindSubSequences{

    static ArrayList<String> getSsq(String s){
        ArrayList<String> ans = new ArrayList<>();

        // base case
        if(s.length() == 0){
            ans.add(s);
            return ans;
        }

        // self work
        char curr = s.charAt(0);

        //recursive work

        ArrayList<String> smallAns = getSsq(s.substring(1));

        for(String ss : smallAns){
            ans.add(ss);
            ans.add(curr + ss);
        }

        return ans;

    }

    public static void main(String[] args) {
        ArrayList<String> ans = getSsq("abc");
        
        for(String ss : ans){
            System.out.print(ss+" ");
        }
    }
}