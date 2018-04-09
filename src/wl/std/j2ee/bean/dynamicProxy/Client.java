package wl.std.j2ee.bean.dynamicProxy;

import wl.std.j2ee.wl.std.j2ee.util.LinePrint;

import java.lang.reflect.Proxy;

/**
 * Created by ynet_test on 2018/4/9.
 */
public class Client {

    public static void  main(String[] args){
        RealSubject  sub= new RealSubject();
        DynamicProxy dynamicProxy = new DynamicProxy(sub);
        Class<?> classType = dynamicProxy.getClass();
        Subject subProxy = (Subject) Proxy.newProxyInstance(classType.getClassLoader(),sub.getClass().getInterfaces(),dynamicProxy);

        subProxy.sayHi("hello world");

        LinePrint.linePrint();

        subProxy.sayNo();


    }
}
