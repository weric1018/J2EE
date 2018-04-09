package wl.std.j2ee.wl.std.j2ee.util;

import wl.std.j2ee.bean.NormalBean;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 类反射工具类，可以通过已有对象克隆新的对象,Integer.class -> Integer ; Integer.type -> int
 * Created by ynet_test on 2018/4/8.
 */
public class ClassReflectUtil<T> {

    public static <T> T getClone( T element) throws Exception{

        T  cloneObj = null  ;

        Class classType = element.getClass();

        cloneObj = (T)classType.newInstance();

        Field[] fields = classType.getDeclaredFields();
        for(Field field :fields){
               field.setAccessible(true);

              Method getMethod =  classType.getDeclaredMethod("get"+field.getName().substring(0,1).toUpperCase()+field.getName().substring(1),null);
              Method setMethod  = classType.getDeclaredMethod("set"+field.getName().substring(0,1).toUpperCase()+field.getName().substring(1),field.getType());

               Object obj = getMethod.invoke(element,null);
               setMethod.invoke(cloneObj,obj);
               System.out.println(field);
        }

        return  cloneObj;


    }

      public static  void main (String [] args) throws  Exception{

          ClassReflectUtil<NormalBean> cu  = new ClassReflectUtil<NormalBean>();
          NormalBean normalBean = new NormalBean();
          normalBean.setAge(18);
          normalBean.setName("wulei");

         System.out.println( cu.getClone(normalBean));
      }


}
