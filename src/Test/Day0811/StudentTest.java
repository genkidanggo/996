package Test.Day0811;

import Main.Day0811.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("1",1);
        Student s2 = new Student("2",2,"2");
        Student s3 = new Student("3",3,"3","3");

        System.out.println(s1.name + s1.age);
        System.out.println(s2.name + s2.age + s2.school);
        System.out.println(s3.name + s3.age + s3.school + s3.major);

    }
}
