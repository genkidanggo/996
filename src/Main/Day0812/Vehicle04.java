package Main.Day0812;

public class Vehicle04 {
    public double speed;
    public String type;

    public Vehicle04(double speed, String type) {
        this.speed = speed;
        this.type = type;
    }

    public void move(){
        System.out.println(type + "能够移动");
    }

    public void setSpeed(double s) {
        this.speed = s;
    }

    public void speedUp(double s){
        this.speed += s;
        System.out.println("加速后速度为：" +this.speed);
    }
    public void speedDown(double s){
        this.speed -= s;
        System.out.println("减速后速度为：" +this.speed);

    }
}
