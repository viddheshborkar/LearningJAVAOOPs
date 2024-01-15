
class Parent {
    void method1() {
        System.out.println("This method is from Parent...");
    }
}

interface Child1 {
    void method2();
}

interface Child2 {
    void method3();
}

public class HybridInheritance extends Parent implements Child1, Child2 {

    public void method2() {
        System.out.println("This is Method2 from Child1");
    }

    public void method3() {
        System.out.println("This is Method3 from Child2");
    }

    public static void main(String[] args) {
        HybridInheritance obj = new HybridInheritance();
        obj.method1();
        obj.method2();
        obj.method3();
    }
}
