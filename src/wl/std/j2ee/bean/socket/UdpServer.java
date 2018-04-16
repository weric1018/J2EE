package wl.std.j2ee.bean.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by ynet_test on 2018/4/16.
 */
public class UdpServer {


    public static void main(String[] args) throws  Exception{
        DatagramSocket ds = new DatagramSocket(1000);

        byte[] bytes = new byte[1024];

        DatagramPacket pack = new DatagramPacket(bytes,1024);

        ds.receive(pack);

        System.out.print(new String(bytes,0,pack.getLength()));

        String message = "this is a upd test";

        byte [] bb = message.getBytes("UTF-8");

        DatagramPacket pack2 = new DatagramPacket(bb,bb.length,pack.getAddress(),pack.getPort());

        ds.send(pack2);


    }
}
