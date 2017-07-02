/*-----------------------------------------------------------------------------------
 * <p> Title: Second Largest In BST. </p>
 *
 * <p> Description: A program to calculate the second max element in the BST</p>
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


public class BST2ndLargest{


    public Integer secondMax(BinaryTreeNode root, Integer max,Integer max2){
        if (root == null) {
            return max2;
        }
        if (root.right!=null) {
            if (max<root.right.value) {
                max2=max;
                max=root.right.value;
            }
            else if(max2<root.right.value){
                max2 = root.right.value;
            }

            return secondMax(root.right,max,max2);
        }
        else if(root.left!=null){
            if(max2<root.left.value){
                max2=root.left.value;
            }
                return secondMax(root.left,max,max2);

        }
        else return max2;


    }

    public static void main(String[] args) {
        BinaryTreeNode bt = new BinaryTreeNode(50);
        BinaryTreeNode a30 =bt.insertLeft(30);
        BinaryTreeNode a60 = a30.insertRight(40);
        BinaryTreeNode a20 = a30.insertLeft(20);
        BinaryTreeNode a80 = bt.insertRight(80);
        BinaryTreeNode a70 = a80.insertLeft(70);
        BinaryTreeNode a90 = a80.insertRight(90);


        BST2ndLargest obj = new BST2ndLargest();
        System.out.println(obj.secondMax(bt,bt.value,Integer.MIN_VALUE));
    }




}
