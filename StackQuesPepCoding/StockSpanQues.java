import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Stack;

public class StockSpanQues {
    public static void main(String[] args) {
        InputStreamReader in = new InputStreamReader(System.in);
        try (BufferedInputStream br = new BufferedInputStream(in)) {
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

    public static int[] solve(int[] arr){
        // solve
        int span[] = new int[arr.length];
        // create stack
        Stack<Integer> st = new Stack<>();
        st.push(0);
        span[0] = 1;
        for (int i = 0; i < arr.length; i++) {
            while (st.size()>0 && arr[i]>arr[st.peek()]) {
                st.pop();
            }
            if (st.size()==0) {
                span[i] = i+1;
            } else {
                span[i] = i-st.peek();
;            }
        }
        st.push(i);
        return span;
      }
}
