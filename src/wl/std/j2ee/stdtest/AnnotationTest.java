package wl.std.j2ee.stdtest;

import wl.std.j2ee.bean.annotation.MyAnnotation;

import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by ynet_test on 2018/4/9.
 */
@MyAnnotation(value = "12",value1 ="22" )
public class AnnotationTest {

    @Override
    public String toString(){
        return  "wl.std.j2ee.stdtest.MyAnnotation";
    }

    @Deprecated
    public  void getInfo(){

        System.out.println("this is annotation test ");
    }


    @SuppressWarnings({"unckecked", "unchecked"})
    public static void main(String[] args) throws Exception{

        AnnotationTest at  = new AnnotationTest();
        at.getInfo();

        Map map  = new HashMap();
        map.put("wulei","18");

        Class<?> cc =  at.getClass();
        Method method = cc.getMethod("getInfo",null);

        if(method.isAnnotationPresent(MyAnnotation.class)){

            method.invoke(at,null);

        }



    }


}
