import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, m, p;
        // Input the range
        System.out.println("Enter the range: ");
        n = scanner.nextInt();
        int[] arr = new int[n];
        int[] b = new int[n + 1];

        System.out.println("Enter " + n + " element: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("enter index of new value to be inserted: ");
        m = scanner.nextInt();
        System.out.println("Enter value: ");
        p = scanner.nextInt();
        for (int i = 0; i < n + 1; i++) {

            if (i < m) { 
                b[i] = arr[i];
            } else if (i == m) {
                b[i] = p;
            } else {
                b[i] = arr[i-1];
            }
        }
        System.out.print("elements are: ");
        for (int i = 0; i < n + 1; i++) {
            System.out.println(b[i]);
        }
        scanner.close();
    }
}