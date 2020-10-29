package Assignment1SoftwareEng3.Eng3;

import java.util.ArrayList;

public final class Module {

    private String id;
    private String name;
    private ArrayList<Long> studentIds;
	private ArrayList<String> courseIds;
    
    public Module(String moduleName, String moduleId)
	{
          this.name = moduleName;
          this.id = moduleId; 
          this.studentIds = new ArrayList<Long>();
          this.courseIds = new ArrayList<String>();
     }
    
    public String getId() {
    	return id;
    }

    public String getName() {
    	return name;
    }
    
    public void setId(String moduleId) {
        this.id = moduleId;
    }

    public void setModuleName(String moduleName) {
        this.name = moduleName;
    }
    
    public ArrayList<Long> getStudents() {
        return studentIds;
    }

    public void setStudents(ArrayList<Long> studentIds) {
        this.studentIds = studentIds;
    }
    
    public void addStudent(Student student) {
        this.studentIds.add(student.getId());
    }
   
    public ArrayList<String> getCourses() {
        return this.courseIds;
    }
    
    public void setCourses(ArrayList<String> courseId) {
        this.courseIds = courseId;
    }
    
    public void addCourseID(String courseId) {
        this.courseIds.add(courseId);
    }
}
