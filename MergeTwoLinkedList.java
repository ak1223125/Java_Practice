public class MergeTwoLinkedList {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    static Node mergeTwoList(Node head1, Node head2){
        Node temp = new Node(100);
        Node t = temp;
        Node h1 = head1;
        Node h2 = head2;
        
        while(h1 != null && h2 != null){
            if(h1.data < h2.data){
                t.next = h1;
                t = h1;
                h1 = h1.next;
            }
            else{
                t.next = h2;
                t = h2;
                h2 = h2.next;
            }
        }
        if(h1 == null){
            t.next = h2;
        }
        else{
            t.next = h1;
        }
        temp = temp.next;
        return temp;
    } 
    static void displayLinkedList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(8);
        Node c = new Node(10);
        Node d = new Node(12);
        Node e = new Node(16);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        
        Node a1 = new Node(1);
        Node b2 = new Node(2);
        Node c3 = new Node(4);
        Node d4 = new Node(9);

        a1.next = b2;
        b2.next = c3;
        c3.next = d4;

        Node temp = mergeTwoList(a, a1);

        displayLinkedList(temp);

    }
}
