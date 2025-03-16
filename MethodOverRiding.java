
class Person{
    void fun(){
        System.out.println("I am in A class.");
    }
}

class Student1 extends Person{ // override the function 'fun'
    @Override void fun(){
        System.out.println("I am in B class.");
    }
}

public class MethodOverRiding {
    public static void main(String[] args) {
        Student1 obj = new Student1();
        obj.fun();
    }
}
