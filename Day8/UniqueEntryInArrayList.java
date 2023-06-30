import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UniqueEntryInArrayList {
    /**
     * Assignment : Write a Java Program to check and add a Object before adding it into a Collection by
     * writing an utility method that will check the most significant properties of an Object with which it
     * can determine whether an object with the same properties already exists in the Collection or not.
     * Only if there is no duplicate, we will add that element into the Collection (ArrayList), else that
     * method will print an Error message stating that this object already exists in the Collection.
     */

    public static void main(String[] args) {

        Student s1 = new Student("Bhaskar", 101, "ECE");
        Student s2 = new Student("Malli", 102, "CSE");
        Student s3 = new Student("Prasad", 103, "MECH");
        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);

        checkAndAddElement(s1, studentList);
        checkAndAddElement(s2, studentList);
        checkAndAddElement(s3, studentList);
        studentList.forEach((s)-> System.out.println(s));

    }

    public static void checkAndAddElement(Student s, List<Student> studentList) {
        boolean check = false;
        for (Student s1 : studentList) {
            if (s1.getId() == s.getId())
                check = true;
            else
                check = false;
        }
        if (check)
            System.out.println("Student already present with id : " + s.getId());
        else {
            studentList.add(s);
            System.out.println("Student successfully added to list");
        }
    }
}

