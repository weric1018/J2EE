package wl.std.j2ee.bean.awt;

import com.sun.javaws.jnl.EmbeddedJNLPValidation;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ynet_test on 2018/4/11.
 */
public class NotePad {



    public static  void main(String [] args){
        Frame fm = new Frame("this is a frame ");

        fm.setLocation(600,100 );
        fm.setSize(500,300);

        fm.setBackground(Color.blue);

        Button  bt = new Button("press me ！");

        bt.addActionListener( (ActionEvent e)->{
           // System.out.println("button is press ");
        });
        fm.add(bt,BorderLayout.CENTER);

        fm.setVisible(true);

    



    }
}
