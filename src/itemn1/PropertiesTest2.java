package itemn1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest2 {
    public static void main(String[] args)  throws IOException{
        //保存文件 将数据
//        myStore();
        myLoad();

    }

    private static void myLoad() throws IOException{
        Properties prop = new Properties();

        FileReader fr = new FileReader("E:\\TEST1.txt");
        prop.load(fr);
        fr.close();
    }

    private static void myStore() throws IOException {
        Properties prop = new Properties();

        prop.setProperty("item001","张三");
        prop.setProperty("item002","4三");
        prop.setProperty("item003","5三");

        FileWriter fw = new FileWriter("E:\\TEST1.txt");

        prop.store(fw,null);
        fw.close();
    }
}
