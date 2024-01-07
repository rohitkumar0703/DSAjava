

// Java program to demonstrate
// return of array from method

public class Testm1 {
    //driver method
    public static void main(String[] args) {
        int arr[] = m1();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
    public static int[] m1(){
        //returning array
        return new int[] {1,2,3};
    }
}

// Complexity of the above method:
// Time Complexity: O(n) 
// Auxiliary Space : O(1)
