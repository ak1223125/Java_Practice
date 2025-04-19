import java.util.Scanner;
public class Stack {
    
        static int stack[] = new int[5];
        static int top = -1;
        static void push(int element){
            if(top == stack.length-1){
                System.out.println("Stack Overflow.");
            }
            else{
                stack[++top] = element;
                System.out.println("element Inserted.");
            }
        }

        static void pop(){
            if(top == -1){
                System.out.println("Stack Underflow");
            }
            else{
                int element = stack[top--];
                System.out.println("Element Deleted. "+element);
            }
        }

        static void display(){
            for(int i = 0; i < stack.length; i++){
                System.out.print(stack[i]+" ");
            }
            System.out.println();
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int choice,element;
        System.out.println("1. push \n2. pop \n3. display \n4. exit ");
        while(true){
            System.out.println("Enter your choice :");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("enter value to push :");
                    element = sc.nextInt();
                    push(element);
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice!!");
            }
        }
    }
}
