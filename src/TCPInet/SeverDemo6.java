package TCPInet;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SeverDemo6 {
    public static void main(String[] args) throws IOException {

       //创建服务器Socket对象
        ServerSocket ss = new ServerSocket(1269);

        //监听客户端的链接
        while (true) {
            Socket s = ss.accept();

            //为给一个客户开启一个线程
            new Thread(new ServerThread(s)).start();

        }

    }
}
