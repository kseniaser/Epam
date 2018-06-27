package IOstreams.task4;

import java.io.*;

public class Storing {

    public static byte[] serialization(Object o){
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        try(ObjectOutputStream oos = new ObjectOutputStream(buf)){
            oos.writeObject(o);
        }catch (IOException e){
            e.printStackTrace();
        }
        return buf.toByteArray();
    }

    public static Object deserialization(byte[] buf){
        try(ObjectInputStream oos = new ObjectInputStream(new ByteArrayInputStream(buf))){
            return oos.readObject();
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }


}
