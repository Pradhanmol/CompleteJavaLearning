import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;
public class Client {
    public static void main(String[] args) {
        try {
            //on client we don't have create serversocket, only we need to create socket 
            Socket stk = new Socket("localhost",9999);

            // for reading the input & o/p the data we here use the input stream
            BufferedReader keyBoard = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
            PrintStream ps = new PrintStream(stk.getOutputStream());

            String msg;
            do{
                msg = keyBoard.readLine();
                //reading the message from keyboard 
                ps.println(msg);

                msg = br.readLine();
                System.out.println("From server "+ msg);
            }while(!msg.equals("dne"));

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}