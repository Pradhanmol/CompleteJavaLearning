import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

public class ReverseEcho{

    public static void main(String[] args) throws Exception {
        // creating the object of server socket on port 2000

        try {
            ServerSocket ss = new ServerSocket(2000);
            //whenc client connect the socket that should accept
            Socket stk =  ss.accept();

            // for reading the input & o/p the data we here use the input stream

            BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
            PrintStream ps = new PrintStream(stk.getOutputStream());

            String msg;
            StringBuilder sb;
            do{
                msg = br.readLine();
                //reading the message in msg
                sb = new StringBuilder(msg);
                sb.reverse();
                msg = sb.toString();
                ps.println(msg);

                System.out.println("Client is connected");
            }while(!msg.equals("dne"));

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}