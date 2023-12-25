import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
        //Adding an element 
        al1.add("Anmol");
        al1.add("Pradhan");
        al1.add("Anamika");
        al1.add("Ankita");
        al1.add("Anshika");
        //removing an element 
        al1.remove(1);
        //check the remove element
        Boolean isPresent =  al1.contains("Pradhan");

        System.out.println("Array List : "+al1);

        System.out.println("Is pradhan present in list : "+isPresent);

    }
}
