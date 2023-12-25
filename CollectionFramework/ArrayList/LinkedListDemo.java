import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<Integer> ll1 = new LinkedList<>();
        //adding the element in linked list 
        ll1.add(10);
        ll1.add(20);
        ll1.add(30);
        ll1.add(40);
        ll1.add(50);
        //removing the element in Linked List 

        ll1.remove(2);

        //Get the length of linked list

        int length = ll1.size();

        // displaying the all object 

        System.out.println("Linked list : "+ll1);

        //displaying the length

        System.out.println("Length of linked list : "+ length);
    }
}
