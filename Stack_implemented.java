package Example.DataStructures.com;

/**
 * Created by DHANANJAY on 20-Dec-15.
 */
public class Stack_implemented implements Stack_interface {
    Stack_node head = null;
    @Override
    public void pushElement(int data) {
        Stack_node node = new Stack_node(data);
        node.setNext(head);
        head = node;
    }

    @Override
    public Stack_node popElement() {
        Stack_node temp =head;
        head = head.getNext();
        temp.setNext(null);
        return temp;
    }

    @Override
    public void display_stack() {
        Stack_node temp =head;
        while (temp != null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
        System.out.println("stack complete");

    }
}
