import java.util.Stack;
//Insertion at random Index of Stack
public class IndexInsertion {
    public static void main(String[] args) {
        Stack<Integer> ft = new Stack<>();
        ft.push(2);
        ft.push(3);
        ft.push(4);
        ft.push(5);
        ft.push(6);
        //Display elements Stack1
        System.out.println(ft);
        int Index = 2;  
        int x = 7;
        Stack<Integer> st = new Stack<>();
        while (ft.size()>Index) {   //At Index 2 element 7
            st.push(ft.pop());
        }
        st.push(x);
        //System.out.println(st);

         while (ft.size()>0) {
            st.push(ft.pop());
        }
        //At buttom Insertion Element 1
        st.push(1);
        System.out.println(st);
    }
}
