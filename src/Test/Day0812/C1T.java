package Test.Day0812;

public class C1T {
    public static void main(String[] args) {
        String[] strings = {"ramer","jelly","been","cake"};
        String[] tp = new String[strings.length];

        for (int i = 0,j = strings.length-1; i < strings.length; i++,j--){
            tp[i] = strings[j];
        }
        for (String s : tp)
            System.out.println(s);
}
}
