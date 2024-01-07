import java.util.List;
import java.util.ArrayList;
public class array_List{
    public static void main(String[] args){
        List<Integer> c = new ArrayList<>();
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        c.add(50);
        c.add(60);
        int d = c.get(2);        //by this You will check easily Index 2 Element
        //c.remove(1);                   by this You can Remove chosen Idex Element 
        //c.clear();                     By this all array elements will be deleted 
        c.set(0, 90);    //By this You can change the element of Choosen Index
        boolean v = c.contains(30);  //By this You can check element is Exist or not 
        boolean f= c.contains(99);   //same
        System.out.println(v);
        System.out.println(f);
        System.out.println(c);
        System.out.println(d);

        for (int i = 0; i < c.size(); i++) {
            System.out.print(c.get(i)+ " ");
        }

    }
}