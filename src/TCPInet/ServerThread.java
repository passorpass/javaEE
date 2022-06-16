package TCPInet;

import java.io.*;
import java.net.Socket;

public class ServerThread implements Runnable {
    private Socket s ;
    public ServerThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        //接收数据写到文本文件
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            int count = 0 ;
            File file = new File("E:\\Tcptest["+count+"].txt");
            while (file.exists()){
                count++;
                 file = new File("E:\\Tcptest["+count+"].txt");

            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));

            String line ;
            while((line = br.readLine())!=null){
                bw.write(line);
                bw.newLine();
                bw.flush();
            }

            //给出反馈
            BufferedWriter sw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            sw.write("文件上传成功");
            sw.newLine();
            sw.flush();

            //释放资源
            s.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
