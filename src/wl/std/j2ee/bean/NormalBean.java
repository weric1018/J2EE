package wl.std.j2ee.bean;

/**
 * Created by ynet_test on 2018/4/8.
 */
public class NormalBean {

    private  int age ;

    private  String name ;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return this.getName() + ":" + this.getAge();
    }
}
