import java.util.Date;

class Student 
{
    private int id;
    private String name;
    private String program;

    public Student (int id, String name, String program) 
    {
        this.id = id;
        this.name = name;
        this.program = program;
    }

    public int getId() 
    {
        return id;
    }

    public String getName() 
    {
        return name;
    }

    public String getProgram() 
    {
        return program;
    }
}

class Instructor 
{
    private int id;
    private String name;
    private String department;
    private String title;

    public Instructor (int id, String name, String department, String title)
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.title = title;
    }

    public int getId() 
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getDepartment() 
    {
        return department;
    }

    public String getTitle() 
    {
        return title;
    }
}

class Course 
{
    private int id;
    private String syllabus;
    private String title;
    private String credits;
    private String prerequisite;

    public Course ( int id, String syllabus, String title, String credits, String prerequisite) 
    {
        this.id = id;
        this.credits = credits;
        this.title = title;
        this.prerequisite = prerequisite;
        this.syllabus = syllabus;
    }

    public int getId() 
    {
        return id;
    }

    public String getSyllabus() 
    {
        return syllabus;
    }

    public String getTitle() 
    {
        return title;
    }

    public String getCredits() 
    {
        return credits;
    }

    public String getPrerequisite() 
    {
        return prerequisite;
    }

}

class CourseOffering 
{
    private Student student;
    private Instructor instructor;
    private  Course course;
    private Date time;
    private int sectionNo;
    private int roomId;
    private int year;
    private String semester;

    public CourseOffering(Student student, Instructor instructor, Course course, Date time, int sectionNo, int roomId, int year, String semester) 
    {
        this.course = course;
        this.instructor = instructor;
        this.roomId = roomId;
        this.time = time;
        this.sectionNo = sectionNo;
        this.year = year;
        this.student = student;
        this.semester = semester;
    }

    public void displayDetails() 
    {
        System.out.println("Course Offering Details:");
        System.out.println("Student: " + student.getName() + " (" + student.getProgram() +")");
        System.out.println("Instructor: " + instructor.getName() + ", Dept: " + instructor.getDepartment());
        System.out.println("Course: " + course.getTitle() + " (" + course.getCredits() + "credits)");
        System.out.println("Time: " + time);
        System.out.println("Year: " + year + ", Semester: " + semester);
    }
}
public class UniversityStudent 
{
    public static void main(String[] args) 
    {
        Student student = new Student(1, "Ishtiak Rahman" , "SWE");
        Instructor instructor = new Instructor( 102, "Fazle Hasan Rakib", "SWE", "Lecturer");
        Course course = new Course(1001, "Java OOP", "OOP in Java", "3", "None");

        Date currentDate = new Date();
        CourseOffering offering = new CourseOffering(student,instructor,course, currentDate,1, 203, 2025, "SP");
        offering.displayDetails();
    }
}
