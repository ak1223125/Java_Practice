class A{
    void run(){
        System.out.println("Runnning.");
    }
}

class B extends A{
    void speak(){
        System.out.println("Speaking.");
    }
}

class C extends B{ // Inherit two classes in C . it is also called Multi-level Inheritance.
    void write(){
        System.out.println("Writing.");
    }
}

public class InheritanceMultilevel {
    public static void main(String[] args) {
        C obj = new C(); // creating an object
        obj.run();
        obj.speak();
        obj.write();
    }
}
