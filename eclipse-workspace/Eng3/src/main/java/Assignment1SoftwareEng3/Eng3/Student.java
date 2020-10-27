package Assignment1SoftwareEng3.Eng3;

import org.joda.time.DateTime;

public final class Student {

    private String name;
    private int age;
    private String dob;
    private long id;
    private String username;
    private String course;
    private Module[] modules;

    public Student(String name,int age, String dob, long id, String username, String course)
    {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.username = name + age;
        this.course = course;
        
    }
 
    public int getAge() {
            return age;
        }

    public String getUsername() {
            return getName() + getAge();
        }

    public String getCourse() {
            return course;
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

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    
    public String toString()
	{
		return getName() + ", " + getAge() + ", " + getDob() + ", " +  getId() + ", " + getUsername();
	}
    
}
