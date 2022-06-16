package InetAddress;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.IntArrayData;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddreadDemo {
    public static void main(String[] args) throws UnknownHostException {
//        InetAddress address = InetAddress.getByName("LAPTOP-C5A3BKBE");
        InetAddress address = InetAddress.getByName("192.168.10.1");
        String name = address.getHostName();
        String ip = address.getHostAddress();
        System.out.println("主机名"+name);
        System.out.println("ip地址"+ip);
    }
}
