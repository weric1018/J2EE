package wl.std.j2ee.bean.jdk8;

/**
 * Created by yunmeng on 2018/4/12.
 */
public class JBean {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name ;

    private int age ;

    public static  void getJbean(){
        System.out.println("@@@test@@@");

    }

    public void run(){

        System.out.println("this is running");
    }

}
