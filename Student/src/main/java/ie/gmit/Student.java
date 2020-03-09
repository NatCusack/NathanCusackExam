package ie.gmit;

public class Student {
    private String studentName;
    private String studentEmail;

    public Student( String studentName, String studentEmail)
    {
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        if( studentName == null || studentEmail == null)
        {
            throw new IllegalArgumentException("Student must have Name AND Email");
        }
    }

    public Student()
    {
        throw new IllegalArgumentException("Student must have Name AND Email");

    }

    public void setStudentName(String name)
    {
        this.studentName = name;
    }

    public void setStudentEmail(String email)
    {
        this.studentEmail =  email;
    }

    public String getStudentName()
    {
        return this.studentName;
    }

    public String getStudentEmail()
    {
        return this.studentEmail;
    }
}
