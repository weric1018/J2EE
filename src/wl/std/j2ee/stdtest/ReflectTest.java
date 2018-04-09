package wl.std.j2ee.stdtest;

import wl.std.j2ee.bean.Student;
import wl.std.j2ee.wl.std.j2ee.util.LinePrint;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static wl.std.j2ee.wl.std.j2ee.util.ColletcionPrint.getCollPrint;

/**
 * Created by ynet_test on 2018/4/4.
 */
public class ReflectTest {

    /**
     * 获取Class的方式有三种 ， 1. Class.forName()  2.Type.class  3.对象.getClass();
     * @param args
     */
    public  static  void main(String [] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {

      Student student = new Student(18,"John");
        Class ca = student.getClass();
       showMessage(ca);

        ca = Class.forName("wl.std.j2ee.bean.Student");
        showMessage(ca);

        ca = Student.class;
        showMessage(ca);

        Class ct = Student.class;

         Method md = ct.getMethod("getInfo", new Class[]{});
         md.invoke(student,new Object[]{});


          Method md1 = ct.getDeclaredMethod("sayHi", new Class[]{String.class,String.class});//private method  used  getDeclaredMethod
          md1.setAccessible(true); //private  method
          md1.invoke(student,new Object[]{"15098676677","send  some  message !"});

           LinePrint.linePrint();
           Constructor[] cst =  ct.getConstructors();
           getCollPrint(cst);
           Constructor cst1 = ct.getDeclaredConstructor(int.class,String.class);
           cst1.setAccessible(true);
           Student  std1 = (Student) cst1.newInstance(new Object[]{19,"李磊"});
           LinePrint.linePrint();
           std1.getInfo();




    }

    public static void  showMessage(Class ca){

        Method[] mts =   ca.getDeclaredMethods();
        Field[] fields = ca.getFields();//不包含私有成员
        Field[] fieldSet = ca.getDeclaredFields();//包含私有成员
        getCollPrint(mts);
        LinePrint.linePrint();
        getCollPrint(fields);
        LinePrint.linePrint();
        getCollPrint(fieldSet);


    }

}
