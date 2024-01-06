public class Student1Main {
    public static void main(String[] args) {

        //Approach 1 - Assigning the values by object reference variable.
    /*    Student1 st1 = new Student1();
        Student1 st2 = new Student1();

        st1.sname = "Viddhesh";
        st1.sroll = 25;
        st1.field = "Science";
        st1.grade = 'B';

        st1.display();

    */
        //Approach 2 - Assigning values by using Method
    /*
        Student1 stu = new Student1();
        stu.getValues("Raju",21,"Arts",'C');
        stu.display();
    */

        // Approach 3 - Constructor
        Student1 st = new Student1("Rahul",25,"Vocational",'C');
        st.display();
    }
}
