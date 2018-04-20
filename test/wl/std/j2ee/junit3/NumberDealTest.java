package wl.std.j2ee.junit3;

import junit.framework.TestCase;
import org.junit.Assert;

/**
 * Created by ynet_test on 2018/4/18.
 */
public class NumberDealTest extends TestCase {
    NumberDeal nb;

    public NumberDealTest(String name ){
        super(name);
    }

    @Override
    protected void setUp() throws Exception {
          nb = new NumberDeal();
    }

    public void testNumberDealByZero(){
      System.out.println("执行单元测试方法！！");
        int a = 1 ;

        Throwable ab ;

        int b = 0 ;
      try {
          nb.deal(a, b);
          Assert.fail();
      }catch(Exception ex){
          ab = ex ;
          Assert.assertEquals(Exception.class,ex.getClass());
          Assert.assertEquals("zero  erro",ex.getMessage());
        }

    }

}