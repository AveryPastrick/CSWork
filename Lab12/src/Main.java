import java.util.HashMap;
import java.util.Scanner;

class Course {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course Name: " + courseName;
    }
}

class Student {
    private String studentID;
    private HashMap<String, Course> courses;

    public Student(String studentID) {
        this.studentID = studentID;
        courses = new HashMap<>();
    }

    public void addCourse(String courseName, Course course) {
        courses.put(courseName, course);
    }

    public void removeCourse(String courseName) {
        courses.remove(courseName);
    }

    public Course getCourse(String courseName) {
        return courses.get(courseName);
    }

    public String getAllCoursesInfo() {
        StringBuilder info = new StringBuilder();
        for (Course course : courses.values()) {
            info.append(course.toString()).append("\n");
        }
        return info.toString();
    }
    @Override
    public String toString() {
        return "Student ID: " + studentID + "\nCourses:\n" + getAllCoursesInfo();
    }
}

class StudentRecord {
    private HashMap<String, Student> students;

    public StudentRecord() {
        students = new HashMap<>();
    }

    public void addStudent(String studentID, Student student) {
        students.put(studentID, student);
    }

    public void removeStudent(String studentID) {
        students.remove(studentID);
    }

    public Student getStudent(String studentID) {
        return students.get(studentID);
    }

    public String getAllStudentsInfo() {
        StringBuilder info = new StringBuilder();
        for (Student student : students.values()) {
            info.append(student.toString()).append("\n");
        }
        return info.toString();
    }
}

class Menu {
    private StudentRecord studentRecord;
    private Scanner scanner;
    public Menu() {
        studentRecord = new StudentRecord();
        scanner = new Scanner(System.in);
    }
    public void displayMenu() {
        int choice;
        do {
            System.out.println("1. Create a new Student");
            System.out.println("2. Remove a Student");
            System.out.println("3. Display one Student's info");
            System.out.println("4. Display all Students' info");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
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
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }
    private void createStudent() {
        System.out.print("Enter student ID: ");
        String studentID = scanner.nextLine();
        Student student = new Student(studentID);
        studentRecord.addStudent(studentID, student);

        int courseChoice;
        do {
            System.out.println("Add Course:");
            System.out.print("Enter course name: ");
            String courseName = scanner.nextLine();
            Course course = new Course(courseName);
            student.addCourse(courseName, course);

            System.out.println("Do you want to add another course? (1. Yes / 2. No)");
            courseChoice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
        } while (courseChoice == 1);
    }

    private void removeStudent() {
        System.out.print("Enter student ID to remove: ");
        String studentID = scanner.nextLine();
        if (studentRecord.getStudent(studentID) != null) {
            studentRecord.removeStudent(studentID);
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    private void displayStudentInfo() {
        System.out.print("Enter student ID to display info: ");
        String studentID = scanner.nextLine();
        Student student = studentRecord.getStudent(studentID);
        if (student != null) {
            System.out.println(student.toString());
        } else {
            System.out.println("Student not found.");
        }
    }

    private void displayAllStudentsInfo() {
        System.out.println("All Students' Info:");
        System.out.println(studentRecord.getAllStudentsInfo());
    }
}

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.displayMenu();
    }
}
