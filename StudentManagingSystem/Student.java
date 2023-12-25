/***
 * @author Anmol Pradhan
 */
public class Student {
    Long studentId;
    String studentName;
    float gpa;
    /***
     * 
     * @return student id
     */
    public Long getStudentId() {
        return studentId;
    }
    /**
     * 
     * @param studentId
     */
    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }
    /**
     * 
     * @return
     */
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public float getGpa() {
        return gpa;
    }
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    public Student(Long studentId, String studentName, float gpa) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.gpa = gpa;
    }
    public void getEnrollInCourse(String studentId, String coure ) {
        
    }
}
