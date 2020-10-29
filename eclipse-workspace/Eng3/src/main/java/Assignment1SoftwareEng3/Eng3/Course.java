package Assignment1SoftwareEng3.Eng3;

import java.util.ArrayList;
import org.joda.time.DateTime;

public class Course {
    private String name;
    private ArrayList<Module> modules;
    private ArrayList<Student> students;
    private DateTime startDate = new DateTime();
    private DateTime endDate = new DateTime();  
	
    public Course(String name, DateTime startDate, DateTime endDate)
    {
        this.name = name;
        this.modules = new ArrayList<Module>();
        this.students = new ArrayList<Student>();
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Module> getmodules() {
        return modules;
    }

    public void setmodules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public ArrayList<Student> getStudentsEnrolled() {
    	return students;
    }

    public void setStudentsEnrolled(ArrayList<Student> students) {
        this.students = students;
    }
    
    public void addStudent(Student student) {
    	student.addCourse(this.getName());
        this.students.add(student);
    }
    
    public Student getStudent(Long studentId) {
        for (Student student: students)
        {
        	if(student.getId() == studentId) return student;
        }
		return null;
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
    
    public void addModule(Module module) {
    	module.addCourseID(this.getName());
        this.modules.add(module);
    }
    
    public Module getModule(String moduleId) {
        for (Module module: modules)
        {
        	if(module.getId() == moduleId) return module;
        }
		return null;
    }
}
