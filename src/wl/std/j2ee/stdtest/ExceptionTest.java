package wl.std.j2ee.stdtest;

import wl.std.j2ee.bean.exception.MyException;

/**
 * Created by ynet_test on 2018/4/10.
 */
public class ExceptionTest {


    public  void testException(String name) throws Exception {

        if( null == name){

            throw new Exception();
        }
        
    }


    public static  void main(String [] args) {

       if(args.length==0){
           return ;
       }
      try {
          System.out.println("hollo word");

          //throw  new NullPointerException();
          throw  new MyException("this is exception test");
      }catch (MyException e){
          e.printStackTrace();
      }finally {
          System.out.println("执行finally 方法");
      }

    }
}
