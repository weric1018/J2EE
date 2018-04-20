package wl.std.j2ee.junit3;

import junit.framework.TestCase;
import org.junit.Assert;

import java.util.ArrayList;

/**
 * Created by ynet_test on 2018/4/17.
 */
public class ArrayListDisplayTest extends TestCase {
    ArrayListDisplay ad;
    @Override
    protected void setUp() throws Exception {
     ad   = new ArrayListDisplay();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testShowArrayListByNull()  {
        Throwable ab ;
        try {
            ad.showArrayList(null);
            Assert.fail();//正常应该抛出异常，如果走到此，则测试代码有问题
        } catch (Exception ex) {
           ab = ex  ;
           Assert.assertEquals(Exception.class,ab.getClass());
           Assert.assertEquals("集合不能为空",ab.getMessage());
        }

    }


    public void testShowArrayListBySizeZero()  {
        Throwable ab ;
         ArrayList ay = new ArrayList();
        try {
            ad.showArrayList(ay);
            Assert.fail();//正常应该抛出异常，如果走到此，则测试代码有问题
        } catch (Exception ex) {
            ab = ex  ;
            Assert.assertEquals(Exception.class,ab.getClass());
            Assert.assertEquals("集合不能为空",ab.getMessage());
        }

    }

       public void testShowArrayList() {
           ArrayList ay = new ArrayList();
           ay.add("1");
           try {
               ad.showArrayList(ay);
           } catch (Exception ex) {
               Assert.fail();//正常应该抛出异常，如果走到此，则测试代码有问题
           }
       }


       public static  void main(String[] args){

           junit.textui.TestRunner.run(ArrayListDisplayTest.class);//junit 文本界面，可以集成到后期程序中进行调用
       }




}