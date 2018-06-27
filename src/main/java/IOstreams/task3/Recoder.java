package IOstreams.task3;

import java.io.*;

public class Recoder {

    private File fileInput;
    private File fileOutput;
    private StringBuilder buff;

    public Recoder(String fileInput, String fileOutput) {
        this.fileInput = new File(fileInput);
        this.fileOutput = new File(fileOutput);
        this.buff = new StringBuilder();
        read();
        write();
    }

    private void read(){
        try(BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                    new FileInputStream(fileInput), "UTF-8"))) {
            String string;
            while((string = reader.readLine()) != null) {
                buff.append(string).append("\n");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    private void write(){
        try (BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream(fileOutput), "UTF-16"))){
            writer.write(buff.toString());
        } catch (IOException e){
            e.printStackTrace();
        }
    }


}
