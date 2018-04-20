package wl.std.j2ee.junit3;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * Created by ynet_test on 2018/4/18.
 */
public class NumberDeal {


    public int deal(int a, int b) throws Exception{
        System.out.println("方法执行了！！");

        if(b==0){

            throw new Exception("zero  erro");
        }

        return a/b;
    }
}
