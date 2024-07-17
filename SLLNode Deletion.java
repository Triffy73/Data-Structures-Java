import java.util.*;
class Main{
    Node head;

    class Node{
        int data;
        Node next;
        //Node head;

        Node(int val){
            data = val;
            next = null;
            //head = null;
        }
    }
    Main(){
        head = null;
    }
    public void insertend(int val){
        Node newnode = new Node(val);

        if (head==null){
            head = newnode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp =  temp.next;
            }
            temp.next = newnode;
        }
    }
    public void deletebegin()
    {
        head=head.next;
    }
    public void deleteposition(int d)
    {
        Node temp=head;
        Node prev=null;
        for(int i=1;i<d;i++)
        {
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
    }
    public void deleteend()
    {
        /*if(head.next==null)
        {
            head=null;
        }*/
        Node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.print("Null\n");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        Main list = new Main();

        int m = sc.nextInt();
        for (int i =0 ;i<m;i++){
            int val = sc.nextInt();
            list.insertend(val);
        }
        //list.display();
        //System.out.print("\nEnter the value to insert at the beginning: ");
        System.out.print("\n");
        System.out.println("Deletion at the beginning:");
        list.deletebegin();
        list.display();
        System.out.print("\n");
        System.out.println("Deletion at the position:");
        list.deleteposition(3);
        list.display();
        System.out.print("\n");
        System.out.println("Deletion at the end:");
        list.deleteend();
        list.display();
    }
}
