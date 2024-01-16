
//Default can be accessed only within the package and within the class.
// Across all the classes those are available in same package.
//No modifier specified means Default.

class Test1 {
    int a = 50;
    void specify() {
        System.out.println(a);
    }
}
public class AccessModifierDefault {
    public static void main(String[] args) {
        Test1 obj = new Test1();
        obj.a = 12;
        obj.specify();
    }
}
