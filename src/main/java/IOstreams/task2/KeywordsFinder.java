package IOstreams.task2;

import java.io.*;
import java.util.*;

public class KeywordsFinder {

    private File fileInput;
    private File fileOutput;
    private List<Pair> keyWords;

    public KeywordsFinder(String file) {
        this.fileInput = new File(file);
        keyWords = new ArrayList<>() {{
            add(new Pair("static"));
            add(new Pair("private"));
            add(new Pair("public"));
            add(new Pair("class"));
            add(new Pair("void"));
            add(new Pair("new"));
            add(new Pair("throws"));
            add(new Pair("implements"));
            add(new Pair("extends"));
        }};
    }

    public void addKeywords (String ... strings){
        for(String s:strings)
            keyWords.add(new Pair(s));
    }

    public void isJava(){
        String[] text = toStringArray();
        int count=0;
        for (Pair pair : keyWords){
            count=0;
            for (String string: text){
                if (string.equals(pair.getKeyword()))
                    count++;
            }
            pair.setNumber(count);
        }
    }

    private String[] toStringArray (){
        try(BufferedReader reader = new BufferedReader(new FileReader(fileInput))){
            StringBuilder buff = new StringBuilder();
            String string;
            while((string = reader.readLine()) != null) {
                buff.append(string);
            }
            return buff.toString().split("(\\s+)|(\\n+)");
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return null;
    }

    public void write(String file){
        this.fileOutput = new File(file);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileOutput))){
            writer.write(keyWords.toString());
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private class Pair {

        private int number;
        private String keyword;

        Pair(int number, String keyword){
            this.keyword = keyword;
            this.number = number;
        }

        Pair(String keyword){
            this.keyword = keyword;
        }

        private int getNumber() {
            return number;
        }

        private void setNumber(int number) {
            this.number = number;
        }

        private String getKeyword() {
            return keyword;
        }

        @Override
        public String toString() {
            return  "\n" + number +
                    "-" + keyword;
        }
    }


}
