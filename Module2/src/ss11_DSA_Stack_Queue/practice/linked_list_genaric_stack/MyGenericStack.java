package ss11_DSA_Stack_Queue.practice.linked_list_genaric_stack;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList();
    }
    public void push(T element){
        stack.addFirst(element);
    }
    public T pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public int size(){
        return stack.size();
    }
    public boolean isEmpty(){
        if(stack.size() == 0){
            return true;
        }return false;
    }

    private static void stackOfIString(){
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("five");
        stack.push("four");
        stack.push("three");
        stack.push("Two");
        stack.push("one");
        System.out.println("1.1 Size of stack after push operation:" + stack.size());
        System.out.printf("1.2. Pop elements from stack: ");
        while (!stack.isEmpty()){
            System.out.printf("%s", stack.pop());
        }
        System.out.println(" \n1.3. Size of stack after pop operations: " + stack.size() );
    }
    private static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1.Size of stack after push operations: " + stack.size());
        System.out.println("2.2 Pop element from stack: ");
        while (!stack.isEmpty()){
            System.out.printf("%d ",stack.pop());
        }
        System.out.println("\n3.3 Size of stack pop operation: "+ stack.size());
    }

    public static void main(String[] args) {
        System.out.println("1.Stack of integers");
        stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stackOfIString();
    }
}
