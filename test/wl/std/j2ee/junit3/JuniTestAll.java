package wl.std.j2ee.junit3;


import junit.extensions.RepeatedTest;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * Created by ynet_test on 2018/4/18.
 */
public class JuniTestAll  extends TestCase {

      public static Test suite(){
          TestSuite ts = new TestSuite();
          ts.addTestSuite(ArrayListDisplayTest.class);
          ts.addTestSuite(NumberDealTest.class);
          RepeatedTest test = new RepeatedTest(new NumberDealTest("testNumberDealByZero"),2);
          ts.addTest(test);
          return ts;
      }



}
