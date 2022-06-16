package TCPInet;

import java.io.*;
import java.net.Socket;

public class ClienDemo3 {
    public static void main(String[] args) throws IOException {

        Socket s = new Socket("192.168.10.1", 1268);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //封装输出流对象
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            if ("886".equals(line)) {
                break;
            }

//        OutputStream os = s.getOutputStream();
            bw.write(line);
            bw.newLine();
            bw.flush();


        }
        //释放资源
        s.close();

    }
}

