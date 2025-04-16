import java.util.*;
import java.io.*;
public class StackDemo{
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<Integer>();
        stk.push(10);
        stk.push(15);
        stk.push(30);
        stk.push(20);
        stk.push(5);
        System.out.println("Initial Stack: "+stk);
        System.out.println("The top element at the top of the stack is: "+stk.peek());
        System.out.println("Popped element: "+stk.pop());
        System.out.println("Popped element: "+stk.pop());
        System.out.println("Stack after popping: "+stk);
        System.out.println("The top element at the top of the stack is: "+stk.peek());
        }
}