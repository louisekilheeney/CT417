package Assignment1SoftwareEng3.Eng3;

import java.util.ArrayList;

public final class Module {

    
    private String moduleId;
    private String moduleName;
    private ArrayList<Student> students;
    
    public Module(String moduleName, String moduleId,  ArrayList students)
	{
          this.moduleName = moduleName;
          this.moduleId = moduleId; 
          this.students = students;
          
     }
    
    public String getModuleId() {
    return moduleId;
        }

    public String getModuleName() {
    return moduleName;
     }
    
      public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
    
    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
