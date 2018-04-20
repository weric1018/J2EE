package test.wl.std.j2ee;

import junit.framework.TestCase;
import org.junit.Assert;

/**
 * Created by ynet_test on 2018/4/17.
 */
public class ClassReflectUtilTest extends TestCase {

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }


    public void testAdd(){

        System.out.println(2.0==2.0);

   //     Assert.fail();

       Assert.assertNotEquals(2.0+1,2.0);

    }

}