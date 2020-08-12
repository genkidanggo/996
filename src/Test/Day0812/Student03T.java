package Test.Day0812;

import Main.Day0812.Student03;

import java.security.SecureRandom;

public class Student03T {
    public static void main(String[] args) {
        Student03 s1 = new Student03();
        SecureRandom sr = new SecureRandom();
        s1.score = sr.nextInt(101);
        s1.name = "qh";
        s1.printScore();
    }


}
