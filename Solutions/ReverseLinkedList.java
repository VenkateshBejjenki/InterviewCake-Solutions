/*-----------------------------------------------------------------------------------
 * <p> Title: Reverse LinkedList </p>
 *
 * <p> Description: A program to reverse a Linkedlist. Given the head node of it.</p>
 *
 * <p> Copyright: Venkatesh Bejjenki © 2017 </p>
 *
 * @author Venkatesh Bejjenki
 *------------------------------------------------------------------------------------
*/

class LinkedListNode {

    public int value;
    public LinkedListNode next;

    public LinkedListNode(int value) {
        this.value = value;
    }

    public String printList(LinkedListNode temp) {
        String result ="";

        while( temp != null ){
            result = result + " " + temp.value;
            temp = temp.next;
        }
        return result;
    }

}

class ReverseLinkedList {

    // Complexity : Time O(n).

    public LinkedListNode reverse(LinkedListNode head ){

        LinkedListNode newHead = null;

        while(head.next!=null){

            LinkedListNode temp = head.next;
            head.next = newHead;
            newHead = head;
            head = temp;

        }


        return newHead;
    }

    public static void main(String[] args) {
        ReverseLinkedList obj = new ReverseLinkedList();

        LinkedListNode a = new LinkedListNode(1);
        LinkedListNode b = new LinkedListNode(2);
        LinkedListNode c = new LinkedListNode(3);
        LinkedListNode d = new LinkedListNode(4);
        LinkedListNode e = new LinkedListNode(5);
        LinkedListNode f = new LinkedListNode(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = a;


        LinkedListNode newHead = obj.reverse(a);

        System.out.println("Reversed Linked List is : "+newHead.printList(newHead));
    }
}