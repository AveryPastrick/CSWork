public class Main {
    public static void main(String[] args) {
       // I wasnt to sure as to what the prompt for this work meant or was asking for
        // so hopefully this works.


        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass(10);
        MyClass obj3 = new MyClass(20, 3.5, "Hello", true);

        obj1.overloadedMethod();
        obj2.overloadedMethod(5);
    }
}

class MyClass {
    private int variable1;
    private double variable2;
    private String variable3;
    private boolean variable4;

    public MyClass() {
        this.variable1 = 0;
        this.variable2 = 0.0;
        this.variable3 = "";
        this.variable4 = false;
    }

    public MyClass(int variable1) {
        this.variable1 = variable1;
        this.variable2 = 0.0;
        this.variable3 = "";
        this.variable4 = false;
    }

    public MyClass(int variable1, double variable2, String variable3, boolean variable4) {
        this.variable1 = variable1;
        this.variable2 = variable2;
        this.variable3 = variable3;
        this.variable4 = variable4;
    }

    public int getVariable1() {
        return variable1;
    }

    public void setVariable1(int variable1) {
        this.variable1 = variable1;
    }

    public double getVariable2() {
        return variable2;
    }

    public void setVariable2(double variable2) {
        this.variable2 = variable2;
    }

    public String getVariable3() {
        return variable3;
    }

    public void setVariable3(String variable3) {
        this.variable3 = variable3;
    }

    public boolean isVariable4() {
        return variable4;
    }

    public void setVariable4(boolean variable4) {
        this.variable4 = variable4;
    }

    public void overloadedMethod() {
        System.out.println("Inside overloadedMethod() with no parameters. Instance variables: " + variable1 + ", " + variable2 + ", " + variable3 + ", " + variable4);
    }

    public void overloadedMethod(int param) {
        System.out.println("Inside overloadedMethod() with parameter: " + param + ". Instance variables: " + variable1 + ", " + variable2 + ", " + variable3 + ", " + variable4);
    }
}
