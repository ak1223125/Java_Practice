public class DeleteMiddleNode {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }    
    }
    public static Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;
        int count = 0;
        while(fast != null){
            fast = fast.next;
            count++;
        }
        fast = head;

        if(count % 2 == 0){
            while(fast.next.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
        }
        else{
            while(fast.next.next.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
        }
        slow.next = slow.next.next;
        return head;
    }
    static void display(Node head){
        Node temp = head;
        while(temp != null){
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
        Node f = new Node(22);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        display(a);
        Node ans = middleNode(a);
        display(ans);
    }
}
