package Test.Day0811;

import Main.Day0811.Person;

import javax.sound.midi.Soundbank;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person(18,"qh");
        System.out.println(p1.getAge());
        System.out.println(p1.name);
    }
}
