package TCPInet;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SeverDemo3 {
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
        //把数据写入文本文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\Sockettest.txt"));



        String line ;
        while ((line =br.readLine())!=null){
           bw.write(line);
           bw.newLine();
           bw.flush();
        }
        // 释放资源
        bw.close();
        ss.close();




    }
}
