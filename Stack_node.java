package Example.DataStructures.com;

/**
 * Created by DHANANJAY on 20-Dec-15.
 */
public class Stack_node {
    private int data;
    private Stack_node next;

    public Stack_node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Stack_node getNext() {
        return next;
    }

    public void setNext(Stack_node next) {
        this.next = next;
    }
}
