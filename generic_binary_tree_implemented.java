package Example.DataStructures.com;

/**
 * Created by DHANANJAY on 22-Dec-15.
 * This is part of dhananjay's efforts to gain expertise in java
 */

public class generic_binary_tree_implemented implements BinaryTree_interface{
    BinaryTree_node root;
    @Override
    public void insert_node(int data,BinaryTree_node root) {
        BinaryTree_node node = new BinaryTree_node(data);
        BinaryTree_node temp = root;
        if(root == null){
            root = node;
        }else {
            while (temp.getLeft()!=null){
                if(temp.getLeft()==null){
                    temp.setLeft(node);
                    temp = node;
                }else if(temp.getRight()== null){
                    temp.setRight(node);
                    temp = node;
                }else if((temp.getLeft()!=null) && (temp.getRight()== null)){
                    temp = temp.getLeft();
                }
            }
        }
    }

    @Override
    public void delete_node() {
        BinaryTree_node temp = root;
        if(root == null){
            System.out.println("Tree Empty !!");
        }else {
            while ((temp.getLeft().getLeft()!=null) && (temp.getRight()!= null)){
                    temp = temp.getLeft();
            }if (temp.getRight()!=null)
                temp.setRight(null);
            else
                temp.setLeft(null);
        }
    }

    @Override
    public void search_in_tree(int data,BinaryTree_node root) {
        BinaryTree_node temp = root;
        if(root == null) {
            System.out.println("Tree Empty !!");
        }else if(temp.getData()==data){
            System.out.println(data + "found");
        }else{
            search_in_tree(data,temp.getLeft());
            search_in_tree(data,temp.getRight());
        }
    }

    @Override
    public void traverse_tree(BinaryTree_node root) {


    }

    @Override
    public void inordertraversal(BinaryTree_node root) {
        inordertraversal(root.getLeft());
        System.out.println(root.getData());
        inordertraversal(root.getRight());
    }

    @Override
    public void preordertraversal(BinaryTree_node root) {
        System.out.println(root.getData());
        preordertraversal(root.getLeft());
        preordertraversal(root.getRight());
    }

    @Override
    public void postordertraversal(BinaryTree_node root) {
        postordertraversal(root.getLeft());
        postordertraversal(root.getRight());
        System.out.println(root.getData());

    }

    public static void main(String[] args) {
        
    }
}
