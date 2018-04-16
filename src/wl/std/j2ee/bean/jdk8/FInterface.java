package wl.std.j2ee.bean.jdk8;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Created by yunmeng on 2018/4/12.
 */
@FunctionalInterface
public interface FInterface<T> {

    public T get();

    default public void state(){

        System.out.println("this is default interface method");
    };

    static  String dealMessage(String message){

        return message;
    }
}
