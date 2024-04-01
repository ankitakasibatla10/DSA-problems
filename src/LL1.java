public class LL1 {

    Node1 head;
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
    public static void main(String[] args) {
        LL1 l1 = new LL1();
        l1.insert(3);
        l1.insert(4);
        l1.insert(34);

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