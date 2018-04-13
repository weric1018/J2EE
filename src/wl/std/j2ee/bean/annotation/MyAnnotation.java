package wl.std.j2ee.bean.annotation;

/**
 * Created by ynet_test on 2018/4/9.
 */

import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.FIELD})
@Documented
@Inherited
@Retention(value = RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

    String value();
    String value1();
}
