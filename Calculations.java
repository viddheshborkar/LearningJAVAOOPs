public class Calculations {

    int x=100, y=200;

    // 4 Different types of Methods

    // Case 1 - No arguments, No return output.
   /* void sum(){
        int sum=x+y;
        System.out.println(sum);

    } */

    // Case 2 - No arguments, return output.
    /*    int sum() {

            int sum = x+y;
            return sum;
      */

    // Case 3 - Arguments, no return output.
            /*
            void sum(int a , int b ) {
            x = a;
            y = b;

            int sum = x + y;
                System.out.println(sum);
            */
    // Case 4 - Arguments, return output.

                int sum(int a , int b ) {
                    x = a;
                    y = b;

                int sum = x + y;
                 return sum;
    }

    public static void main(String[] args) {

        Calculations cal = new Calculations();

        // Case 1
        // cal.sum();

        //Case 2
        /*
        cal.sum();
        int result = cal.sum();
        System.out.println("The sum is "+result);
            //OR
        System.out.println(cal.sum());
         */

        /*
        //Case 3
        cal.sum(10,20);
        */


        //Case 4
        int result = cal.sum(12, 15);
        System.out.println(result);

    }
}
