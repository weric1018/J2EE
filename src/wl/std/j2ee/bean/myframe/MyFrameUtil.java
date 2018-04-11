package wl.std.j2ee.bean.myframe;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by yunmeng on 2018/4/11.
 */
public class MyFrameUtil {


    public static void run(String className) throws Exception {

        Class classes = Class.forName(className);
        run(classes);
    }

    public static  void run( Class classes ) throws Exception {

       run(classes.newInstance());
    }

    public static void run(Object obj) throws InvocationTargetException, IllegalAccessException {

        Class classes = obj.getClass();
        Method[] methods = classes.getMethods();

        for(Method method : methods){

            method.setAccessible(true);
            if(method.isAnnotationPresent(MTest.class)){
                method.invoke(obj,new Object[]{});
            }

        }


    }
}
