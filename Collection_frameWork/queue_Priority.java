import java.util.*;
public class queue_Priority {
    public static void main(String[] args) {
        Queue<Integer> c = new PriorityQueue<>(Comparator.reverseOrder());
        c.offer(10);
        c.offer(3);
        c.offer(4);
        c.offer(5);
        c.offer(6);
        c.offer(7);
        System.out.println(c);
        c.poll();
        System.out.println(c);
    }
}
