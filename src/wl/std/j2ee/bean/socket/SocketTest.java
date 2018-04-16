package wl.std.j2ee.bean.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by ynet_test on 2018/4/16.
 */
public class SocketTest {


    public static void main(String[] args)throws  Exception{
        System.out.println("--start--");
        Socket so = new Socket("127.0.0.1",5000);

        byte[] bytes ="123".getBytes();

        OutputStream out = so.getOutputStream();

        out.write(bytes);
        so.shutdownOutput(); //关闭输出，以后只能进行输入 ，此方法不关闭SOCKET对象
         byte[] b = new byte[200];
        InputStream in = so.getInputStream();
        int length = 0 ;

        System.out.println("--receive message--");
        while (-1 != (length = in.read(b))){

            System.out.println(new String(b));
        }

        so.close();
        System.out.print("--end--");
    }
}
