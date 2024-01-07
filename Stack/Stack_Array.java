
import java.util.Stack;
public class Stack_Array {
    public static void main(String[] args) {
        Stack<Integer> ft = new Stack<>();
        ft.push(2);
        ft.push(3);
        ft.push(4);
        ft.push(5);
        ft.push(6);
        //Display elements Stack1
        System.out.println(ft);
        int n = ft.size();
        int[] arr = new int[n];
        for (int i = n-1; i>=0; i--) {
            arr[i] = ft.pop();
        }
        for (int i = 0; i <n; i++) {
            System.out.println(arr[i]);
            ft.push(arr[i]);
        }
        System.out.println(ft);
    }
}
