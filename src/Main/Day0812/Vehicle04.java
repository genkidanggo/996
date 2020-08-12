package Main.Day0812;

public class Vehicle04 {
    public double speed;
    public String type;

    public Vehicle04(double speed, String type) {
        this.speed = speed;
        this.type = type;
    }

    public void move(){
        System.out.println(type +"的速度为：" +speed);
    }

    public void setSpeed(double s) {
        this.speed = s;
    }

    public void speedUp(double s){
        this.speed += s;
    }
    public void speedDown(double s){
        this.speed -= s;
    }
}
