package Main.Day0812;

import java.util.Scanner;

public class C1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //定义
        int[][] a1 = new int[2][2];
        int a2[][] = new int[2][2];
        int[][] a3 = new int[2][];
        int a4[][] = new int[2][];
        int[][] a5 = {{1,1},{2,2}};
        //赋值
        a1[0][0] = 1;
        a1[1][1] = 2;
        for (int i = 0; i < a2.length; i++){
            for (int j = 0; j < a2[i].length; j++){
                a2[i][j] = sc.nextInt();
            }
        }
        //遍历
        for (int i = 0; i < a5.length; i++){
            for (int j = 0; j < a5[i].length; j++){
                System.out.print(a5[i][j]);
            }
            System.out.println();
        }
        for (int[] i : a5){
            for (int j : i){
                System.out.print(j);
            }
            System.out.println();
        }



    }
}
