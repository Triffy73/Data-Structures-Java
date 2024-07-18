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

    public void max() {
        Node temp = head;
        int max = head.data;
        while (temp != null) {
            if (max < temp.data)
                max = temp.data;
            else
                temp = temp.next;
        }
        System.out.print(max);
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
        System.out.print("\nMax:\n");
        list.max();

    }
}
