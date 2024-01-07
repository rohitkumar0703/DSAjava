
import java.util.Stack;
public class Recursively_Stack {
    public static void displayReverse_Rec(Stack<Integer> ft){
        if (ft.size()==0) return;
            System.out.println(ft);    // Direct Printing element
            int top = ft.pop();        // Poping element and move in top int Variable
            System.out.print(top+ " "); // Move after print 
            displayReverse_Rec(ft);     //calling
            ft.push(top);               // Again pushing element in ft from top variable
            System.out.println(ft+ " "); //now Printing 
    }
    public static void main(String[] args) {
        Stack<Integer> ft = new Stack<>();
        ft.push(2);
        ft.push(4);
        ft.push(3);
        ft.push(5);
        ft.push(6);
        //Display elements Stack1
        //System.out.println(ft);
        displayReverse_Rec(ft);
    }
}
