package collections.data.model;

public class Student implements Comparable<Student> {

    private String name;
    private Integer age;

    public Student(String name, Integer age) {

        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {

        return "Student{" +
                "name = " + name + ", " +
                "age = " + age + "}";

    }


    @Override
    public int compareTo(Student student) {


        if (age.equals(student.age)) {
            return name.compareTo(student.name);
        }
        else  {
            return age.compareTo(student.age);
        }
    }

}
