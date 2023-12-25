import java.util.Scanner;
import java.util.Stack;

/**
 * DuplicateBrackets
 */
public class DuplicateBrackets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //taking input from user as string 
        String str = in.nextLine();
        //Creating stack of character
        Stack<Character> st = new Stack<>();
        //iterating on each character of string & according to usage doing the stack activity
        for (int i = 0; i < str.length(); i++) {
            // iterating on each character of string using char variable
            char ch = str.charAt(i);
            // first check the char is closing braces then do the below activity other push the char in stack
            if(ch == ')'){
                // if stack is have close braces then check the top of braces is opening braces if it is then return false 
                // else pop till the open braces is not get & lastly pop the pop open braces too
                if(st.peek()=='('){
                    System.out.println(false);
                    return;
                }else{
                    while(st.peek()!='('){
                        st.pop();
                    }
                    st.pop();
                }
            } else {
                st.push(ch);
            }
        }
        System.out.println(true);
    }
}