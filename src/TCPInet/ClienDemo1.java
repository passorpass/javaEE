package TCPInet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClienDemo1 {
    public static void main(String[] args) throws IOException {

        Socket s = new Socket("192.168.10.1",1268);

        OutputStream os = s.getOutputStream();
        os.write("hello，tcp，我来了".getBytes());
        //接受反馈  输出流
        InputStream is = s.getInputStream();

        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        String data = new String(bytes,0,len);

        System.out.println("客户端："+data);

//        is.close();
//        os.close();
        s.close();


    }
}
