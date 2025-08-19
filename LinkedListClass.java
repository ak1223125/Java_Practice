public class LinkedListClass {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class LinkedlistA{
        Node head = null;
        Node tail = null;
        int count = 0;
        void insertAtHead(int data){
            Node n1 = new Node(data);
            if(head == null){
                head = n1;
                tail = n1; 
            }
            else{
                n1.next = head;
                head = n1;
            }
            count++;
        }
        void insertAt(int index , int data){
            Node n1 = new Node(data);
            Node temp = head;
            if(index == count){
                insertAtTail(data);
                return;
            }
            else if(index == 0){
                insertAtHead(data);
                return;
            }
            else if(index < 0 || index > count){
                System.out.println("Wrong Index.");
                return;
            }
            for(int i = 1; i <= index-1; i++){
                temp = temp.next;
            }
            n1.next = temp.next;
            temp.next = n1;
        }
        void deleteAt(int index){
            Node temp = head;
            if(index < 0 || index >= count){
                System.out.println("Wrong Index.");
                return;
            }
            else if(index == 0){
                temp = temp.next;
                head = temp;
                return;
            }
            for(int i = 1; i < index; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(index == count-1) tail = temp;
            count--;
        }
        int getAt(int index){
            Node temp = head;
            if(index < 0 || index >= count){
                System.out.println("Wrong Index.");
                return -1;
            }
            for(int i = 0; i < index; i++){
                temp = temp.next;
            }
            return temp.data;
        }
        void insertAtTail(int data){
            Node n1 = new Node(data);
            if(tail == null){
                head = n1;
                tail = n1;
            }
            else{
                tail.next = n1;
                tail = n1;
            }
            count++;
        }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
            LinkedlistA ll = new LinkedlistA();
            ll.insertAtHead(12);
            ll.insertAtHead(14);
            ll.insertAtTail(109);
            ll.insertAtTail(90);
            ll.insertAtHead(50);
            ll.display();
            ll.deleteAt(4); 
            ll.display();
            System.out.println(ll.head.data);
            System.out.println(ll.tail.data);
    }
}
