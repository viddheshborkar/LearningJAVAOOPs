   final class Bike {  //this class is set as final
        final void run() { // this method is set as final
        System.out.println("The bike is running..");
    }
}
    class Honda extends Bike { //Final class can't be inherited.
        void run() { //Final method can't be overridden
        System.out.println("The bike has started..");
    }
}
    public class FinalMethodandClass {

        public static void main(String[] args) {
            Honda h = new Honda();
            h.run();
        }

    }