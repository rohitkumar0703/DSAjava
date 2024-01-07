import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("enter range: ");
        n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("enter element: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int Max = arr[0];
        int Min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > Max) {
                Max = arr[i];
            }
            if (arr[i] < Min) {
                Min = arr[i];
            }
        }
        System.out.println("Max Element : " + Max);
        System.out.println("Min Element : " + Min);
        scanner.close();
    }
}
