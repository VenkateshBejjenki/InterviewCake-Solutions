 /*-----------------------------------------------------------------------------------
 * <p> Title: K th Last Node </p>
 *
 * <p> Description: A program that returns the K th node from the end(last) of the Linkedlist </p>
 *
 * <p> Copyright: Venkatesh Bejjenki © 2017 </p>
 *
 * @author Venkatesh Bejjenki
 *------------------------------------------------------------------------------------
*/

class LinkedListNode {

    public String value;
    public LinkedListNode next;

    public LinkedListNode(String value) {
        this.value = value;
    }
}

class KthLastNode {

    public LinkedListNode kthToLastNode(int k,LinkedListNode start){

        int t = k;
        LinkedListNode end = start;
        // t = t-1;

        try{


            while(t>0){
                --t;
                end = end.next;
            }
        }

        catch(NullPointerException e){
            System.out.println("The k value is greater than Linkedlist");
            return null;
        }

        while(end!=null){
            end = end.next;
            start = start.next;
        }

        return start;
     }

    public static void main(String[] args) {

        LinkedListNode a = new LinkedListNode("Angel Food");
        LinkedListNode b = new LinkedListNode("Bundt");
        LinkedListNode c = new LinkedListNode("Cheese");
        LinkedListNode d = new LinkedListNode("Devil's Food");
        LinkedListNode e = new LinkedListNode("Eccles");

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        KthLastNode obj = new KthLastNode();

        LinkedListNode result = obj.kthToLastNode(6, a);
        if (result!=null) {
                System.out.println("Kth node is :"+result.value);
        }else {
            System.out.println("None");
        }
    }
}