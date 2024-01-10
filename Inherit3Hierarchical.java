
class A11 {
    int a;
    void display() {
        System.out.println("The value of a "+a);
    }
}
class B11 extends A11 {
    int b;

    void print() {
        System.out.println("The value of b "+b);
    }
}

class C11 extends A11 {
    int c;
    void show(){
        System.out.println("The value of c "+c);
    }
}

public class Inherit3Hierarchical {

    public static void main(String[] args) {
        A11 aobj = new A11();
        aobj.a=1;
        aobj.display();

        B11 bobj = new B11();
        bobj.a=10;
        bobj.b=15;
        bobj.display();
        bobj.print();

        C11 cobj = new C11();
        cobj.a=30;
        cobj.c=40;
        cobj.display();
        cobj.show();

    }
}