package wl.std.j2ee.bean.numberDeal;

/**
 * Created by yunmeng on 2018/4/11.
 */
public class NumberDeal {



    public boolean numberCheck(String string){

        try{


            int number = Integer.valueOf(string);

        }catch (NumberFormatException e ){
            System.out.println("输入有误，请重新输入！");
            return false;
        }
        return true;
    }





}
