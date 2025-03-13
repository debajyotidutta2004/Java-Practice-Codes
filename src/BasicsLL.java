public class BasicsLL {
    public static void insertatEnd(Node head, int val){
        Node temp = new Node(val);
        Node t = head;
        while(t.next != null){  //1 value before null
            t = t.next;
        }
        t.next = temp;
    }
    public static void displayreverse(Node head){
        if(head == null) return;
        displayr(head.next);
        System.out.print(head.data+" ");
    }

    public static void displayr(Node head){
        if(head == null) return;
        System.out.print(head.data+" ");
        displayr(head.next);
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static int length(Node head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){ //constructor
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(100);
        Node f = new Node(23);
        // 5 -> 3-> 9 -> 8 -> 18
        a.next = b;  // 5-> 3
        b.next = c;/// 5 -> 3 -> 9
        c.next = d; // 5 -> 3 -> 9 -> 8
        d.next = e; // 5 -> 3 -> 9 -> 8 -> 18  //linked list
        e.next = f;
        System.out.println(length(a));
        //Node temp = a;
        //System.out.println(a.data );
        //displayr(a);


        //while(temp != null){  //printing the list
        //    System.out.println(temp.data);
        //    temp = temp.next;
        //}

        //System.out.println(a.data);
        //System.out.println(a.next.data); //data of b
        //System.out.println(a.next.next.data); //data of c
        //System.out.println(a.next.next.next.data); //data of d
        //System.out.println(a.next.next.next.next.data); // data of e
        //System.out.println(a);   //$Node@6acbcfc0
        //System.out.println(a.next); //$Node@5f184fc6
        //System.out.println(b);   //$Node@5f184fc6
        //System.out.println(c);    //$Node@3feba861
        insertatEnd(a, 87); //Node -> a, Value -> 87
        display(a);
    }

}
