package wl.std.j2ee.bean.myframe;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by yunmeng on 2018/4/11.
 */
@Target(value= ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface MTest {

    String value() default  "methodTest";
    RunType run() default  RunType.bash;
}


enum  RunType{

    cmd,sh,bash;
}