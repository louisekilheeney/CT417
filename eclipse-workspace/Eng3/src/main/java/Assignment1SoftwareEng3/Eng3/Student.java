package Assignment1SoftwareEng3.Eng3;

import java.util.ArrayList;

public final class Student {

    private String name;
    private int age;
    private String dob;
    private long id;
    private String username;
	private ArrayList<String> moduleIds;
	private ArrayList<String> courses;

 

	public Student(String name,int age, String dob, long id)
    {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.username = name + age;
        this.moduleIds = new ArrayList<String>();
    	this.courses = new ArrayList<String>();
        
    }
 
    public int getAge() {
            return age;
        }

    public String getUsername() {
            return getName() + getAge();
        }


    public String getName() {
            return name;
        }

    public long getId() {
            return id;
        }
    public String getDob() {
        return dob;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCourses(ArrayList<String> courses) {
  		this.courses = courses;
  	}
    
   	public ArrayList<String> getCourses() {
   		return courses;
   	}
   	
   	public void addCourse(String courseId) {
   		this.courses.add(courseId);
   	}
   	
   	public void addModule(String moduleId) {
   		this.moduleIds.add(moduleId);
   	}

    public ArrayList<String> getModules() {
		return moduleIds;
	}

	public void setModules(ArrayList<String> moduleIds) {
		this.moduleIds = moduleIds;
	}
  
    public String toString()
	{
		return getName() + ", " + getAge() + ", " + getDob() + ", " +  getId() + ", " + getUsername();
	}
    
}
