package demo1;

public class Student {
    private String name;
    private  int id;
      public static String collegeName= "KEC";

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "demo1.Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

