package Day0813;

import java.util.Scanner;

public class AministratorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aministrator a = new Aministrator();
        int n = 0;
        a.setLoginAccount("aaaa");
        a.setLoginPassword("bbbb");

        while (true){
            System.out.println("请输入登录名：\n请输入密码：");
            if (a.getLoginAccount().equals(sc.next()) && a.getLoginPassword().equals(sc.next())){
                System.out.println("登录成功！");
                break;
            }else{
                System.out.println("输入有误！");
                n+=1;
                if (n == 5){
                    System.out.println("输入错误超过五次！结束运行");
                    System.exit(0);
                }

            }
        }



    }
}
