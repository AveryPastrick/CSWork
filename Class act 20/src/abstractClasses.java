abstract class AbstractClass {
    public abstract void abstractMethod();
}
class Subclass1 extends AbstractClass {
    @Override
    public void abstractMethod() {
        System.out.println("Implementation of abstract method in Subclass1");
    }
}
class Subclass2 extends AbstractClass {
    @Override
    public void abstractMethod() {
        System.out.println("Implementation of abstract method in Subclass2");
    }
}
interface MyInterface {
    void interfaceMethod();
}
class Class1 implements MyInterface {
    @Override
    public void interfaceMethod() {
        System.out.println("Implementation of interface method in Class1");
    }
}
class Class2 implements MyInterface {
    @Override
    public void interfaceMethod() {
        System.out.println("Implementation of interface method in Class2");
    }
}
public class abstractClasses {
    public static void main(String[] args) {
        AbstractClass obj1 = new Subclass1();
        AbstractClass obj2 = new Subclass2();

        obj1.abstractMethod();
        obj2.abstractMethod();

        MyInterface obj3 = new Class1();
        MyInterface obj4 = new Class2();

        obj3.interfaceMethod();
        obj4.interfaceMethod();
    }
}
