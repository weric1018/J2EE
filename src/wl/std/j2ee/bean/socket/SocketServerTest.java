package wl.std.j2ee.bean.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by ynet_test on 2018/4/16.
 */
public class SocketServerTest {


    public static void main(String[] args) throws  Exception{
        System.out.println("--start--");
        ServerSocket ss = new ServerSocket(5000);

        Socket so = ss.accept();

        byte[] bytes  = new byte[200];

        InputStream in = so.getInputStream();
        int length = 0 ;
        //只有当客户端关闭它的输出流的时候，服务端才能取得结尾的-1
        while (-1 != (length = in.read(bytes))){
            System.out.println(new String(bytes));
        }

        System.out.println("--send message--");
        OutputStream out = so.getOutputStream();
        byte [] b = "while".getBytes();
        out.write(b);
        so.shutdownOutput();

         in.close();
         so.close();
         ss.close();

         System.out.println("--end--");
    }
}
