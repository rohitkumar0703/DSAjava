import java.util.Scanner;

public class Reversing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("enter Size of Array: ");
        n = scanner.nextInt();
        int [] a = new int[n];
        System.out.println("enter element : ");
        for (int i = 0; i <n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Revering Array: ");
        for (int i = n-1; i >= 0; i--) {
            System.out.println(a[i]);
        }
        System.out.println(" ");
        scanner.close();
    }
}
