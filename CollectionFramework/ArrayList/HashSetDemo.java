import java.net.NetPermission;
import java.util.HashSet;

/* Questions - Write a program to create a HashSet of Integer type and add ten unique values to it. 
Then, print all the values using a for-each loop. */ 

/**
 * @author Anmol Pradhan
 */
/**
 * HashSetDemo
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(10);
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        hs.add(60);
        hs.add(70);
        hs.add(20);
        hs.add(90);
        for (var integer : hs) {
            System.out.println(integer);
        }
    }
}