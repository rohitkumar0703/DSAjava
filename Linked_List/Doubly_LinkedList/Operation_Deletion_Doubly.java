import java.util.Scanner;

public class Operation_Deletion_Doubly {
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void creation() {
        int data, n, m, p;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter data");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
                tail = new_node;
            } else {
                System.out.println(
                        "Enter 1 to insert the item at beginning,2.Delete at First, 3. Insert the item at the end, 4.Delete at the end, 5. Insert at the specific Position, 6 Delete a specific Position");
                m = sc.nextInt();
                switch (m) {
                    case 1:
                        new_node.next = head;
                        head.prev = new_node;
                        head = new_node;
                        break;
                    case 2:
                        Node temp = head;
                        temp = temp.next;
                        head = temp;
                        head.prev = null;
                        break;
                    case 3:
                        tail.next = new_node;
                        new_node.prev = tail;
                        tail = new_node;
                        break;
                    case 4:
                        Node temp1 = tail;
                        temp1 = temp1.prev;
                        temp1.next = null;
                        tail = temp1;
                        break;
                    case 5:
                        System.out.println("Enter position :");
                        p = sc.nextInt();
                        Node temp2 = head;
                        Node ptr = temp2.next;
                        for (int i = 1; i < (p - 1); i++) {
                            temp2 = ptr;
                            ptr = ptr.next;
                        }
                        new_node.next = temp2.next;
                        temp2.next = new_node;
                        break;
                    case 6:
                        System.out.println("Enter position :");
                        p = sc.nextInt();
                        Node temp3 = head;
                        Node ptr1 = temp3.next;
                        for (int i = 1; i < (p - 1); i++) {
                            temp3 = ptr1;
                            ptr = ptr1.next;
                        }
                        temp3.next = ptr1.next;
                        ptr1.next.prev = temp3;
                        break;
                    default:
                        break;
                }
            }
            System.out.println("Do you want to add more data? If Yes, Press 1.");
            n = sc.nextInt();
        } while (n == 1);
        sc.close();
    }

    public void traverse() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linked List does not exist");
        } else {
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Operation_Doubly k = new Operation_Doubly();
        k.creation();
        k.traverse();
    }
}
