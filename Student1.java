public class Student1 {

    String sname;
    int sroll;
    String field;
    char grade;

    //Constructor

    Student1 (String name, int roll, String f, char g){
        sname = name;
        sroll = roll;
        field = f;
        grade = g;
    }

    // Method with parameters or argument.
    void getValues(String name, int roll, String f, char g) {

        sname = name;
        sroll = roll;
        field = f;
        grade = g;
    }

    //Method to display values
    void display() {
        System.out.println(sname);
        System.out.println(sroll);
        System.out.println(field);
        System.out.println(grade);
    }
}
