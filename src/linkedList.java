/*
Author : R.White
Project: Stacks using Linked List.
 */
public class linkedList {
    Node Top; // top of the stack.
    int size;

    public linkedList(){

        Top = null;
        size = 0;
    }


    public int getSize() {
        return size;
    }


    //insert at Top : PUSH
    public void insert(int data){
        Node newNode = new Node(data);
        newNode.next = Top;
        Top = newNode;
        size++;
    }


    //removes from Top: POP
    public int remove() {
        Node temp = Top;
       if (Top != null){
           Top = Top.next;
       }
       size --;
        return temp.data;
    }



    // returns whats at the end of the Stack : PEEK
    public int peek(){
     return Top.data;
    }

    public boolean isEmpty() { return (Top == null); }

    public void clear() { Top = null; }



    public void display(){
        Node current = Top;
        while (current != null){
            current.displayNode();
            current=current.next;
        }
        System.out.println(" ");
    }



    public int count(){
        int count = 1;
        Node n = Top;
        while (n.next != null){
            count ++;
            n = n.next;
        }
        return count;
    }

}
