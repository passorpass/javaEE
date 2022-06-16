package InetAddress;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class SendDemo {
    public static void main(String[] args) throws IOException {

        DatagramSocket ds = new DatagramSocket();

//    //UDP发送数据
//        byte[] bytes = "hello,udp,我来了".getBytes();
////        int length = bytes.length;
////        InetAddress address = InetAddress.getByName("192.168.10.1");
////        int port = 10086;
////        DatagramPacket dp = new DatagramPacket(bytes,length,address,port);
//
//        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,InetAddress.getByName("192.168" +
//                ".10.1"),10086);
//
//
//
//        ds.send(dp);
//
//        ds.close();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String  line;
        while ((line = br.readLine()) != null){
            if("886".equals(line)){
                break;
            }
            byte[] bytes = line.getBytes();
            DatagramPacket dp = new DatagramPacket(bytes,bytes.length,InetAddress.getByName("192" +
                    ".168.10.1"),12345);

            ds.send(dp);

        }
        ds.close();
    }
}