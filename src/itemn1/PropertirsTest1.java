package itemn1;

import java.util.Properties;
import java.util.Set;

public class PropertirsTest1 {
    public static void main(String[] args) {
        Properties prop = new Properties();

        prop.setProperty("itemnt001","zhangsan");
        prop.setProperty("itemnt002","zlitao");
        prop.setProperty("itemnt003","lisi");

        System.out.println(prop.getProperty("itemnt001"));
        System.out.println(prop.getProperty("itemnt0011"));

        Set<String> name = prop.stringPropertyNames();
        for(String key : name) {
            String value = prop.getProperty(key);
            System.out.println(key + " " + value);
        }



        System.out.println(prop);
    }
}
