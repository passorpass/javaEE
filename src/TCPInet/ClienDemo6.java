package TCPInet;

import java.io.*;
import java.net.Socket;

public class ClienDemo6 {
    public static void main(String[] args) throws IOException {

        Socket s = new Socket("192.168.10.1", 1269);

      //封装文本文件的内容
        BufferedReader br = new BufferedReader(new FileReader("E:\\Sockettest.txt"));
        //封装输出流写数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while ((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //自定义结束标记
//        bw.write("886");
//        bw.newLine();
//        bw.flush();

        s.shutdownOutput();



        //接收反馈
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(s.getInputStream()));
        String data = bufferedReader.readLine();
        System.out.println("接收的数据是: " + data);


        //释放资源
        br.close();;
        s.close();



    }
}

