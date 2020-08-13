package Day0813;

public class UserTest {
    public static void main(String[] args) {
        User u1 = new User(1,"qh",'男',20,177,"96@qq.com");
        UserService us = new UserService(u1,10);
    }
}
