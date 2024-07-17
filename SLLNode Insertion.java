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
    public void position(int pos , int k){
        Node newnode = new Node(k);

        Node temp = head;

        for (int i =1;i<pos;i++){
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }
    public void insertbegin(int s){
        Node newnode = new Node(s);

        if (head == null){
            head = newnode;
        }
        else{
            newnode.next = head;
            head = newnode;
        }

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
        System.out.println("Inserting at the end:");
        list.display();
        //System.out.print("\nEnter the value to insert at the beginning: ");
        System.out.print("\n");
        System.out.println("Insert at the middle:");
        int pos = 3;
        int k = 125;
        list.position(3,125);
        list.display();
        System.out.print("\n");
        int s =sc.nextInt();
        System.out.println("Inserting at the beginning:");
        list.insertbegin(s);
        list.display();
    }
}
