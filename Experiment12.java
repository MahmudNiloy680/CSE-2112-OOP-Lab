class Base {
    void show() {
        System.out.println("Base Class Method");
    }
}
class Derived extends Base {
    @Override
    void show() {
        System.out.println("Derived Class Method (Overridden)");
    }
    void exclusiveMethod() {
        System.out.println("Exclusive to Derived");
    }
}
public class Experiment12 {
    public static void main(String[] args) {
        Base obj = new Derived();
        System.out.println("Calling show()...");
        obj.show();
    }
}