import org.testng.Assert;
import org.testng.annotations.Test;
import org.example.Student;

//Example of positive and negative test cases

public class LibraryManagementSystemTest {

    @Test
    public void testStudentId() {
        Student student = new Student(1, "Mark Williams", 34, 12);
        Assert.assertEquals(student.getStudentId(), 1);
    }

    @Test
    public void testStudentName() {
        Student student = new Student(1, "John Doe", 100, 45);
        Assert.assertEquals(student.getStudentName(), "John Doe");
    }

    @Test
    public void testTotalClasses() {
        Student student = new Student(1, "Gregory Wright", 100, 64);
        Assert.assertEquals(student.getTotalClasses(), 100);
    }

    @Test
    public void testAttendedClasses() {
        Student student = new Student(1, "Lars Urlich", 100, 34);
        Assert.assertEquals(student.getAttendedClasses(), 80);
    }

    @Test
    public void testPercentageAttended() {
        Student student = new Student(1, "Marcus Pot", 100, 23);
        Assert.assertEquals(student.getPercentageAttended(), 80);
    }
}
