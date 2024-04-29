import java.util.LinkedList;

class Student {
    private String firstName;
    private String lastName;
    private String id;
    private String major;
    private String classStanding;
    private double gpa;
    private LinkedList<String> courseList;
    public Student(String firstName, String lastName, String id, String major, String classStanding, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.major = major;
        this.classStanding = classStanding;
        this.gpa = gpa;
        this.courseList = new LinkedList<>();
    }
    public void addCourse(String course) {
        courseList.add(course);
    }

    public void removeCourse(String course) {
        courseList.remove(course);
    }
    public void sortCourseList() {
        courseList.sort(String::compareToIgnoreCase);
    }
    public StringBuilder getStudentCourses() {
        StringBuilder courses = new StringBuilder();
        for (String course : courseList) {
            courses.append(course).append(", ");
        }
        return courses;
    }
    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\n" +
                "ID: " + id + "\n" +
                "Major: " + major + "\n" +
                "Class Standing: " + classStanding + "\n" +
                "GPA: " + gpa;
    }
}
public class Main {
    public static void main(String[] args) {
        Student student = new Student("John", "Doe", "12345", "Computer Science", "Senior", 3.8);
        student.addCourse("Math");
        student.addCourse("English");
        student.addCourse("Physics");
        student.addCourse("History");
        System.out.println("Student Info:");
        System.out.println(student);
        System.out.println("\nStudent's Course List Unordered:");
        System.out.println(student.getStudentCourses());

        student.sortCourseList();
        System.out.println("\nStudent's Course List Ordered:");
        System.out.println(student.getStudentCourses());
        student.removeCourse("English");
        System.out.println("\nRemoved Student Courses:");
        System.out.println(student.getStudentCourses());
    }
}

