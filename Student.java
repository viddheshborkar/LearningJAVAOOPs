public class Student {

    int stuID;
    float sub1, sub2, sub3;
    String stuName;
    void getStuData(int sID, String sName) {

        stuID = sID;
        stuName = sName;

    }

    void getStuMarks(float subj1, float subj2, float subj3) {

        sub1 = subj1;
        sub2 = subj2;
        sub3 = subj3;
    }

    float totalMarks() {
        System.out.println("Student ID :"+stuID);
        System.out.println("Student Name :"+stuName);
        float totalMarks = (sub1 + sub2 + sub3)/300*100;
        return totalMarks;
    }

    public static void main(String[] args) {
        Student stu = new Student();

        System.out.println("*******************");
        stu.getStuData(1, "Ramesh");
        stu.getStuMarks(60,70,75);
        System.out.println(stu.totalMarks());

        System.out.println("*******************");
        stu.getStuData(1, "Suresh");
        stu.getStuMarks(70,70,75);
        System.out.println(stu.totalMarks());

        System.out.println("*******************");
        stu.getStuData(1, "Paresh");
        stu.getStuMarks(85,80,75);
        System.out.println(stu.totalMarks());

    }
}
