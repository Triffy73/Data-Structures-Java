import java.util.*;
public class Main {
    Node head;

    class Node {
        int data;
        Node next;
        //Node head;

        Node(int val) {
            data = val;
            next = null;
            //head = null;
        }
    }

    Main() {
        head = null;
    }

    public void insertend(int val) {
        Node newnode = new Node(val);

        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    public void min() 
  {
        Node temp = head;
        int min = head.data;
        while (temp != null) {
            if (min > temp.data)
                min = temp.data;
            else
                temp = temp.next;
        }
        System.out.print(min);
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("Null");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Main list = new Main();
        System.out.println("Enter the size of node:");
        int m = sc.nextInt();
        System.out.println("Enter the values:");
        for (int i = 0; i < m; i++) {
            int val = sc.nextInt();
            list.insertend(val);
        }
        System.out.println("\nMin:");
        list.min();
    }
}
