import java.util.Scanner;

public class Traversal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        //Input the range
        System.out.println("Enter the range: ");
        n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " element: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        //Traversal: Printing all the elements of the array 
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        scanner.close();
    }
}