import java.util.*;
public class StringQuestionsPrefix {
    static String commonPrefix(String[] str){
        String result = "";
        for(int i = 1; i < str.length; i++){
            for(int j = 0; j < str[i].length(); j++){
                if(str[i-1].charAt(j) == str[i].charAt(j)){
                    if(i == 1) result += "" + str[i].charAt(j);
                    else result = ""+str[i].charAt(j);
                }
                else{
                    break;
                }
            }
        }
        if(result == "") return "";
        else return result;
    } 

    public static void main(String[] args) {
        String[] str = {"rwce","reme","ram"};
        String ans = commonPrefix(str);
        System.out.println(ans);
    }
}
