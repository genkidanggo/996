package Test.Day0811;

import Main.Day0811.ArrayUtil;

public class ArrayTest {
    public static void main(String[] args) {
        int[] a = {3,4,2,1,6,8};
        int[] b = {4,3,12,6,7,2};
        String[] c = {"Tom","Alice","Dk","hello","danggo"};
        ArrayUtil a1 = new ArrayUtil();
        a1.max(2,3);
        a1.max(2.2,3.3);
        a1.sort(a);
        a1.sort(c);
        a1.add(2,3);
        a1.add(2.2,3.3);
        a1.cp(a,b);

    }
}
