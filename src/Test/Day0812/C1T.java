package Test.Day0812;

import java.util.ArrayList;
import java.util.Arrays;

public class C1T {
    public static void main(String[] args) {
        String[] strings = {"ramer","jelly","been","cake"};
        System.out.println(Arrays.toString(strings));
        for (int i = 0; i < strings.length/2; i++){
            String tp = strings[i];
            strings[i] = strings[strings.length-i-1];
            strings[strings.length-i-1] = tp;
        }
        System.out.println(Arrays.toString(strings));

        //start++ end--
}
}
