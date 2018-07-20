package exceptions.task2;

import java.util.*;

public class PropertiesFileManager {

    private ResourceBundle properties;
    private HashMap<String,String> propertiesMap;

    public PropertiesFileManager(String propFileName) throws NoSuchPropertiesFileException {
        try {
            this.properties = ResourceBundle.getBundle(propFileName);
            this.propertiesMap =new HashMap<>();
            toMap();
        } catch (Exception e){
            throw new NoSuchPropertiesFileException("no such file", e);
        }
    }

    private void toMap (){
        Enumeration keys = properties.getKeys();
            while (keys.hasMoreElements()){
                String key = (String) keys.nextElement();
                propertiesMap.put(key,properties.getString(key));
            }
    }

    public void read(String key) throws NoSuchKeyException {
        if (!propertiesMap.containsKey(key))
            throw new NoSuchKeyException("no such key");
        System.out.println(propertiesMap.get(key));

    }
}
