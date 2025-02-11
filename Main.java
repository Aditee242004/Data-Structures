import java.util.Stack;
public class Main{
    public static void main(String args[]){
        Stack<Integer>stack=new Stack<>();
        //push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Popped:"+stack.pop());
        stack.isEmpty();
        System.out.println("Empty:"+stack.isEmpty());

        stack.getLast();
        System.out.println("Last Element"+stack.getLast());

        stack.peek();
        System.out.println("Top Element"+stack.peek());
    }
}