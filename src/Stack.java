/*
Author : R.White
Project: Stacks using Linked List.
 */
public class Stack {
    private linkedList listObj;

    public Stack(){
        listObj = new linkedList();
    }


    public void push(int data){
        listObj.insert(data);
    }


    public int pop(){
        return listObj.remove();
    }


    public int peek(){
        return listObj.peek();
    }


    public int countStack(){
        return listObj.count();
    }


    public int size (){
        return listObj.getSize();
    }


    public void diaplayStack(){
        System.out.println("this is the Stack: ");
        listObj.display();

    }
}
