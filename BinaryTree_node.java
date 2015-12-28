package Example.DataStructures.com;

/**
 * Created by DHANANJAY on 20-Dec-15.
 * This is part of dhananjay's efforts to gain expertise in java
 */
public class BinaryTree_node {
    BinaryTree_node left;
    BinaryTree_node right;
    private int data;

    public BinaryTree_node(int data) {
        this.data = data;
    }

    public BinaryTree_node getLeft() {
        return left;
    }

    public void setLeft(BinaryTree_node left) {
        this.left = left;
    }

    public BinaryTree_node getRight() {
        return right;
    }

    public void setRight(BinaryTree_node right) {
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
