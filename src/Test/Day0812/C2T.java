package Test.Day0812;

import java.security.SecureRandom;
import java.util.Random;

public class C2T {
    public static void main(String[] args) {
        int[][] n = new int[3][3];
        SecureRandom sr = new SecureRandom();
        for (int i = 0; i < n.length; i++){
            for (int j = 0; j < n[i].length; j++){
                n[i][j] = sr.nextInt(10);
                System.out.print(n[i][j]);
            }
            System.out.println();
        }
        int sum = n[0][0] + n[1][1] + n[2][2];
        System.out.println("此矩阵对角线的和为：" +sum);


    }
}
