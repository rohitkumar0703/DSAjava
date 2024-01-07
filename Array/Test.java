
// Java program to demonstrate
// passing of array to method

public class Test {
    //Driver method
    public static void main(String[] args) {
        int arr[] = {3,1,4,5,6,2,7};
        // Passing array to method m1
        sum(arr);
    }
    public static void sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
            System.out.println("Sum of array values : " +sum);
        }
    }
}
