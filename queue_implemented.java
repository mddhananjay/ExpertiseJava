package Example.DataStructures.com;

/**
 * Created by DHANANJAY on 20-Dec-15.
 */
public class queue_implemented implements queue_interface {
    Queue_node head = null;
    @Override
    public void enqueue(int data) {
        Queue_node node = new Queue_node(data);
        node.setNext(head);
        head = node;
    }

    @Override
    public void dequeue() {
        Queue_node temp = head;
        while (temp.getNext().getNext()!=null)
            temp = temp.getNext();
        System.out.println("dequeue node has the value of "+temp.getNext().getData());
        temp.setNext(null);
    }

    @Override
    public void display_queue() {
        Queue_node temp = head;
        while (temp.getNext()!=null) {
            System.out.println("-> " + temp.getData());
            temp = temp.getNext();
        }

    }
}
