package wl.std.j2ee.bean.myframe;

/**
 * Created by yunmeng on 2018/4/11.
 */
public class MyFramUtilTest {


    public static  void main(String[] args) throws Exception {

        MyFrameUtil.run("wl.std.j2ee.bean.myframe.Mytest");

        Mytest mytest = new Mytest();

        MyFrameUtil.run(mytest);


    }

}
