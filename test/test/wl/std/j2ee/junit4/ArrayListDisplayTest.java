package test.wl.std.j2ee.junit4;

import org.junit.*;
import org.junit.rules.Timeout;
import wl.std.j2ee.junit3.NumberDeal;

import static org.junit.Assert.*;

/**
 * Created by ynet_test on 2018/4/19.
 */
public class ArrayListDisplayTest {
    @BeforeClass   //该注解只执行一次，必须是静态的
    public static void init(){

        System.out.println("初始化");
    }

    NumberDeal nb ;
    @Before    //该注解等于junit3里的setup ,每个方法执行前执行一次
    public void setUp() throws Exception {
        nb = new NumberDeal();
    }

    @Test(expected = Exception.class,timeout = 200)
    public void testNumberDealByZero() throws Exception {
        System.out.println("执行单元测试方法！！");
        int a = 1;
        Throwable ab;
        int b = 0;
        nb.deal(a, b);

    }

    @Ignore(value = "忽略此测试")
    @Test(expected = Exception.class,timeout = 200)
    public void testNumberDealByZero1() throws Exception {
        System.out.println("执行单元测试方法！！");
        int a = 1;
        Throwable ab;
        int b = 0;
        nb.deal(a, b);

    }

}