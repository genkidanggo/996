package Test.Day0812;

import Main.Day0812.Vehicle04;

public class Vehicle04T {
    public static void main(String[] args) {
        Vehicle04 v1 = new Vehicle04(70,"汽车");
        System.out.println(v1.type +"的速度为：" +v1.speed);
        v1.speedUp(20);
        v1.speedDown(20);
    }
}
