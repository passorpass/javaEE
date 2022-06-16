package TCPInet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SeverDemo1 {
    public static void main(String[] args) throws IOException {
       ServerSocket ss = new ServerSocket(1268);

       Socket s = ss.accept();

        InputStream is= s.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        String data = new String(bytes,0,len);
        System.out.println("服务器："+data);
        //给出反馈输出流写数据
        OutputStream os = s.getOutputStream();
        os.write("数据已经接受".getBytes());


        ss.close();

    }
}
