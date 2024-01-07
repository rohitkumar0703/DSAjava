

import java.util.Stack;
public class Stack_l {
    public static void main(String[] args) {
        Stack<Integer> ft = new Stack<>();
        ft.push(2);
        ft.push(3);
        ft.push(4);
        ft.push(5);
        ft.push(6);
        //Display elements Stack1
        System.out.println(ft);

        Stack<Integer> st = new Stack<>();
        while (ft.size()>0) {
            st.push(ft.pop());
        }
        while (st.size()>0) {
            int x = st.pop();
            System.out.println(x);
            ft.push(x);
        }
        System.out.println(ft);
    }
}
