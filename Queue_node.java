package Example.DataStructures.com;

/**
 * Created by DHANANJAY on 20-Dec-15.
 */
public class Queue_node {
    int data;
    Queue_node next;

    public Queue_node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Queue_node getNext() {
        return next;
    }

    public void setNext(Queue_node next) {
        this.next = next;
    }
}
