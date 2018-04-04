package wl.std.j2ee.wl.std.j2ee.util;

/**
 * Created by ynet_test on 2018/4/4.
 */
public class ColletcionPrint<E> {

    /**
     * Static 声明泛型，必须用static<T> 这种方式
     * @param arrays
     * @param <E>
     */
    public static<E> void getCollPrint( E [] arrays){

        for( E element : arrays){

            System.out.println(element);

        }
    }


}
