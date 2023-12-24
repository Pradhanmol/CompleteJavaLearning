import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StudentChallengeTwo {
    public static void main(String[] args) throws Exception {
        // float list[] = {1.5f,2.3f,3.5f,6.5f};
        // FileOutputStream fos = new FileOutputStream("/home/rivigo/Java/FileStream/Test2.txt");
        // DataOutputStream dos = new DataOutputStream(fos);
        // for (float f : list) {
        //     dos.writeFloat(f);
        // }
        FileInputStream fis = new FileInputStream("/home/rivigo/Java/FileStream/Test2.txt");
        DataInputStream dis = new DataInputStream(fis);
        int i = 0;
        int lenght = dis.readInt();
        while(i<lenght){
            System.out.println(dis.readFloat());
        }
        i++;
    }
}
