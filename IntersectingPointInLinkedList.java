public class IntersectingPointInLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }    
    }
    static Node intersectingPointNode(Node head1,Node head2){
        int lengthOfhead1 = 0;
        int lengthOfhead2 = 0;

        Node temp1 = head1;
        Node temp2 = head2;

        while(temp1 != null){
            temp1 = temp1.next;
            lengthOfhead1++;
        }
        while(temp2 != null){
            temp2 = temp2.next;
            lengthOfhead2++;
        }

        temp1 = head1;
        temp2 = head2;

        int differencebtlen;
        if(lengthOfhead1 <= lengthOfhead2){
            differencebtlen = lengthOfhead2-lengthOfhead1;
            for(int i = 1; i <= differencebtlen; i++){
                temp2 = temp2.next;
            }
        }
        else{
            differencebtlen = lengthOfhead1-lengthOfhead2;
            for(int i = 1; i <= differencebtlen; i++){
                temp1 = temp1.next;
            }
        }        

        while(temp1 != null){
            if(temp1 == temp2){
                return temp1;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
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

        Node a1 = new Node(12);
        Node b1 = new Node(6);

        a1.next = b1;
        b1.next = a;

        Node temp = intersectingPointNode(a, a1);
        System.out.println(temp.data);
        
    }
}
