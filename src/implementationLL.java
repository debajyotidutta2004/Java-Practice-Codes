public class implementationLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedlist{
        Node head = null; //Node is a user defined data type
        Node tail=null;
        int size = 0;
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){  //empty list
                head = temp;
            }
            else{
                tail.next = temp;
            }
            tail = temp;
            size++;
        }
        void insertAtHead(int val) {
            Node temp = new Node(val); //Node temp is created
            if (head == null) { //empty list
                head = temp;
                tail = temp;
            } else {  //Non-empty list
                temp.next = head;
                head = temp;
            }
            size++;
        }
        void insertAt(int idx, int val){
            Node t = new Node(val);
            Node temp = head;
            if(idx == size()){
                insertAtEnd(val); //last value gets printed
                return;
            }else if(idx == 0){
                insertAtHead(val);
                return;
            }
            else if(idx < 0){
                System.out.println("Wrong index");
                return;
            }
            else if(idx > size()){
                System.out.println("Wrong index");
                return;
            }
            for(int i =1 ; i <= idx - 1;i++){
                temp = temp.next; //for taking temp forward
            }
            t.next = temp.next;  //new element connect -> next element after temp
            temp.next = t;
            size++;
        }
        int getAt(int idx){
            if (idx < 0 || idx > size()) {
                System.out.println("Wrong Input");
                return -1;
            }
            Node temp = head;
            for(int i = 1; i <= idx; i++){
                temp = temp.next;
            }
            return temp.data;
        }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        void deleteAt(int idx){
            if(idx == 0){
                head = head.next;
                size--;
                return;
            }
            Node temp = head;
            for(int i = 1; i<= idx - 1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
            size--;
        }
        int size(){ //O(n)
            Node temp = head;
            int count= 0;
            while (temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4); // 4
        //ll.display();
        ll.insertAtEnd(5); // 4 5
        //ll.display();
        System.out.println();
        //System.out.println(ll.size());
        ll.insertAtEnd(12);  // 4-> 5 -> 12
        //ll.display();
        System.out.println();
        ll.insertAtHead(13); // 13 -> 4 -> 5 -> 12
        ll.display();
        System.out.println();
        ll.insertAt(4,10); // 13 -> 4 -> 10 -> 5 -> 12
        ll.display();
        System.out.println();
        System.out.println(ll.tail.data);
        ll.insertAt(0, 100);
        ll.display();
        System.out.println();
        //  System.out.println(ll.getAt(-9));
        //  ll.deleteAt(3);
        // ll.display();
        System.out.println(ll.tail.data);
    }
}
