/*-----------------------------------------------------------------------------------
 * <p> Title: Queue using two Stacks  </p>
 *
 * <p> Description: A program to implement Queue using two Stacks </p>
 *
 * <p> Copyright: Venkatesh Bejjenki © 2017 </p>
 *
 * @author Venkatesh Bejjenki
 *------------------------------------------------------------------------------------
*/

import java.util.*;

class QueueTwoStacks<T> {

    Stack<T> s1 = new Stack();
    Stack<T> s2 = new Stack();

    public T deQueue(){
        T temp = null;
        while (!s1.empty()) {
            s2.push(s1.pop());
        }
           if(!s2.empty())
            temp = s2.pop();
        while(!s2.empty()){
            s1.push(s2.pop());
        }

        return temp;
    }

    public void enQueue(T x){
        s1.push(x);
    }


    public static void main(String[] args) {

        QueueTwoStacks<Integer> q = new QueueTwoStacks();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.deQueue();
        System.out.println(q.s1);
        q.enQueue(4);
        q.enQueue(8);
        q.deQueue();
        q.deQueue();
        // q.deQueue();
        // q.deQueue();
        // q.deQueue();

        System.out.println(q.s1);
        // System.out.println(q.s2);

    }
}