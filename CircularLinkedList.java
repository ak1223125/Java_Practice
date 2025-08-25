public class CircularLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }    
    }
    static void printList(Node head){
        Node temp = head.next;
        System.out.print(head.data+" ");
        while(temp != head){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = a;

        printList(a);
    }
}
