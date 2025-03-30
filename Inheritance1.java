class Human{
    int hands;
    int legs;
    int brain;
}

class Man extends Human{
    void hand(){
        System.out.println("Two hands.");
    }
    void legs(){
        System.out.println("Two legs.");
    }
    void brain(){
        System.out.println("One brain.");
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
        Man obj = new Man();

        obj.brain();
        obj.brain = 1;

        System.out.println(obj.brain);
    }
}
