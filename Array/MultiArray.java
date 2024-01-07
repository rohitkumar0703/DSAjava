


// Example of Muilti Dimensional Array
// Example 1:
// Below is the implementation of the above method:

public class MultiArray {
    public static void main(String[] args){
        //Declaring and initializing 2D array
        int arr[][] = {{2,3,4},{5,6,7},{8,9,10}};
        //Printing 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
