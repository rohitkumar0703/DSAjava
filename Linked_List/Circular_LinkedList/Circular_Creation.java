import java.util.Scanner;

public class Circular_Creation {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;
    public void creation() {
        int data, n;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter data: ");
            data = sc.nextInt();
            Node new_node = new Node(data);

            if (head == null) {
                head = new_node;
                tail = new_node;
                new_node.next = head;  //Circular Making process
            } else {
                new_node.next = head;
                head = new_node;
                tail.next = head;
            }

            System.out.println("Do you want to add more data? If Yes, Press 1");
            n = sc.nextInt();
        } while (n == 1);
        sc.close();
    }

    public void traverse() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            do{
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            while(temp!=head);
        }
    }

    public static void main(String[] args) {
        Circular_Creation linkList = new Circular_Creation();
        linkList.creation();
        linkList.traverse();
    }
}
