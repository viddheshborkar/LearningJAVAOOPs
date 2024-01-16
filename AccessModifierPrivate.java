// Private can be accessed in same class.
class Test {
    private int a = 100;
    private void m1() {
        System.out.println(a);
    }
}
public class AccessModifierPrivate {
    public static void main(String[] args) {

        Test obj = new Test();
    //    obj.a = 5; //Here private variable can't be accessed through another class.
    //    obj.m1(); // Here private method can't be accessed through another class.
    }
}
