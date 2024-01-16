
//Public is accessible everywhere i.e. within class, within package, outside class, outside package
public class AccessModifierPublic {
    public  int a = 500;
    public void m1() {
        System.out.println(a);
    }

    public static void main(String[] args) {
        AccessModifierPublic obj = new AccessModifierPublic();
        obj.a=20;
        obj.m1();
    }
}
