/*-----------------------------------------------------------------------------------
 * <p> Title: Delete Node </p>
 *
 * <p> Description: A program that deletes a given node in a Linkedlist. Note that we don't have head of the Linkedlist </p>
 *
 * <p> Copyright: Venkatesh Bejjenki © 2017 </p>
 *
 * @author Venkatesh Bejjenki
 *------------------------------------------------------------------------------------
*/


import java.util.*;
class LinkedListNode {

    public String value;
    public LinkedListNode next;

    public LinkedListNode(String value) {
        this.value = value;
    }



    @Override
    public String toString(){
        String result = value;
        LinkedListNode temp=next;
        while(temp!=null){
            result = result+" "+ temp.value;
            temp = temp.next;
        }
        return result;
    }
}

class DeleteNode {


    public void deleteNode(LinkedListNode x){
        // If X is the last element . As its not possible to free the node in Java I made it null.
        if (x.next==null) {
            x.value = null;
            x=null;

        }
        else if (x.next!=null) {
            System.out.println("hello");
            LinkedListNode t = x.next;
            x.value = t.value;
            x.next = t.next;
        }
    }


    public static void main(String[] args) {

        LinkedListNode a = new LinkedListNode("A");
        LinkedListNode b = new LinkedListNode("B");
        LinkedListNode c = new LinkedListNode("C");

        DeleteNode obj = new DeleteNode();
        a.next = b;
        b.next = c;

        System.out.println(a.toString());

        obj.deleteNode(b);
        System.out.println(a.toString());



    }
}
