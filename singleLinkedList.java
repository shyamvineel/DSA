public class singleLinkedList {
    private class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }  
    }
    Node head;
    Node tail;
    int  head(){
        if(head==null){
            System.out.println("NULL");
        }
        //System.out.println(head.data);
        return head.data;
    }
    int tail(){
        if(tail==null){
            System.out.println("NULL");
        }
        //System.out.println(tail.data);
        return tail.data;
    }
    int size = 0;
    void insertFront(int data){
        Node temp = new Node(data);
        if(head!=null && head.next == null){
            tail = head;
        }
        if(head==null){
            head = temp;
        }
        else{
            temp.next = head;
            head = temp;
            
        }
    }

    void Display()
    {
        Node temp = head;
        if(temp == null)
        {
            System.out.println("List \"EMPTY\"");
        }
        else
        {
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
        System.out.println();
    }
    int len(){
        Node temp = head;
        if(temp==null){
            //System.out.println("List: \"EMPTY SIZE: 0\"");
            return 0;
        }
        else{
            while(temp!=null){
                size= size+1;
                temp = temp.next;
            }
        }
        //System.out.println(size);
        return size;
    }
    void insertEnd(int data){
        Node temp = new Node(data);
        if(head!=null){
            tail.next = temp;
            tail = temp;
        }
        else{
            head = temp;
            tail = temp;
        }
    }
    void insertInto(int data, int pos){
        Node temp = new Node(data);
        Node prev = head;
        //Node cur = head;
       if(pos<=1){
        temp.next = head;
        head = temp;
       }
        if(prev==null){
            System.out.println("INVALID");
        }
        pos--;
        while(pos-- >1){
            prev = prev.next;
        }
        temp.next = prev.next;
        prev.next = temp;

    }
    void DeleteFirst(){
        Node temp = head;
        if(head==null){
            System.out.println("LIST ALREADY EMPTY");
        }
        if(head.next==null){
            head = null;
        }
        temp = head.next;
        head = temp;
    }
    void DeleteLast(){
        Node temp = head;
        if(head==null){
            System.out.println("LIST ALREADY EMPTY");
        }
        if(tail == head){
            tail = null;
            head = null;
        }
        while(temp.next!=tail){
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
    }
    void DeleteAt(int pos){
        if(head == null){
            System.out.println("LIST ALREADY EMPTY");
        }
        
    }


}
