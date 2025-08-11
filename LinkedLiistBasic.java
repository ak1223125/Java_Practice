import java.util.*;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

public class LinkedLiistBasic {

    public static void printLinkedList(Node head){
        Node temp = head;
        int i = 0;
        System.out.println("All Elements in Linked List :");
        for(i = 0; temp != null; i++){
           System.out.print(temp.data+" ");
           temp = temp.next; 
        }
        System.out.println();
        System.out.println("Total Element in Linked List :");
        System.out.println(i);
    }

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        printLinkedList(n1);
    }
}
