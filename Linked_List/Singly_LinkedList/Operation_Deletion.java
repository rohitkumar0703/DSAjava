import java.util.Scanner;

public class Operation_Deletion {
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
        int data, m,n,p;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter data: ");
            data = sc.nextInt();
            Node new_node = new Node(data);

            if (head == null) {
                head = new_node;
            } else {
                System.out.println("1. Insert at begning");
                System.out.println("2. Insert at the End");
                System.out.println("3. Insert at Specifoc Position");
                m = sc.nextInt();
                switch (m) {
                    case 1://Insertion at first
                        new_node.next = head;
                        head = new_node;                  
                        break;
                    case 2: //insertion at End
                        Node temp = head;
                        while (temp.next!=null) {
                            temp = temp.next;
                        }
                        temp.next = new_node;
                        break;
                    case 3:  //Insertion at Specific Position
                        System.out.println("Enter Position: ");
                        p = sc.nextInt();
                        Node temp1 = head;
                        for (int i = 0; i < (p-1); i++) {
                            temp1 = temp1.next;
                        }
                        new_node.next = temp1.next;
                        temp1.next = new_node;

                        break;
                    default:
                        break;
                } 

            }

            System.out.println("Do you want to add more data? If Yes, Press 1");
            n = sc.nextInt();
        } while (n == 1);
        sc.close();
    }
    public void Delete(){
        int n1,m1,p1;
        Scanner sc = new Scanner(System.in);
        do {
            if (head == null) {
                System.out.println("LL is Empty");
            } else {
                System.out.println("1. Delete from begning");
                System.out.println("2. Delete from End");
                System.out.println("3. Delete any Specifoc Position");
                System.out.println("4. Exit Buttion ");
                m1 = sc.nextInt();
                switch (m1) {
                    case 1://Deletion at first
                        Node temp = head;
                        temp = temp.next;
                        head = temp;                  
                        break;
                    case 2: //Deletion at End
                        Node temp1 = head;
                        Node ptr = temp1.next;
                        while (ptr.next!=null) {
                            temp1 = ptr;
                            ptr = ptr.next;
                        }
                        temp1.next = null;
                        break;
                    case 3:  //Deletion at Specific Position
                        System.out.println("Enter Position: ");
                        p1 = sc.nextInt();
                        Node temp2 = head;
                        Node ptr1 = temp2.next;
                        for (int i = 0; i < (p1-1); i++) {
                            temp2 = ptr1;
                            ptr1 = ptr1.next;
                        }
                        temp2.next = ptr1.next;                        
                        break;
                    case 4:
                        break;
                    default:
                        break;
                } 

            }

            System.out.println("Do you want to delete more data? If Yes, Press 2");
            n1 = sc.nextInt();
        } while (n1 == 2);
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

        Operation_Deletion linkList = new Operation_Deletion();
        linkList.creation();
        linkList.Delete();
        linkList.traverse();
    }
}
