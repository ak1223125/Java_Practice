class Node{
    int value;
    Node next;
    Node(int v, Node ad){
        this.value = v;
        this.next = ad;
    }
}
public class LinkedList {
    public static void main(String[] args) {
        Node head1 = new Node(10, null);
        Node head2 = new Node(20, null);
        Node head3 = new Node(30, null);

        head1.next = head2;
        head2.next = head3;

        System.out.println(head1.value);
        System.out.println(head3.value);
    }
}
