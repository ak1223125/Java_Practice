public class MethodOverloading {

    // function with two parameters

    static int add(int num1, int num2){
        return num1+num2;
    }

    // function with three parameters
    
    static int add(int num1, int num2, int num3){
        return num1+num2+num3;
    }


    public static void main(String[] args) {
        System.out.println(add(10,20));

        System.out.println(add(10,20,30));
    }
}
