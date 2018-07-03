package Multithreading.task2;

import Exceptions.task2.NoSuchKeyException;
import Exceptions.task2.NoSuchPropertiesFileException;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.ResourceBundle;
import java.util.concurrent.ConcurrentHashMap;

public class PropertiesFileManager {

    private ResourceBundle properties;
    private ConcurrentHashMap<String,String> propertiesMap;

    public PropertiesFileManager(String propFileName) throws NoSuchPropertiesFileException {
        try {
            this.properties = ResourceBundle.getBundle(propFileName);
            this.propertiesMap =new ConcurrentHashMap<>();
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
