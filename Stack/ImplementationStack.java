import java.util.Scanner;

class Stack {
    int top = -1;
    int n = 10;
    int a[] = new int[n];
    Scanner scanner = new Scanner(System.in);

    void push() {
        if (top == n - 1) {
            System.out.println("Overflow");
        } else {
            System.out.println("Enter data:");
            int j = scanner.nextInt();
            top = top + 1;
            a[top] = j;
            System.out.println("Item inserted");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Underflow");
        } else {
            top = top - 1;
            System.out.println("Item deleted");
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Items are: ");
            for (int i = top; i >= 0; i--) {
                System.out.println(a[i]);
            }
        }
    }
}

public class ImplementationStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack s = new Stack();
        int choice;

        do {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");

            System.out.print("Enter your Choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    s.push();
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                    System.out.println("Exit Successfully");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

            System.out.print("Enter 0 to go back to the main menu, or any other key to exit: ");
            int l = scanner.nextInt();
            if (l != 0) {
                break;
            }

        } while (choice != 4);

        scanner.close();
    }
}
