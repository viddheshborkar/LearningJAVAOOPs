public class StaticExampleMain {
            public static void main(String[] args) {

            //When we call static variable/methods from different class, we should use ClassName.

            StaticExample.staticMethod();
            System.out.println("Output of static variable b is "+ StaticExample.b);

            //Non-static Method is called creating an object

            StaticExample se = new StaticExample();
            System.out.println("Output of non-static variable a is "+se.a);
            se.nonStaticMethod();
            se.nonStaticM();
        }
    }
