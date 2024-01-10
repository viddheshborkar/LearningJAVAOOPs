class A {
    int a;
    void display() {
        System.out.println("The value of a "+a);
    }
}
class B extends A {
    int b;

    void print() {
        System.out.println("The value of b "+b);
    }
}

class C extends B {
    int c;
    void show(){
        System.out.println("The value of c "+c);
    }
}

public class Inherit2MultiLevel {

    public static void main(String[] args) {
        A aobj = new A();
        aobj.a=1;
        aobj.display();

        B bobj = new B();
        bobj.a=10;
        bobj.b=15;
        bobj.display();
        bobj.print();

        C cobj = new C();
        cobj.a=30;
        cobj.b=35;
        cobj.c=40;
        cobj.display();
        cobj.print();
        cobj.show();

    }
}
