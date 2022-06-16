package TCPInet;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClienDemo {
    public static void main(String[] args) throws IOException {
        //创建socket的类
        Socket  s = new Socket(InetAddress.getByName("192.168.10.1"),1258);

        //输出流，写数据
        OutputStream os = s.getOutputStream();
        os.write("hello tcp,我来了".getBytes());

        s.close();



    }
}
