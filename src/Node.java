/*
Author : R.White
Project: Stacks using Linked List.
 */
public class Node {
     int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next = null;
    }

    public int getData() {
        return data;
    }


    public void setData(int data) {
        this.data = data;
    }


    public Node getNext() {
        return next;
    }


    public void setNext(Node next) {
        this.next = next;
    }


    //display data in Node.
    public void displayNode(){
        System.out.println("Node data: "+data);
    }
}
