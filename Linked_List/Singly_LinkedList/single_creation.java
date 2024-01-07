import java.util.Scanner;

public class single_creation {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void creation() {
        int data, n;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter data: ");
            data = sc.nextInt();
            Node new_node = new Node(data);

            if (head == null) {
                head = new_node;
            } else {
                new_node.next = head;
                head = new_node;
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
            System.out.println("Linked List elements:");
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        single_creation linkList = new single_creation();
        linkList.creation();
        linkList.traverse();
    }
}
