/*-----------------------------------------------------------------------------------
 * <p> Title: Check Binary Search Tree. </p>
 *
 * <p> Description: A program to check whether a tree Binary Search Tree or not </p>
 *
 * <p> Copyright: Venkatesh Bejjenki © 2017 </p>
 *
 * @author Venkatesh Bejjenki
 *------------------------------------------------------------------------------------
*/




class BinaryTreeNode {

    public int value;
    public BinaryTreeNode left;
    public BinaryTreeNode right;

    public BinaryTreeNode(int value) {
        this.value = value;
    }

    public BinaryTreeNode insertLeft(int leftValue) {
        this.left = new BinaryTreeNode(leftValue);
        return this.left;
    }

    public BinaryTreeNode insertRight(int rightValue) {
        this.right = new BinaryTreeNode(rightValue);
        return this.right;
    }

}

public class CheckBinaryTree{

    public boolean checkBST(BinaryTreeNode root,int min,int max){
        if(root!=null){
            if(root.value>min && root.value<max){
                if(checkBST(root.left,min,root.value) && checkBST(root.right,root.value,max)){
                    return true;
                }
                else return false;
            }
            else{
                return false;
            }
        }
        else return true;

    }

    public static void main(String[] args) {
        BinaryTreeNode bt = new BinaryTreeNode(50);
        BinaryTreeNode a30 =bt.insertLeft(30);
        BinaryTreeNode a60 = a30.insertRight(40);
        BinaryTreeNode a20 = a30.insertLeft(20);
        BinaryTreeNode a80 = bt.insertRight(80);
        BinaryTreeNode a70 = a80.insertLeft(70);
        BinaryTreeNode a90 = a80.insertRight(90);

        CheckBinaryTree obj = new CheckBinaryTree();
        System.out.println(obj.checkBST(bt,Integer.MIN_VALUE,Integer.MAX_VALUE));
    }

}