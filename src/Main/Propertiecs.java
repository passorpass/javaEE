package Main;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Propertiecs {
    public static void main(String[] args) throws IOException {
        //集合记录
        Properties prop = new Properties();

        FileReader fr = new FileReader("E:\\TEST1.txt");
        prop.load(fr);
        fr.close();

        String count = prop.getProperty("count");
        int number = Integer.parseInt(count);

        //判断
        if(number >= 3 ){
            System.out.println("游戏已经结束了，请充值");
        }else {
            Game.start();

            number++;

            prop.setProperty("count",String.valueOf(number));

            FileWriter fw = new FileWriter("E:\\TEST1.txt");
            prop.store(fw,null);
            fw.close();
        }
    }
}
