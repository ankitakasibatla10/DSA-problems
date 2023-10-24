import java.util.*;
public class linkedlist {
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        q.offer(12);
        q.offer(2);
        q.offer(5);
        System.out.println(q);
        System.out.println(q.poll()); //removes head
        System.out.println(q.peek());  //returns head
        System.out.println(q);
    }
}
