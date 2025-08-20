public class NthNodeFromEnd {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    static Node nthNodefromEnd(Node head,int n){
        Node temp = head;
        int count = 0;
        for(; temp != null; count++){
            temp = temp.next;
        }
        
        int fromLast = (count - n)+1;
        temp = head;
        for(int i = 1; i < fromLast; i++){
            temp = temp.next;
        }
        return temp;
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

        Node ans = nthNodefromEnd(a,1);
        System.out.print(ans.data+" ");
        ans = nthNodefromEnd(a,2);
        System.out.print(ans.data+" ");
        ans = nthNodefromEnd(a,3);
        System.out.print(ans.data+" ");
        ans = nthNodefromEnd(a,4);
        System.out.print(ans.data+" ");
        ans = nthNodefromEnd(a,5);
        System.out.print(ans.data+" ");
    }    
}
