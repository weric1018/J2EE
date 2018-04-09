package wl.std.j2ee.bean.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by ynet_test on 2018/4/9.
 */
public class DynamicProxy implements InvocationHandler {

    private  Object subject  ;


    public  DynamicProxy(Object subject){

        this.subject = subject ;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before  method  invoke");

        Object object = method.invoke(subject,args);
        System.out.println("after  method  invoke");

        return  object;
    }
}
