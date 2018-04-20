package test.wl.std.j2ee.junit4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import wl.std.j2ee.junit3.NumberDeal;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by ynet_test on 2018/4/20.
 */
@RunWith(Parameterized.class)
public class ParamterTest {

    private  int expected ;

    private int input1;

    private int input2;

    private  NumberDeal nb;

    /***
     *
     * 构建测试数据集合，三个参数，{ 期望值，操作数1，操作数2 }
     * @return
     */
   @Parameterized.Parameters
    public static Collection date(){
        Object[][] obj = new Object[][]{{2,2,1},{6,30,5},{4,8,2}};
         return Arrays.asList(obj);
    }

    public ParamterTest(int expected ,int input1 ,int input2){

        this.expected = expected;
        this.input1 = input1 ;
        this.input2 = input2 ;
    }
    @Before
    public void setup (){
        nb = new NumberDeal();

    }

   @Test
    public void test() throws Exception {

        Assert.assertEquals(this.expected,nb.deal(this.input1,this.input2));
    }

}
