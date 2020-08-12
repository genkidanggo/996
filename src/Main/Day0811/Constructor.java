package Main.Day0811;


/**
 * 构造器作用：对类初始化值
 * 权限修饰符 类名(形参){
 *
 *
 * }
 * 注意：构造器没有返回类型
 * 构造器能够重载
 * 调用构造器时根据传入参数区分
 * 每一个类都会提供一个默认的无参构造器
 * 当我们在类中定义有参的构造器，程序就不在为我们提供无参构造器
 * 不能使用return进行数据返回
 *
 *
 * this 关键字：当前方法或者构造器的对象
 * 可以放在方法中
 *  构造器中
 *  还可以在构造器中去调用其他的构造器 必须写在第一行
 */
public class Constructor {
    String name;
    int age;
    //无参构造器
    public Constructor(){
        //40行代码
        System.out.println("你好");
    }
    //有参构造器
    public Constructor(String name){
        this();
        this.name=name;
        System.out.println(name);//lucy

    }

    //有参构造器
    public Constructor(String name,int age){
        this("lucy");
        this.name=name;
        this.age=age;
        System.out.println(name);
    System.out.println("姓名："+name+"年龄："+age);

    }

    public void getName(){
        System.out.println(name);
    }
}