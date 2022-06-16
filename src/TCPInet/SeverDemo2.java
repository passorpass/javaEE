package TCPInet;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SeverDemo2 {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(1268);


       //监听客户端的链接，返回一个对应的Socket对象
        Socket s = ss.accept();

        //输出获取的输入流
//        InputStream is = s.getInputStream();
//
//        InputStreamReader isr = new InputStreamReader()；
//
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line ;
        while ((line =br.readLine())!=null){
            System.out.println(line);
        }

        ss.close();




    }
}
