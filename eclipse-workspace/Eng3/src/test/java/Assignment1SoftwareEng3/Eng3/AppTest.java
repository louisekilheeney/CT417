package Assignment1SoftwareEng3.Eng3;


import junit.framework.TestCase;

import java.util.ArrayList;
import org.joda.time.DateTime;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    public void testApp()
    {
    	System.out.println("working in here");
        assertTrue( true );
    }
    
    public void testStudent()
    {
        Student student1 = new Student("LouiseKilheeney", 28, "17/04/1992", 1234523, "Louisekilheeney28","Software Engineering 3");

        assertEquals("Name is incorrect", "LouiseKilheeney", student1.getName());
        assertEquals("Age is incorrect", 28, student1.getAge());
        assertEquals("Username is incorrect", "LouiseKilheeney28", student1.getUsername());
        assertEquals("Date of Birth", "17/04/1992", student1.getDob());
        assertEquals("student Id no. is incorrect", 1234523, student1.getId());
        assertEquals("Cousre is incorrect", "Software Engineering 3", student1.getCourse());
        
        Student student2 = new Student("JaneDoe", 18, "17/04/1992", 987654, "JaneDoe18","Systems Modelling and Simulation");

        assertEquals("Name is incorrect", "JaneDoe", student2.getName());
        assertEquals("Age is incorrect", 18, student2.getAge());
        assertEquals("Username is incorrect", "JaneDoe18", student2.getUsername());
        assertEquals("Date of Birth doesnt match expected", "17/04/1992", student2.getDob());
        assertEquals("student Id no. is incorrect", 987654, student2.getId());
        assertEquals("Cousre is incorrect", "Systems Modelling and Simulation", student2.getCourse());
    }

    public void testModule()
    {
    	Student student1 = new Student("LouiseKilheeney", 28, "17/04/1992", 1234523, "Louisekilheeney28","Software Engineering 3");
    	Student student2 = new Student("JaneDoe", 18, "17/04/1992", 987654, "JaneDoe18","Systems Modelling and Simulation");
    	
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);

        Module module1 = new Module("Machine Learning", "CT4101", students);
        assertEquals("Module name is incorrect", "Machine Learning", module1.getModuleName());
        assertEquals("Module Code is incorrect", "CT4101", module1.getModuleId());
        assertNotNull("Students are missing", module1.getStudents());

    }

    public void testProgrammeClass()
    {
    	Student student1 = new Student("LouiseKilheeney", 28, "17/04/1992", 1234523, "Louisekilheeney28","Software Engineering 3");
    	Student student2 = new Student("JaneDoe", 18, "17/04/1992", 987654, "JaneDoe18","Systems Modelling and Simulation");
    	
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        
        Module module1 = new Module("Machine Learning", "CT4101", students);
        ArrayList<Module> module = new ArrayList<Module>();
        module.add(module1);

        DateTime start = new DateTime("2020-08-28");
        DateTime end = new DateTime("2020-12-18");

        ProgrammingClass course = new ProgrammingClass("CS&IT", module, students, start, end);
        assertEquals("Course name is incorrect", "CS&IT", course.getCourseName());
        assertNotNull("Module missing!", course.getCourseModules());
        assertNotNull("Students are missing!", course.getStudentsEnrolled());
        assertNotNull("Start time is missing", course.getStartDate());
        assertNotNull("End time is missing", course.getEndDate());
        
    }

}
