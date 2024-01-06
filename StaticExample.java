public class StaticExample {

    int a=5;
    static int b=10;

    // Non-static method
    void nonStaticMethod() {
        System.out.println("This is non-static method");
    }

    //Static method
    static void staticMethod() {
        System.out.println("This is static method");
        }

    // Non-static method can call all static as well as non-static method.
    void nonStaticM() {
        System.out.println("***************This is non-static output****************");
        System.out.println("The value of a is "+a);
        System.out.println("The value of b is "+StaticExample.b);
        nonStaticMethod();
        staticMethod();
    }

    public static void main(String[] args) {
        // Static Method is called without an object
        staticMethod();
        System.out.println("Output of static variable is "+b);

        //Non-static Method is called creating an object

        StaticExample se = new StaticExample();
        System.out.println("Output of non-static variable is "+se.a);
        se.nonStaticMethod();

        se.nonStaticM();

    }
}

