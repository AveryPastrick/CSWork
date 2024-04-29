public class FieldsAndMethods {
    public static class Employee {
        // instance variables
        private String name;
        private int age;
        private double salary;

        public Employee(String name, int age, double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
    }

    public static class Student {

        private String name;
        private int age;
        private String major;
        private double gpa;
        private String studentId;

        public Student(String name, int age, String major, double gpa, String studentId) {
            this.name = name;
            this.age = age;
            this.major = major;
            this.gpa = gpa;
            this.studentId = studentId;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public String getMajor() {
            return major;
        }
        public void setMajor(String major) {
            this.major = major;
        }
        public double getGpa() {
            return gpa;
        }
        public void setGpa(double gpa) {
            this.gpa = gpa;
        }
        public String getStudentId() {
            return studentId;
        }

        public void setStudentId(String studentId) {
            this.studentId = studentId;
        }
    }

    public static class EmployeeTest {
        public static void main(String[] args) {

            Employee emp = new Employee("John Doe", 30, 50000.0);

            System.out.println("Name: " + emp.getName());
            System.out.println("Age: " + emp.getAge());
            System.out.println("Salary: " + emp.getSalary());

            emp.setName("Jane Doe");
            emp.setAge(35);
            emp.setSalary(60000.0);

            System.out.println("\nUpdated Employee Details:");
            System.out.println("Name: " + emp.getName());
            System.out.println("Age: " + emp.getAge());
            System.out.println("Salary: " + emp.getSalary());
        }
    }

    // StudentTest class
    public static class StudentTest {
        public static void main(String[] args) {
            Student student = new Student("Alice", 20, "Computer Science", 3.8, "CS123");

            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Major: " + student.getMajor());
            System.out.println("GPA: " + student.getGpa());
            System.out.println("Student ID: " + student.getStudentId());

            student.setName("Bob");
            student.setAge(22);
            student.setMajor("Physics");
            student.setGpa(3.5);
            student.setStudentId("PHY456");

            System.out.println("\nUpdated Student Details:");
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Major: " + student.getMajor());
            System.out.println("GPA: " + student.getGpa());
            System.out.println("Student ID: " + student.getStudentId());
        }
    }
}