/*-----------------------------------------------------------------------------------
 * <p> Title: Largest Stack | Max of Stack </p>
 *
 * <p> Description: A program that return the max element in the Stack at current instance.(Even after multiple operations of push and pop) </p>
 *
 * <p> Copyright: Venkatesh Bejjenki © 2017 </p>
 *
 * @author Venkatesh Bejjenki
 *------------------------------------------------------------------------------------
*/

import java.util.*;
public class LargestStack {

    // Complexity Time : O(1), Extra Space : no. of operations on stack.

    Stack<Integer> maxStack = new Stack<>();

    private int max = Integer.MIN_VALUE;
    private int size = 0;

    public void push(Stack s, Integer ele){
        if (maxStack.empty() || maxStack.peek()<=ele) {
            maxStack.push(ele);
        }
        else{
            maxStack.push(maxStack.peek());
        }
        // ++size;
        s.push(ele);
    }


    public Integer pop(Stack s){
        Integer temp = null;
        if (!s.empty()) {
            temp = (int)s.pop();
            maxStack.pop();
        }
        return temp;
    }

    public Integer getMax(Stack s){
        if (!s.empty()) {
            return maxStack.peek();
        }
        else {
            return null;
        }
    }

  // Using single stack

    // public Integer pop(Stack s){
    //     Integer temp = Integer.MIN_VALUE;
    //     if (!s.empty()) {
    //         temp = (int)s.pop();
    //         --size;
    //         if (temp==max) {
    //             max = Integer.MIN_VALUE;
    //             for(Object i : s) {
    //                 if (max<(int)i) {
    //                    max = (int)i;
    //                 }
    //             }
    //         }
    //         return temp;

    //     }
    //     return null;
    // }



    public static void main(String[] args) {
        LargestStack ls = new LargestStack();
        Stack<Integer> st = new Stack();

        ls.push(st,5);
        ls.push(st,4);
        ls.push(st,2);
        ls.push(st,9);
        ls.pop(st);
        ls.pop(st);
        // ls.pop(st);
        // ls.pop(st);

        System.out.println("Max element is : "+ls.getMax(st));

    }
}