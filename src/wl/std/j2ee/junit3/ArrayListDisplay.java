package wl.std.j2ee.junit3;

import java.util.List;

/**
 * Created by ynet_test on 2018/4/17.
 */
public class ArrayListDisplay {

    public  void  showArrayList(List array) throws Exception {

      if(array == null || array.size()==0){

          throw new Exception("集合不能为空");
      }

      if( ! (array instanceof List)){

          throw new Exception("不是集合对象");
      }

      array.forEach(System.out::println);

    }
}
