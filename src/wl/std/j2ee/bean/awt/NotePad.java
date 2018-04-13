package wl.std.j2ee.bean.awt;

import com.sun.javaws.jnl.EmbeddedJNLPValidation;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
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

        bt.addActionListener(ActionEvent::getActionCommand);

        fm.add(bt,BorderLayout.CENTER);

        fm.addWindowListener(new MyWindowListener());

        fm.setVisible(true);

    }
}

class MyWindowListener implements  WindowListener{

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("关闭");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {


    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
