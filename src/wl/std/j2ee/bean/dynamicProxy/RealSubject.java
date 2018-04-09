package wl.std.j2ee.bean.dynamicProxy;

/**
 * Created by ynet_test on 2018/4/9.
 */
public class RealSubject implements  Subject{

    @Override
    public String sayNo() {
        return  "No";
    }

    @Override
    public void sayHi(String words) {
        System.out.println(words);
    }
}
