import java.util.Scanner;

class queue {
    int f = -1, r = -1;
    int n = 10;
    int q[] = new int[n];
    Scanner s = new Scanner(System.in);

    void enqueue(){
        if (r == (n-1)) {
            System.out.println("OverFlow");
        }
        else{
            System.out.println("Enter Data: ");
            int i = s.nextInt();
            if (f==-1 && r==-1) {
                f = 0;
                r = 0;
                q[r]=i;
            }
            else{
                r = r+1;
                q[r] = i;
            }
        }
    }
    void dequeue(){
        if (f==-1&&r==-1) {
            System.out.println("underFlow");
        }
        else{
            f=f+1;
        }
    }
    void display(){
        System.out.println("Items are: ");
        for (int i = f; i<=r; i++) {
            System.out.println(q[i]);
        }
    }
}

   

public class Queue_Array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        queue sh = new queue();
        int choice;

        do {
            System.out.println("1. Enqueue");
            System.out.println("2. dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");

            System.out.print("Enter your Choice: ");
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    sh.enqueue();
                    break;
                case 2:
                    sh.dequeue();
                    break;
                case 3:
                    sh.display();
                    break;
                case 4:
                    System.out.println("Exit Successfully");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

            System.out.print("Enter 0 to go back to the main menu, or any other key to exit: ");
            int l = s.nextInt();
            if (l != 0) {
                break;
            }

        } while (choice != 4);

        s.close();
    }
}
