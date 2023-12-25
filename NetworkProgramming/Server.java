// Server Side
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            System.out.println("Server waiting for client...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");
            String message;
            do{
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            message = reader.readLine();
            System.out.println("Client: " + message);
            }while(!message.equals("dne"));
            // Respond back to the client
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            writer.println("Server: Message received.");
            

            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
