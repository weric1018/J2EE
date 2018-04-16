package wl.std.j2ee.bean.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * Created by yunmeng on 2018/4/12.
 */
public class LambdaTest {

    public static void main(String[]args){


        List<JBean> list = new ArrayList<JBean>();

        JBean jBean = new JBean();

        list.add(jBean);


        list.forEach(JBean::run);

        Supplier<JBean> supplier = JBean::new;

        FInterface<JBean> jbean = JBean::new;

        FInterface<JBean> jbeans = ()-> new JBean();

       System.out.println( FInterface.dealMessage("123"));

    }

}
