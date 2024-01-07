

import java.util.Stack;

public class StackCopy {
    public static void main(String[] args) {
        Stack<Integer> ft = new Stack<>();
        ft.push(2);
        ft.push(3);
        ft.push(4);
        ft.push(5);
        ft.push(6);
        //Display elements Stack1
        System.out.println(ft);

        //reverse Order Pushing elements in stack2
        Stack<Integer> st = new Stack<>();
        while (ft.size()>0) {
            st.push(ft.pop());
        }
        System.out.println(st);

        //Final Stack
        Stack<Integer> ts = new Stack<>();
        while (st.size()>0) {
            ts.push(st.pop());
        }
        System.out.println(ts);
    }
}
