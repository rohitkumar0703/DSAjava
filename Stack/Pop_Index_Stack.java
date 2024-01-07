import java.util.Scanner;
import java.util.Stack;
//Pop element from random Index
public class Pop_Index_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Index;
        Stack<Integer> ft = new Stack<>();
        ft.push(2);
        ft.push(3);
        ft.push(4);
        ft.push(5);
        ft.push(6);
        //Display elements Stack1
        System.out.println(ft);

        Stack<Integer> st = new Stack<>();
        System.out.println("Enter Index: ");  //Index From User
        Index = sc.nextInt();                   //Read Input 
        while (ft.size()>Index) {  
            st.push(ft.pop());
        }
        int temp = ft.pop();
        while (st.size()>0) {
            ft.push(st.pop());
        }
        System.out.println(ft);
        System.out.println(temp);

        sc.close();
    }
}
