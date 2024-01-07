import java.util.Arrays;

public class operation {
    public static void main(String[] args) {
        // Initialize an array
        int[] arr = {3, 1, 4, 5, 6, 2, 7};

        // Traversal: Print all elements of the array
        System.out.println("Array elements:");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Insertion: Insert a new element at the end of the array
        int newElement = 8;
        arr = insertElement(arr, newElement);
        System.out.println("After insertion of " + newElement + ": " + Arrays.toString(arr));

        // Deletion: Delete an element from the array
        int elementToDelete = 5;
        arr = deleteElement(arr, elementToDelete);
        System.out.println("After deletion of " + elementToDelete + ": " + Arrays.toString(arr));

        // Searching: Search for an element in the array
        int elementToSearch = 4;
        int index = searchElement(arr, elementToSearch);
        System.out.println(elementToSearch + " found at index " + index);

        // Sorting: Sort the array in ascending order
        sortArray(arr);
        System.out.println("After sorting: " + Arrays.toString(arr));
    }

    // Method to insert a new element at the end of the array
    private static int[] insertElement(int[] arr, int element) {
        int newArr[] = Arrays.copyOf(arr, arr.length + 1);
        newArr[arr.length] = element;
        return newArr;
    }

    // Method to delete an element from the array
    private static int[] deleteElement(int[] arr, int element) {
        int index = searchElement(arr, element);
        if (index != -1) {
            int newArr[] = new int[arr.length - 1];
            System.arraycopy(arr, 0, newArr, 0, index);
            System.arraycopy(arr, index + 1, newArr, index, arr.length - index - 1);
            return newArr;
        }
        return arr;
    }

    // Method to search for an element in the array
    private static int searchElement(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1; // Element not found
    }

    // Method to sort the array in ascending order
    private static void sortArray(int[] arr) {
        Arrays.sort(arr);
    }
}
