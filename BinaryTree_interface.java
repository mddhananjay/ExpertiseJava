package Example.DataStructures.com;

/**
 * Created by DHANANJAY on 20-Dec-15.
 * This is part of dhananjay's efforts to gain expertise in java
 */
public interface BinaryTree_interface {
    public void insert_node(int data,BinaryTree_node root);
    public void delete_node();
    public void traverse_tree(BinaryTree_node root);
    public void search_in_tree(int data,BinaryTree_node root);
    public void inordertraversal(BinaryTree_node root);
    public void preordertraversal(BinaryTree_node root);
    public void postordertraversal(BinaryTree_node root);
}
