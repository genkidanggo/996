package Main.Day0811;

public class ArrayUtil {
    public void max(int a,int b){
        int max;
        if(a > b)
            max = a;
        else
            max = b;
        System.out.println("最大值为：" + max);
    }
     public void max(double a,double b){
        double max;
        if(a > b)
            max = a;
        else
            max = b;
         System.out.println("最大值为：" + max);
    }
    public void add(int a,int b){
        System.out.println("两数之和为："+ (a+b));
    }
     public void add(double a,double b){
        System.out.println("两数之和为："+ (a+b));
    }
    public void sort(int[] a){
        for (int i = 0; i < a.length-1; i++){
            for (int j = 0; j < a.length-i-1; j++){
                if (a[j] > a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
        for (int n : a){
            System.out.print(n);
        }
        System.out.println();
    }

    public void sort(String[] a){
        for (int i = 0; i < a.length-1; i++){
            for (int j = i+1; j < a.length; j++){
                if (a[i].compareTo(a[j])>0){
                    String tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        for (String s : a){
            System.out.print(s +"\t");
        }
        System.out.println();
    }
    public void cp(int[] a,int[] b){
        for (int i = 0;i < a.length; i++){
            a[i] = b[i];
        }
        for (int n : a){
            System.out.print(n);
        }

    }

}
