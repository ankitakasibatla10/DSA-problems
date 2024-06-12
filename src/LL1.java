public class LL1 {

    static Node1 head;
    LL1(){
        head = null;
    }
    public void insert(int data){
        Node1 newNode = new Node1(data);
        if(head==null){
            head = newNode;
            return;
        }

        Node1 temp = head;
        while(temp.next!= null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public static void insertAtPos(int data, int pos){
        if(pos < 1 || pos > lengthLL() + 1){
            return;
        }
        Node1 newNode = new Node1(data);
        if(pos == 1){
            newNode.next = head;
            head = newNode;
            return;
        }
        int curr = 1;
        Node1 temp = head;
        while(curr < pos-1){
            curr++;
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void deleteAtPos(int pos){
        if(pos < 1 || pos > lengthLL()){
            return;
        }
        if(pos == 1){
            head = head.next;
            return;
        }
        int curr = 1;
        Node1 temp = head;
        while(curr < pos - 1){
            curr++;
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public static void deleteNodeWithoutHead(Node1 node){
        Node1 c = node.next;
        node.data = c.data;
        node.next = c.next;

    }

    public static Node1 removeDuplicates(Node1 head){
        Node1 tp1, tp2, dup;
        tp1 = head;
        while(tp1 != null){
            tp2 = tp1;
            while(tp2.next != null){
                if(tp1.data == tp2.next.data){
                    dup = tp2.next;
                    tp2.next = tp2.next.next;
                }else{
                    tp2 = tp2.next;
                }
            }
            tp1 = tp1.next;
        }
        return head;
    }

    public void display(){
        Node1 temp = head;
        if(temp == null){
           System.out.println("List is empty");
           return;
        } else{
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static int lengthLL(){
        int count = 0;
        Node1 temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static Node1 swapKfromBorEnds(Node1 head, int k){
        Node1 temp = head;
        if(temp.next == null){
            return head;
        }
        int c = 0;
        while(temp != null){
            c++;
            temp = temp.next;
        }
        Node1 temp1 = head, temp2 = head;
        int d = c - k + 1;
        for(int i=1; i<k; i++){
            temp1 = temp1.next;

        }
        for(int i=1; i<d; i++){
            temp2 = temp2.next;

        }
        int swap = temp1.data;
        temp1.data = temp2.data;
        temp2.data = swap;
        return head;
    }

    public static Node1 swapKfromBorEnds2(Node1 head, int k){
        Node1 fast = head, slow = head;
        for(int i=1; i<k; i++){
            fast = fast.next;
        }
        Node1 temp2 = fast;
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        int swap = temp2.data;
        temp2.data = slow.data;
        slow.data = swap;
        return head;

    }


    public static void main(String[] args) {
        LL1 l1 = new LL1();
        l1.insert(3);
        l1.insert(4);
        l1.insert(34);
        l1.insert(123);
        l1.insert(3);
        l1.insert(8);
        l1.insert(16);
        l1.display();
        System.out.println("Length of ll : " + lengthLL());
//        insertAtPos(19, 3);
//        l1.display();
//        deleteAtPos(4);
   //     l1.display();
//        deleteNodeWithoutHead(34);
     //   l1.display();
 //       removeDuplicates(l1.head);
 //       l1.display();
//        int k = 2;
//        swapKfromBorEnds(l1.head,2);
//        l1.display();
        int k = 2;
        swapKfromBorEnds2(l1.head,2);
        l1.display();

    }
}

class Node1{
    int data;
    Node1 next;
    //default constructor
    Node1(){
        data = 0;
        next = null;
    }
    //parameterized constructor
    Node1(int n){
        data = n;
        next = null;
    }
}