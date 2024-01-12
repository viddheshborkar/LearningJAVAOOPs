public class FinalVariable {
    final int speed=50;

    public static void main(String[] args) {
        FinalVariable fn = new FinalVariable();
    //    fn.speed = 200; // Error; since speed is set as final. Final means constant value.
        System.out.println(fn.speed);
    }

}
