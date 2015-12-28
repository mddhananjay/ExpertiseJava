package Example.DataStructures.com;

public class Main  {
    public Stack_node head =null;

    public static void main(String[] args) {

        Stack_implemented main_1 = new Stack_implemented();
        main_1.display_stack();
        main_1.pushElement(15);
        main_1.pushElement(16);
        main_1.pushElement(17);
        main_1.pushElement(13);
        main_1.pushElement(12);
        main_1.pushElement(10);
        main_1.display_stack();
        System.out.println("popped element id "+main_1.popElement().getData());
        System.out.println("popped element id "+main_1.popElement().getData());
        main_1.display_stack();
    }
}
