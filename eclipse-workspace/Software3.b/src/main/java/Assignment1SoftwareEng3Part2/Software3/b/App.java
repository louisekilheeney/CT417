package Assignment1SoftwareEng3Part2.Software3.b;

import org.joda.time.DateTime;

import Assignment1SoftwareEng3.Eng3.Module;
import Assignment1SoftwareEng3.Eng3.Course;
import Assignment1SoftwareEng3.Eng3.Student;

public class App 
{
    public static void main( String[] args )
    {
        // Create students, modules and Course(s)
        Student student1 = new Student("LouiseKilheeney", 28, "17/04/1992", 1234523);
        Student student2 = new Student("Jane Doe", 21, "19/09/1999", 9876532);
        Student student3 = new Student("Clare Costello", 19, "01/02/2000", 23523234);
        Student student4 = new Student("David Moore", 19, "25/12/2000", 346543421);
        Student student5 = new Student("Carol Grimes", 19, "02/05/1990", 345346321);

        Module softwareEng3 = new Module("Soft_Eng 3", "CT4117");
        Module proSkills = new Module("ProSkills", "CT401");
        Module machineLearning = new Module("ML", "CT404");
        
        DateTime start = new DateTime("2020-08-23");
        DateTime end = new DateTime("2020-12-29");
        Course CSIT = new Course("CS&IT", start, end);
        
        // Add students to modules
        softwareEng3.addStudent(student1);
        softwareEng3.addStudent(student2);
        softwareEng3.addStudent(student3);
        student1.addModule(softwareEng3.getId());
        student2.addModule(softwareEng3.getId());
        student3.addModule(softwareEng3.getId());
        
        proSkills.addStudent(student4);
        proSkills.addStudent(student5);
        student4.addModule(proSkills.getId());
        student5.addModule(proSkills.getId());
        
        machineLearning.addStudent(student1);
        machineLearning.addStudent(student3);
        machineLearning.addStudent(student5);
        student1.addModule(machineLearning.getId());
        student3.addModule(machineLearning.getId());
        student5.addModule(machineLearning.getId());
        
        // Add Modules to Course(s)
        CSIT.addModule(softwareEng3);
        CSIT.addModule(proSkills);
        CSIT.addModule(machineLearning);
        
        //Add Students to Course(s)
        CSIT.addStudent(student1);
        CSIT.addStudent(student2);
        CSIT.addStudent(student3);
        CSIT.addStudent(student4);
        CSIT.addStudent(student5);
        
        // Print out 
        printCourseInfo(CSIT);
    }
    
    public static void printCourseInfo(Course course) {
    	//print out course name
        System.out.println("Course Name: " + course.getName());
        //print out modules in course 
        System.out.println("Modules in " + course.getName() + ":");
        for (Module mod : course.getmodules()) {
            System.out.println(mod.getId() + " " + mod.getName());
        }
        //students who are registed in Course and what module they are registed too
        System.out.println("\nStudents registered in " + course.getName() + ":");
        for (Student student : course.getStudentsEnrolled()) {
            System.out.println("\nID: " + student.getId() + " Name: " + student.getName() + " Username: " + student.getUsername());
            
            System.out.println("Registered for modules: ");           
            for (String moduleId : student.getModules()) {
                System.out.println("Name: " + course.getModule(moduleId).getName() + " ID:" + course.getModule(moduleId).getId());
            }
        }
        // prints module and detail of students in each one.
        System.out.println("\n" + course.getName() + " modules/Student List:");
        for (Module module : course.getmodules()) {
	        System.out.println("\nStudents registered for module " + module.getId() + " " + module.getName());
	        for (Long studentId : module.getStudents()) {
	            System.out.println("Student: " + course.getStudent(studentId).toString());
	        }
        }
    }
}
