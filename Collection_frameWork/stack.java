
import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        Stack<Integer> p = new Stack<>();
        Stack<Integer> f = new Stack<>();
        //Inserting the element 
        p.push(1);
        p.push(2);
        p.push(3);
        p.push(4);
        p.push(5);
        int e = p.search(4);
        System.out.println(e);
        //Poping Means --> Deleting the element 
        System.out.println(p);
        p.pop();
        System.out.println(p);
        p.peek();           
        System.out.println(p);   
        while (p.size() >1) {
            f.push(f.pop());
            System.out.println(f);
        }       

    }
}
