
import java.util.Stack;
//Pop Buttom Element of Stack
public class Pop_Buttom_Stack {
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
        while (ft.size()>1) {
            st.push(ft.pop());
            
        }
        int temp = ft.pop();

        while (st.size()>0) {
            ft.push(st.pop());
        }
        System.out.println(ft);
        System.out.println(temp);
    }
}
