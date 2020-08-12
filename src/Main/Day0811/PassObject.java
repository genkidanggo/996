package Main.Day0811;

public class PassObject {


    public void printAreas(Circle c,int time){
        for (int i = 1; i <= time ;i++){
            c.radius = i;
            System.out.print("半径为：" +c.radius+ "\t");
            System.out.printf("面积为：%.2f\n",c.findArea());
        }
    }
}
