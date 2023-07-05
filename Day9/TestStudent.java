package demo2;
import demo1.Student;
public class TestStudent {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setName("Bhaskar");
        s1.setId(10);
        System.out.println(Student.collegeName);
        System.out.println(s1);

    }

}
