 /*-----------------------------------------------------------------------------------
 * <p> Title: Bracket Validator </p>
 *
 * <p> Description: A program that checks whether the given string has proper nested the opening and closing braces/paranthesis/brackets </p>
 *
 * <p> Copyright: Venkatesh Bejjenki © 2017 </p>
 *
 * @author Venkatesh Bejjenki
 *------------------------------------------------------------------------------------
*/
import java.util.*;
public class BracketValidator {

    public boolean validate(String input){
        Stack<Character> st = new Stack<>();
        for (int i =0; i<input.length(); i++) {
            if (input.charAt(i) =='('|| input.charAt(i) =='[' || input.charAt(i) =='{') {
                st.push((Character)input.charAt(i));
            }

            if (input.charAt(i)==')') {
                if (st.pop()=='(') {
                    continue;
                }
                else {
                    return false;
                }
            }
            if (input.charAt(i)==']') {
                if (st.pop()=='[') {
                    continue;
                }
                else {
                    return false;
                }
            }
            if (input.charAt(i)=='}') {
                if (st.pop()=='{') {
                    continue;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String input = sc.nextLine();

        BracketValidator obj = new BracketValidator();

        System.out.println("Bracket validation result : "+obj.validate(input));
    }
}