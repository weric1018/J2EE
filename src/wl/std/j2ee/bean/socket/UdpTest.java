package wl.std.j2ee.bean.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by ynet_test on 2018/4/16.
 */
public class UdpTest {



    public static void main(String[] args) throws  Exception{
        DatagramSocket ds = new DatagramSocket();

       String message ="send message  test";

        byte [] bb = message.getBytes("UTF-8");

        DatagramPacket pack = new DatagramPacket(bb,bb.length, InetAddress.getByName("localhost"),1000);

        ds.send(pack);

       byte [] bytes = new byte[1024];

       DatagramPacket pack2 = new DatagramPacket(bytes,1024);

       ds.receive(pack2);

       System.out.println(new String(bytes,0,pack2.getLength()));

    }
}
