public class ConstructorCreation {

    int x,y,z;

    ConstructorCreation(int a, int b, int c) {

        x = a;
        y = b;
        z = c;
    }

    int sum() {
        int result = x + y + z;
        return result;
    }

    public static void main(String[] args) {
        ConstructorCreation cc = new ConstructorCreation(10, 20, 30);
        cc.sum();
        System.out.println(cc.sum());
    }

}
