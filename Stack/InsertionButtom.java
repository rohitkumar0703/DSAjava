
import java.util.Stack;
//Insertion in Buttom of Stack
public class InsertionButtom {
    public static void main(String[] args) {
        Stack<Integer> ft = new Stack<>();
        ft.push(2);
        ft.push(3);
        ft.push(4);
        ft.push(5);
        ft.push(6);
        //Display elements Stack1
        System.out.println(ft);
        //System.out.println(ft.pop()); 

        Stack<Integer> st = new Stack<>();
        while (ft.size()>0) {
            st.push(ft.pop());
        }
        st.push(1);
        System.out.println(st);
    }
}
