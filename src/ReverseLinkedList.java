public class ReverseLinkedList {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static Node reverse(Node head){
        if(head.next == null) return head; //base case
        Node newHead = reverse(head.next);
        head.next.next = head; //interchanging connection
        head.next = null;
        return newHead;

    }
    public static void display(Node head){ //always receives head Node
        if(head == null) return; //base case
        System.out.print(head.val+" "); //work
        display(head.next); //call
    }
    public static void displayReverse(Node head){ //always receives head Node
        if(head == null) { //base case
            System.out.println();
            return;
        }
        displayReverse(head.next); //call
        System.out.print(head.val+" "); //work
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(2);
        Node e = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        //displayReverse(a);
        display(a);
        a = reverse(a);
        display(a);
    }
}
