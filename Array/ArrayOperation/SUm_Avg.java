import java.util.Scanner;

public class SUm_Avg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter size: ");
        n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        float sum = 0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }
        System.out.println("Total sum is : "+ sum);
        float Avg;
        Avg = sum/n;
        System.out.println("Total Average is: " + Avg);
        scanner.close();
    }
}
