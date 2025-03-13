public class nth_node_fromend {
    public static Node nthNode(Node head, int n){ //n -> nth node from last
        int size = 0;
        Node temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        int m = size - n + 1; //nth node from last
        //mth node from start
        temp = head; //to bring node back to head
        for(int i = 1;i <= m-1; i++){
            temp = temp.next; //for traversing till the element
        }
        return temp;
    }
    public static Node nthNode2(Node head, int n){
        Node slow = head;
        Node fast = head;
        for(int i = 1;i <= n; i++){
            fast = fast.next; //take fast to the point from first
        }
        while(fast != null){
            slow = slow.next; //traverse till fast null is reached
            fast = fast.next; //traverse till null
        }
        return slow;
    }
    public static Node deleteNthFromEnd(Node head, int n){
        Node slow = head;
        Node fast = head;
        for(int i = 1;i <= n;i++){
            fast = fast.next;
        }
        if(fast == null){
            head = head.next;
            return head;
        }
        while(fast.next != null){ //till tail we move fast
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        //100 13 4 5 12 10
        Node q = nthNode2(a,4);  //here a is head
        display(a);
        a = deleteNthFromEnd(a,6);
        display(a);
        //System.out.println(x.data);
        //System.out.println(q.data);
    }
}
