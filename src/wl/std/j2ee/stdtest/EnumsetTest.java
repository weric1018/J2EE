package wl.std.j2ee.stdtest;


import static wl.std.j2ee.wl.std.j2ee.util.LinePrint.linePrint;


import java.util.EnumSet;

/**
 * Created by ynet_test on 2018/4/4.
 */
public class EnumsetTest {

    enum  Color{
        RED,WHITE,BLACK ;
    }


    public  static  void  main(String [] args){

        Color c = Color.BLACK;
        System.out.println(c);

        for(Color col : Color.values()){
            System.out.println(col);
        }
        linePrint();
        EnumSet<Color> coSet =EnumSet.allOf(Color.class);

        for(Color cols : coSet){
            System.out.println(cols);
        }
        linePrint();
        EnumSet<Color> coSet2 = EnumSet.noneOf(Color.class);

         coSet2.add(Enum.valueOf(Color.class, "RED"));
        coSet2.add(Color.valueOf("BLACK"));

        for(Color col1 : EnumSet.complementOf(coSet2)){
            System.out.println(col1);
        }
        linePrint();
    }
}


