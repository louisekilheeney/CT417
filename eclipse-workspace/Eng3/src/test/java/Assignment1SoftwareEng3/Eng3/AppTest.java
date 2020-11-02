package Assignment1SoftwareEng3.Eng3;


import junit.framework.TestCase;

import java.util.ArrayList;
import org.joda.time.DateTime;
import static org.junit.Assert.*;

public class AppTest 
    extends TestCase
{
    public void testApp()
    {
    	System.out.println("testing");
        assertTrue( true );
    }
    
  
    public void testStudent()
    {
    	System.out.println("Running test on Student");
    	Student student1 = new Student("LouiseKilheeney", 28, "17/04/1992", 1234523);
    	Student student2 = new Student("JaneDoe", 18, "17/04/1992", 987654);
    	
    	DateTime start = new DateTime("2020-08-28");
        DateTime end = new DateTime("2020-12-18");
    	Course course = new Course("CS&IT", start, end);
    	Module softwareEng3 = new Module("Soft_Eng 3", "CT4117");

        assertEquals("Name is incorrect", "LouiseKilheeney", student1.getName());
        assertEquals("Age is incorrect", 28, student1.getAge());
        assertEquals("Date of Birth", "17/04/1992", student1.getDob());
        assertEquals("student Id no. is incorrect", 1234523, student1.getId());
        
        assertEquals("Name is incorrect", "JaneDoe", student2.getName());
        assertEquals("Age is incorrect", 18, student2.getAge());
        assertEquals("Date of Birth doesnt match expected", "17/04/1992", student2.getDob());
        assertEquals("student Id no. is incorrect", 987654, student2.getId());
        
        assertEquals(0, student1.getCourses().size());
        assertEquals(0, course.getStudentsEnrolled().size());
        assertFalse(course.getStudentsEnrolled().contains(student1));
        assertFalse(student1.getCourses().contains(course));

        softwareEng3.addStudent(student1);
        student1.addModule(softwareEng3.getId());
        course.addModule(softwareEng3);
        course.addStudent(student1);

        assertEquals(1, student1.getCourses().size());
        assertEquals(1, course.getStudentsEnrolled().size());
        assertTrue(course.getStudentsEnrolled().contains(student1));

    }
    
    public void testGetUserName() {
    	System.out.println("Running test on username");
    	Student student1 = new Student("LouiseKilheeney", 28, "17/04/1992", 1234523);
    	Student student2 = new Student("Jane Doe", 18, "17/04/1992", 987654);
    	
        assertEquals("LouiseKilheeney28", student1.getUsername());
        assertEquals("Jane Doe18", student2.getUsername());
    }
    
    public void testGetName() {
    	System.out.println("Running test on name");
    	Student student1 = new Student("LouiseKilheeney", 28, "17/04/1992", 1234523);
    	Student student2 = new Student("JaneDoe", 18, "17/04/1992", 987654);
    	
        assertEquals("LouiseKilheeney", student1.getName());
        assertEquals("JaneDoe", student2.getName());
    }
    

    public void testModule()
    {
    	System.out.println("Running test on Module");
    	Student student1 = new Student("LouiseKilheeney", 28, "17/04/1992", 1234523);
    	
    	Module softwareEng3 = new Module("Soft_Eng 3", "CT4117");
        Module module1 = new Module("Machine Learning", "CT4101");
        assertEquals("Module name is incorrect", "Machine Learning", module1.getName());
        assertEquals("Module Code is incorrect", "CT4101", module1.getId());
        
        DateTime start = new DateTime("2020-08-28");
        DateTime end = new DateTime("2020-12-18");
        
    	Course course = new Course("CS&IT", start, end);
        assertEquals("Course name is incorrect", "CS&IT", course.getName());
        assertNotNull("Start time is missing", course.getStartDate());
        assertNotNull("End time is missing", course.getEndDate());

        assertEquals(0, course.getmodules().size());
        assertFalse(course.getmodules().contains(softwareEng3));
        
        softwareEng3.addStudent(student1);
        student1.addModule(softwareEng3.getId());
        course.addModule(softwareEng3);
        course.addStudent(student1);
        
        assertEquals(1, course.getmodules().size());
        assertEquals(1, softwareEng3.getCourses().size());
        assertTrue(course.getmodules().contains(softwareEng3));
          
    }

}
