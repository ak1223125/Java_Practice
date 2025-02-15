import java.util.Scanner;
public class FindSubSequencesUsingRecursion{

    static void findSubSequences(String str , String currentAns){ // abc

        if(str.length() == 0){
            System.out.print(currentAns +" ");
            return;
        }
        char curr = str.charAt(0); // a

        String remString = str.substring(1); // bc
        // char curr --> choose to be a part of currAns
        findSubSequences(remString, currentAns + curr);
        // char curr --> does not choose to be a part of currAns
        findSubSequences(remString, currentAns);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any String : ");
        String Word = sc.nextLine();

        findSubSequences(Word , "");
    }
}