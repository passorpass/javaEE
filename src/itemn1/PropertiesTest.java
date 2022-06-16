package itemn1;

import java.util.Properties;
import java.util.Set;

public class PropertiesTest {
    public static void main(String[] args) {
        Properties properties = new Properties();

        properties.put("itemmin001","张三");
        properties.put("itemmin002","李三");
        properties.put("itemmin003","涛三");

        //遍历
        Set<Object> keySet = properties.keySet();

        for(Object key : keySet){
            Object value = properties.get(key);
            System.out.println(key+" "+value);
        }

    }
}
