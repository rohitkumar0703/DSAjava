import java.util.Scanner;

public class deletion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, m;
        // Input the range
        System.out.println("Enter the range: ");
        n = scanner.nextInt();
        int[] arr = new int[n];
        int[] b = new int[n + 1];

        System.out.println("Enter " + n + " element: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("enter index of value to be deleted: ");
        m = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {

            if (i < m) { 
                b[i] = arr[i];
            }
            else if(i == m)
                continue;
            else{
                b[i-1] = arr[i];
            }
        }
        System.out.print("elements are: ");
        for (int i = 0; i <n-1; i++) {
            System.out.print(b[i]);
        }
        scanner.close();
    }
}
