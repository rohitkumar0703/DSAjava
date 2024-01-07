import java.util.Scanner;

public class Operatipon_CircularLL { 
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
            System.out.println("Enter data: ");
            data = sc.nextInt();
            Node new_node = new Node(data);

            if (head == null) {
                head = new_node;
                tail = new_node;
            } else {
                System.out.println("1. Insert at first");
                System.out.println("2. Insert at the End");
                System.out.println("3. Insert at Specific Position");
                m = sc.nextInt();
                switch (m) {
                    case 1:
                        new_node.next = head;
                        head.prev = new_node;
                        head = new_node;
                        break;
                    case 2:
                        tail.next = new_node;
                        new_node.prev = tail ;
                        tail = new_node;
                        break;
                    case 3:
                        System.out.println("Enter Position of node to be inserted: ");
                        p = sc.nextInt();
                        Node temp1 = head;
                        Node ptr = temp1.next;
                        for (int i = 1; i < (p - 1); i++) {
                            ptr = ptr.next;
                        }
                        new_node.next = temp1.next;
                        temp1.next = new_node;
                        break;
                }
            }
            System.out.println("Do you want to add more data? If yes, Please press 1 !");
            n = sc.nextInt();
        } while (n == 1);
        sc.close();
    }

    public void deletion() {
        int n, m, p;
        Scanner sc = new Scanner(System.in);

        do {
            if (head == null) {
                System.out.println("List is empty");
            } else {
                System.out.println("1. Delete at first");
                System.out.println("2. Delete at the End");
                System.out.println("3. Delete at Specific Position");
                m = sc.nextInt();
                switch (m) {
                    case 1:
                        if (head.next == head) {
                            head = null;
                            tail = null;
                        } else {
                            head = head.next;
                            tail.next = head;
                        }
                        break;
                    case 2:
                        Node temp1 = head;
                        Node ptr = head;
                        while (ptr.next != head) {
                            temp1 = ptr;
                            ptr = ptr.next;
                        }
                        temp1.next = head;
                        tail = temp1;
                        break;
                    case 3:
                        System.out.println("Enter Position of node to be deleted: ");
                        p = sc.nextInt();
                        if (p == 1) {
                            if (head.next == head) {
                                head = null;
                                tail = null;
                            } else {
                                head = head.next;
                                tail.next = head;
                            }
                        } else {
                            Node temp2 = head;
                            Node ptr1 = temp2.next;
                            for (int i = 1; i < (p - 2); i++) {
                                temp2 = ptr1;
                                ptr1 = ptr1.next;
                            }
                            temp2.next = ptr1.next;
                            if (p == 2) {
                                head = temp2.next;
                                tail.next = head;
                            }
                        }
                        break;
                }
            }
            System.out.println("Do you want to delete more data? If yes, Please press 1 !");
            n = sc.nextInt();
        } while (n == 1);
        sc.close();
    }

    public void traverse() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
        }
    }

    public static void main(String[] args) {
        Operatipon_CircularLL linkList = new Operatipon_CircularLL(); // Fix class name
        linkList.creation();
        linkList.deletion();
        linkList.traverse();
    }
}
