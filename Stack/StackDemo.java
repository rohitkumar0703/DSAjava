
import java.util.Stack;
public class StackDemo{
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    // Starting time
    System.out.println(st.isEmpty());
    System.out.println(st.size());

    //Inserting elements in Stack
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    System.out.println(st);
    System.out.println(st.size());     //Length
    System.out.println(st.isEmpty());  // True or False

  //Displaying the element 
    System.out.println(st.peek());
    // Deletion of element
    st.pop();
    System.out.println(st);
    System.out.println(st.pop());
  }
}