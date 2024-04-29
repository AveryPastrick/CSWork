import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class DataStructure {
    private ArrayList<String> studentList = new ArrayList<>();
    private int[] ageList = new int[3];
    private HashMap<String, Double> majorGpaMap = new HashMap<>();
    private LinkedList<String> nationalityList = new LinkedList<>();
    private Stack<String> hometownStack = new Stack<>();
    private Queue<String> homeStateQueue = new LinkedList<>();

    public void addStudent(String name) {
        studentList.add(name);
    }
    public void removeStudent(String name) {
        studentList.remove(name);
    }
    public void printStudentList() {
        System.out.println("Student List: " + studentList);
    }
    public void addMajorGPA(String major, double gpa) {
        majorGpaMap.put(major, gpa);
    }
    public void removeMajorGPA(String major) {
        majorGpaMap.remove(major);
    }
    public void printMajorGpaMap() {
        System.out.println("Major GPA Map: " + majorGpaMap);
    }
    public void addNationality(String nationality) {
        nationalityList.add(nationality);
    }
    public void removeNationality(String nationality) {
        nationalityList.remove(nationality);
    }
    public void printNationalityList() {
        System.out.println("Nationality List: " + nationalityList);
    }
    public void addHometown(String hometown) {
        hometownStack.push(hometown);
    }
    public void removeHometown() {
        hometownStack.pop();
    }
    public void printHometownStack() {
        System.out.println("Hometown Stack: " + hometownStack);
    }
    public void addHomeState(String state) {
        homeStateQueue.add(state);
    }
    public void removeHomeState() {
        homeStateQueue.poll();
    }
    public void printHomeStateQueue() {
        System.out.println("Home State Queue: " + homeStateQueue);
    }
    public static void main(String[] args) {
        DataStructure ds = new DataStructure();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            ds.addStudent(name);
        }

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter major: ");
            String major = scanner.nextLine();
            System.out.print("Enter GPA: ");
            double gpa = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            ds.addMajorGPA(major, gpa);
        }

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter nationality: ");
            String nationality = scanner.nextLine();
            ds.addNationality(nationality);
        }

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter hometown: ");
            String hometown = scanner.nextLine();
            ds.addHometown(hometown);
        }

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter home state: ");
            String state = scanner.nextLine();
            ds.addHomeState(state);
        }

        ds.printStudentList();
        ds.printMajorGpaMap();
        ds.printNationalityList();
        ds.printHometownStack();
        ds.printHomeStateQueue();

        ds.removeStudent(ds.studentList.get(0));
        ds.removeMajorGPA(ds.majorGpaMap.keySet().iterator().next());
        ds.removeNationality(ds.nationalityList.get(0));
        ds.removeHometown();
        ds.removeHomeState();

        ds.printStudentList();
        ds.printMajorGpaMap();
        ds.printNationalityList();
        ds.printHometownStack();
        ds.printHomeStateQueue();

        scanner.close();
    }
}

