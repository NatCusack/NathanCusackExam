package ie.gmit;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    private List<Student> listOfStudents = new ArrayList<Student>();

    public StudentList()
    {
    }
    public void addStudent(Student st1)
    {
        this.listOfStudents.add(st1);
    }

    public Student searchStudent(String name){
        for (Student s : this.listOfStudents)
        {
            if (s.getStudentName() == name) {
                return s;
            }
            else{
                return null;
            }
        }
    }
}
