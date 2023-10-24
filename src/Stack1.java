import java.util.*;
public class Stack1  {
    public static void main(String[] args){
        Stack<String> animals = new Stack<>();
        animals.push("lion");
        animals.push("tiger");
        animals.push("giraffe");
        animals.push("deer");
        System.out.println(animals);
        System.out.println(animals.peek());
        animals.pop();
        System.out.println(animals.peek());
        System.out.println(animals);
    }
}

