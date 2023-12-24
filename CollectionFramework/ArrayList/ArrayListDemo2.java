import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

class Person implements Serializable{
    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int compareTo(Person othPerson){
        return Integer.compare(this.age, othPerson.age);
    }
    Person(String name, int age){
        this.age = age;
        this.name = name;
    }
    
}

public class ArrayListDemo2 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        //Declaring the arraylist of person type 

        ArrayList<Person> listOfPerson = new ArrayList<>();

        //adding the person details
        listOfPerson.add(new Person("Anmol Pradhan", 24));
        listOfPerson.add(new Person("Anamika Pradhan", 18));
        listOfPerson.add(new Person("Anshika Gupta", 20));
        listOfPerson.add(new Person("Ankita Gupta", 22));

        //sort list by age 
       // Collections.sort();

        //removing the duplicate person 
        var set = new HashSet<Person>(listOfPerson);
        listOfPerson.clear();
        listOfPerson.addAll(set);

        //serialize & desrialize the List

        //writing using serialize implemenet interface class that is ObjectOutputStream
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("list.ser"));
        oos.writeObject(listOfPerson); // here i'm passing the object the for writing all the element in one sort that is possible ussinng object output stream
        oos.close(); // need to close 

        //reading using desrialize implement interface class i.e ObjectInputStream
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("list.ser"));
        ArrayList<Person> deserializPersons = (ArrayList<Person>) ois.readObject();
        ois.close();

        //print the sorted & dedupliacted person list 

        for (Person person : deserializPersons) {
            System.out.println(person.getName() + " " + person.getAge());
        }

    }
}
