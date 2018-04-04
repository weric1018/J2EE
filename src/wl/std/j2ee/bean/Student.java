package wl.std.j2ee.bean;

/**
 * Created by ynet_test on 2018/4/4.
 */
public class Student {

    public  int  age  ;

    private  String name  ;

    public static  int id ;
    public Student(int age ,String name){
        this.age = age;
        this.name = name ;
    }

    private  void sayHi(String mobile ,String mess){

        System.out.print(mobile +":"+ mess );
    }

    public  void  getInfo(){

        System.out.print(name +":"+ age );
    }

}
