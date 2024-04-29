import java.util.ArrayList;
import java.util.Scanner;

class Course {
    private String courseName;
    private int courseCode;
    public Course(String courseName, int courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseCode() {
        return courseCode;
    }
    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }
    @Override
    public String toString() {
        return "Course: " + courseName + ", Code: " + courseCode;
    }
}

class Student {
    private String studentName;
    private int studentID;
    private ArrayList<Course> courses;

    public Student(String studentName, int studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public Course getCourse(int index) {
        return courses.get(index);
    }

    public StringBuilder getAllCoursesInfo() {
        StringBuilder info = new StringBuilder();
        for (Course course : courses) {
            info.append(course.toString()).append("\n");
        }
        return info;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student Name: " + studentName + ", ID: " + studentID;
    }
}

class StudentRecord {
    private ArrayList<Student> students;
    public StudentRecord() {
        this.students = new ArrayList<>();
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public void removeStudent(Student student) {
        students.remove(student);
    }
    public Student getStudent(int index) {
        return students.get(index);
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public StringBuilder getAllStudentsInfo() {
        StringBuilder info = new StringBuilder();
        for (Student student : students) {
            info.append(student.toString()).append("\n");
        }
        return info;
    }
}
class Menu {
    private StudentRecord studentRecord;
    private Scanner scanner;
    public Menu() {
        this.studentRecord = new StudentRecord();
        this.scanner = new Scanner(System.in);
    }
    public void displayMenu() {
        int choice = 0;
        while (choice != 5) {
            System.out.println("***** MENU *****");
            System.out.println("1: Create a new Student");
            System.out.println("2: Remove a Student");
            System.out.println("3: Display one Student's info");
            System.out.println("4: Display all Students' info");
            System.out.println("5: Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    createStudent();
                    break;
                case 2:
                    removeStudent();
                    break;
                case 3:
                    displayStudentInfo();
                    break;
                case 4:
                    displayAllStudentsInfo();
                    break;
                case 5:
                    System.out.println("Exiting menu...");
                    break;
                default:
                    System.out.println("Invalid entry");
            }
        }
    }

    private void createStudent() {
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Student student = new Student(name, id);
        System.out.println("Enter Courses (Press 'q' to finish):");
        String input;
        while (true) {
            System.out.print("Enter Course Name (or 'q' to finish): ");
            input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            }
            System.out.print("Enter Course Code: ");
            int courseCode = scanner.nextInt();
            scanner.nextLine();
            student.addCourse(new Course(input, courseCode));
        }
        studentRecord.addStudent(student);
        System.out.println("Student added successfully.");
    }

    private void removeStudent() {
        System.out.print("Enter Student ID to remove: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        boolean found = false;
        for (Student student : studentRecord.getStudents()) {
            if (student.getStudentID() == id) {
                studentRecord.removeStudent(student);
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    private void displayStudentInfo() {
        System.out.print("Enter Student ID to display info: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        boolean found = false;
        for (Student student : studentRecord.getStudents()) {
            if (student.getStudentID() == id) {
                System.out.println("Student Info:");
                System.out.println(student);
                System.out.println("Courses:");
                System.out.println(student.getAllCoursesInfo());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }
    }

    private void displayAllStudentsInfo() {
        System.out.println("All Students:");
        System.out.println(studentRecord.getAllStudentsInfo());
    }
}
public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.displayMenu();
    }
}

