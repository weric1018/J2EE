package wl.std.j2ee.bean.contest;

import jdk.internal.util.xml.impl.Input;
import wl.std.j2ee.wl.std.j2ee.util.ColletcionPrint;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by ynet_test on 2018/4/11.
 */
public class NumberToChinese {

    Integer[] arry = new Integer[8];

    Map<Integer,String> map = new HashMap<Integer,String>();

   public  NumberToChinese(){
       map.put(0,"千");
       map.put(1,"百");
       map.put(2,"十");
       map.put(3,"万");
       map.put(4,"千");
       map.put(5,"百");
       map.put(6,"十");
       map.put(7,"");
    }

    public  void  checkNumber(String ss){
       try {
           int result = Integer.valueOf(ss);

       }catch (NumberFormatException e){
           System.out.print("输入参数有误,请重新输入！");
       }
    }

    public void toChinese(String ss){
        char[] chars = ss.toCharArray();
       for(int i = arry.length-1 ; i>=0 ; i --){

           for(int j = chars.length-1 ;j >=0 ; j -- ){
               int s = chars[j]-'0';
              // System.out.println(chars[j]+"->"+s);
               if(s!=0 ){
                   arry[i]= s;
               }
           }

       }
       ColletcionPrint.getCollPrint(arry);
    }


    public static  void main(String [] args ){

        NumberToChinese  nc = new NumberToChinese();

        String input = "11000";

        nc.checkNumber(input);

        nc.toChinese(input);


    }



}
