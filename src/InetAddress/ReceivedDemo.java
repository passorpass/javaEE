package InetAddress;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceivedDemo {
    public static void main(String[] args) throws IOException {

        //UDP接受数据
//        DatagramSocket datagramSocket = new DatagramSocket(10086);
//
//        byte[] bytes = new byte[1024];
//        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
//
//
//        datagramSocket.receive(dp);
//
//        //解析数据包
//
//        byte[] bytes1 = dp.getData();
//
//        //去除空字符串
//        int len = dp.getLength();
//
//
////        String dataString = new String(bytes1,0,len);
////        System.out.println("数据是"+ dataString);
//        //简化
//        System.out.println("数据是"+ new String(dp.getData(),0,dp.getLength()));
//
//        //关闭数据接受端
//        datagramSocket.close();

        //创建对象
        DatagramSocket ds = new DatagramSocket(12345);

        while(true) {
            //接受数据
            byte[] bytes = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);

            ds.receive(datagramPacket);

            //解析数据
            System.out.println("数据是:" + new String(datagramPacket.getData(), 0,
                    datagramPacket.getLength()));
        }


    }
}
