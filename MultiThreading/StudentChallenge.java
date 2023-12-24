class WhiteBoard{
    String text;
    int noOfStudent = 0; //track of student
    int count = 0; //track of how many no. of students read 

    public int attendent() {
        return noOfStudent++; //attendance mark
    }

   synchronized public void writeTeacher(String messageByteacher){
        System.out.println("Teacher is writing : "+text);
        while(count!=0){
            try {
                wait();
            } catch (Exception e) {
                // TODO: handle exception
            }
            text = messageByteacher;
            notifyAll();
        }
    }
    synchronized public String readByStudents() {
        System.out.println("Reading by student :");
        while (count==0) {
            try {
                wait();
            } catch (Exception e) {
                // TODO: handle exception
            }
            if (count==0) {
                notify();
            }
        }
        count --;
        return text;
    }

}

class Student extends Thread{
    String name;
    WhiteBoard wt;
    
    Student(String name, WhiteBoard wb){
        this.name = name;
        this.wt = wb;
    }
    //student need to read text from whiteboard

    @Override
    public void run() {
        // here in thread user string get read from here 
        String text;
        wt.attendent();// get the attendace of students
        do{
            text = wt.readByStudents();
            System.out.println(name+ "Reading : "+text);
            System.out.flush();
        }while(!text.equals("end"));
    }
}

class Teacher extends Thread{
    WhiteBoard wb;
    String notes[] = { "Java is language", "It is OOPs", "It is Platform Independent", "It supports Thread", "end" }; // the notes to write to the whiteboard
    public Teacher(WhiteBoard wb){
        this.wb = wb;
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (String string : notes) {
            wb.writeTeacher(string); // writing note to the whiteboard
        
    }
}
}

public class StudentChallenge {
    public static void main(String[] args) {
        WhiteBoard wb = new WhiteBoard();
        Teacher t = new Teacher(wb);
        Student s1=new Student("1. John",wb);
        Student s2=new Student("2. Ajay",wb);
        Student s3=new Student("3. Kloob",wb);
        Student s4=new Student("4. Smith",wb);
        t.start();
        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
}
