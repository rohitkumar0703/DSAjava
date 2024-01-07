import java.util.Scanner;

public class sec_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m,n;
        System.out.println("Enter ROWS: ");
        m = scanner.nextInt();
        System.out.println("Enter COLUMNS: ");
        n = scanner.nextInt();
        int a[][] = new int[n][m];
        System.out.println("Enter Value: ");
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println(" ");
        }
        scanner.close();
        

    }
}
