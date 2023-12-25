import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // taking the input 
        String str = in.nextLine();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // checking the braces
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }else if(ch==')'){
                Boolean val = BalancedBrackets.handlingBraces(st, '(');
                if(val= false){
                System.out.println(val);
                return;
                }

            }else if(ch=='}'){
                Boolean val = BalancedBrackets.handlingBraces(st, '{');
                if(val= false){
                System.out.println(val);
                return;
                }
            }else if(ch==']'){
                Boolean val = BalancedBrackets.handlingBraces(st, '[');
                if(val= false){
                System.out.println(val);
                return;
                }
            }else{
                
            }
        }
        if(st.size()==0){
            System.out.println(true);
        }else{
            System.out.println(false); // extra open braces --> handle by after completion if stack is not empty then it return false
        }
    }
    public static boolean handlingBraces(Stack<Character> st, char relativeChar){
        // extra closing braces --> handle by checking is stack empty then false
        if(st.size()==0){
            return false;
        }else if(st.peek()!=relativeChar){ // Bracket mismatch--> handle then false
            return false;
        } else {
            st.pop(); // if any thing is coming except relativeChar pop from stack
            return true;
        }

    }
}
