public class Linkedlst {

    private static Node convertArray(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=0; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static int lengthLL(Node head){
        int cnt = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8};
        Node y = new Node(arr[3]);
        System.out.println(y.data);
        Node head = convertArray(arr);
        System.out.println(head.data);


        Node z = head;
        while(z!=null){
            System.out.print(z.data + " ");
            z = z.next;
        }
        System.out.println();

        System.out.println(lengthLL(head));

    }
}

class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }
    Node(int data2){
        this.data = data2;
        this.next = null;

    }
}