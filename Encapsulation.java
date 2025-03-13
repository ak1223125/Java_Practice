class Employee{ // Example of Encapsulation
    private int salary;
    public void setSalary(int s){
        this.salary = s;
    }
    public int getSalary(){
        return this.salary;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setSalary(50000);
        System.out.println("Salary of first employee :");
        System.out.println(e1.getSalary());
    }
}
