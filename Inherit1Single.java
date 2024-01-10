class A1 {
    int a;

    void display() {
        System.out.println("The value of a " + a);
    }
}

    class B1 extends A {
        int b;

        void print() {
            System.out.println("The value of b " + b);
        }
    }

        public class Inherit1Single {
            public static void main(String[] args) {
                A1 aobj = new A1();
                aobj.a = 5;
                aobj.display();

                B1 bobj = new B1();
                bobj.b = 10;
                bobj.print();
                bobj.a = 15;
                bobj.display();


            }
        }
