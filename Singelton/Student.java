import java.util.Date;

class StudentAccount
{
    private String RollNumber;
    private static int count =1;
    private String assignRoll()
    {
        Date d = new Date();
        String rno = "Univ"+"-"+d.getTime()+"-"+count;
        count++;
        return rno;
    } 
    StudentAccount()
    {
        this.RollNumber = assignRoll();
    }
    public String getRollNo()
    {
        return RollNumber;
    }
}


public class Student {

    public static void main(String[] args) {
        StudentAccount s1 = new StudentAccount();
        StudentAccount s2 = new StudentAccount();

        System.out.println("Student Roll no. is " +s1.getRollNo());

        System.out.println("Student Roll no. is " +s2.getRollNo());
    
    }
}
