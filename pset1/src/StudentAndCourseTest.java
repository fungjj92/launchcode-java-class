import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

import java.io.PrintStream;

/**
 * JUnit tests for Student, Course and Person
 * @author dshook
 *
 */
public class StudentAndCourseTest extends TestCase {
	@Test
	public void testStudentInit() {
		Student s = new Student("M", 30, 1123, "Doug", "Shook", 111111, "Fulltime");
		assertEquals("Doug Shook", s.getName());
		assertEquals(111111, s.getStudentID());
		//No credits, no GPA
		assertEquals(0.0, s.getGPA());
		assertEquals(0, s.getCredits());

        //Generate some random students, and test
		for (int i = 0; i < 20; ++i) {
			double a =  (Math.random() * 5000);
			double b =  (Math.random() * 5000);
			int c = (int)(Math.random() * 5000);
			Student s3 = new Student("I", 20, 0415, "" + a, "" + b, c, "Parttime");
			assertEquals(a + " " + b, s3.getName());
			assertEquals(0.0, s3.getGPA());
			assertEquals(0, s3.getCredits());
		}
	}

    //More tests should go here
	@Test
	public void testAddedGetSets() {
		Student s = new Student("M", 30, 1123, "Doug", "Shook", 111111, 17, 3.5, "Fulltime");
		assertEquals("Doug Shook 111111", s.toString());
		assertEquals("Freshman", s.getClassStanding());
		System.out.println(s.computeTuition());
		System.out.println(s.submitGrade(4.0, 3));
	}

	@Test
	public void testBaby(){
		Student s = new Student("M", 30, 1123, "Doug", "Shook", 111111, 17, 3.5, "Fulltime");
		Student b = new Student("F", 60, 0516, "Hillary", "Clinton", 222222, 150, 4.0, "Fulltime");
		Student baby = s.createLegacy(b);
	}

	@Test
	public void testCourse(){
		Course a = new Course("Making of ATLA", "AVA550", 3.0, 40);
		assertEquals("Making of ATLA", a.getCName());
		assertEquals(40, a.getnumSeats());
		assertEquals("AVA550 3.0", a.toCString());

		Student s = new Student("M", 30, 1123, "Doug", "Shook", 111111, 17, 3.5, "Fulltime");
		boolean tf = a.addStudent(s);
		System.out.println(tf);
		assertEquals(39, a.getnumSeats());
		a.printRoster();
	}

	@Test
	public void testAvgGPA(){
		Course a = new Course("Making of ATLA", "AVA550", 3.0, 40);
		Student s = new Student("M", 30, 1123, "Doug", "Shook", 111111, 17, 3.5, "Fulltime");
		Student b = new Student("F", 60, 0516, "Hillary", "Clinton", 222222, 150, 4.0, "Fulltime");
		a.addStudent(s);
		a.addStudent(b);
		double avgGPA = a.averageGPA();
		System.out.println(avgGPA);
	}

	@Test
	public void testPerson(){
		Person i = new Person("Male", 36, 1123, "Instructor");
		assertEquals("Male", i.getSex());
		assertEquals("Female", i.changeSex("Female"));
		assertEquals(36, i.getAge());
		assertEquals(1123, i.getBday());
		i.changeOccupation("Preacher");
		assertEquals("Preacher", i.getOccupation());
	}

}


