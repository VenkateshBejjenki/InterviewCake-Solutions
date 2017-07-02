/*-----------------------------------------------------------------------------------
 * <p> Title: Superbalanced Tree. </p>
 *
 * <p> Description: A program to check whether a tree Superbalanced Tree or not </p>
 *
 * <p>  A tree is "superbalanced" if the difference between the depths
        of any two leaf nodes ↴ is no greater than one. </p>
 * <p> Copyright: Venkatesh Bejjenki © 2017 </p>
 *
 * @author Venkatesh Bejjenki
 *------------------------------------------------------------------------------------
*/



import java.util.*;
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

public class SuperBalancedBT {
    String str="";
    boolean isSuper=true;
    ArrayList<Integer> al = new ArrayList<Integer>();

    public String inorder(BinaryTreeNode x){
        if(x!=null){
            inorder(x.left);
            str+=x.value+"->";
            inorder(x.right);

        }
        return str;

    }

    public boolean checkSuper(BinaryTreeNode root){

        int count = 1;
        check(root,count);
        return isSuper;

    }

    public void check(BinaryTreeNode x, int count){

        boolean flag =false;

        if (x==null) {
            return ;
        }
        if (x.left!=null) {
            check(x.left,count+1);
        }
        if (x.right!=null) {
            check(x.right,count+1);

        }

        if(x.left==null && x.right==null){
            // System.out.println("count"+ count);

            for (int i=0; i<al.size(); i++) {
                if (count-al.get(i)==0) {
                    flag=true;
                    continue;
                }
                if (count-al.get(i)>1 || al.get(i)-count>1) {
                    flag=true;
                    isSuper= false;
                    return;

                }
            }
            if (al.size()==0 || flag==false) {
                al.add(count);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTreeNode bt = new BinaryTreeNode(50);
        BinaryTreeNode a30 =bt.insertLeft(30);
        BinaryTreeNode a60 = a30.insertRight(40);
        BinaryTreeNode a20 = a30.insertLeft(20);
        BinaryTreeNode a80 = bt.insertRight(80);
        BinaryTreeNode a70 = a80.insertLeft(70);
        BinaryTreeNode a90 = a80.insertRight(90);

        // BinaryTreeNode a10 = a20.insertLeft(10);
        // BinaryTreeNode a25 = a20.insertRight(25);
        // System.out.println(inorder(bt));

        SuperBalancedBT obj = new SuperBalancedBT();
        System.out.println(obj.checkSuper(bt));
        System.out.println(obj.al);




    }
}