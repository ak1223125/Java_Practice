class Person{
    String name;
    int age;
    
    public void setNameAndAge(String n ,int a){
        this.name = n;
        this.age = a;
    }

    public void printDetails(){
        System.out.println("Name of the person : "+this.name);
        System.out.println("Age of the person : "+this.age);        
    }

}

public class ClassAndObject {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.setNameAndAge("Srikant", 20);

        p1.printDetails();
        
    }
}
