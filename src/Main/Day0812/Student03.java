package Main.Day0812;

public class Student03 {
    public int score;
    public String name;

    public void printScore(){
        if (score >= 95){
            System.out.println(name + "的分数为：" +score+ "等级为：A");
        }else if (score >= 80 && score < 95){
            System.out.println(name + "的分数为：" +score+ "等级为：B");
        }else{
            System.out.println(name + "的分数为：" +score+ "等级为：C");
        }
    }
}
