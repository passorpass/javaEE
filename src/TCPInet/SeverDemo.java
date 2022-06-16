package TCPInet;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SeverDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器
        ServerSocket ss = new ServerSocket(1258);

        //侦听链接并接受
        Socket s = ss.accept();

        //字节输入流
        InputStream is = s.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        String data = new String(bytes,0,len);
        System.out.println("数据是: "+data);

        //  释放资源
        s.close();
        ss.close();

    }
}
