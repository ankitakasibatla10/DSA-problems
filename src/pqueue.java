import java.util.*;
public class pqueue {
    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(12);
        pq.offer(2);
        pq.offer(5);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        pq.peek();
        System.out.println(pq);

        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.offer(12);
        ad.offerFirst(2);
        ad.offerLast(19);
        ad.offer(26);
        System.out.println(ad);

        System.out.println(ad.peek());//removes first
        System.out.println(ad.peekLast());

        System.out.println(ad.pollFirst());  //remove head
    }
}
