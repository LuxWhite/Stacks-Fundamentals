/*
Author : R.White
Project: Stacks using Linked List.
 */
public class Main {
    public static void main(String []args ){
        Stack mystack = new Stack();


        mystack.push(12);
        mystack.push(13);
        mystack.push(14);
        mystack.push(15);
        mystack.diaplayStack();

        System.out.println("Stack count = "+mystack.countStack());
        System.out.println("size: "+mystack.size());

       System.out.println("Popped: "+mystack.pop());
       System.out.println();

       mystack.diaplayStack();

       System.out.println("size: "+mystack.size());
       System.out.println("Stack count = "+mystack.countStack());
       System.out.println("peeking: "+mystack.peek());
    }
}
