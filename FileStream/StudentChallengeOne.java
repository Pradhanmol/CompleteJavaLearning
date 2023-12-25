import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**@author Anmol Pradhan
 * StudentChallengeOne
 */
public class StudentChallengeOne {
    public static void main(String[] args){
        try (FileOutputStream fos = new FileOutputStream("/home/rivigo/Java/FileStream/Test.txt")) {
            String str = "Java test file";
            fos.write(str.toUpperCase().getBytes());
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        try (FileInputStream fis = new FileInputStream("/home/rivigo/Java/FileStream/Test.txt")) {
            byte b[] = new byte[fis.available()];
            fis.read(b);
            String readStr = new String(b);
            System.out.println(readStr.toLowerCase());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}