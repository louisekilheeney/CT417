package Assignment1SoftwareEng3.Eng3;

import java.util.ArrayList;
import org.joda.time.DateTime;

public class ProgrammingClass {
    private String courseName;
    private ArrayList<Module> courseModules;
    private ArrayList<Student> studentsEnrolled;
    private DateTime startDate = new DateTime();
    private DateTime endDate = new DateTime();  
	
    public ProgrammingClass(String courseName, ArrayList modules, ArrayList students, DateTime startDate, DateTime endDate)
    {
        this.courseName = courseName;
        this.courseModules = modules;
        this.studentsEnrolled = students;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
     public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<Module> getCourseModules() {
        return courseModules;
    }

    public void setCourseModules(ArrayList<Module> courseModules) {
        this.courseModules = courseModules;
    }

    public ArrayList<Student> getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void setStudentsEnrolled(ArrayList<Student> studentsEnrolled) {
        this.studentsEnrolled = studentsEnrolled;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }
}
