package string.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArticalParser {

    private Path pathToFile = Paths.get("E:\\Git\\java\\Epam\\src\\main\\java\\string\\task3\\article.html");

    private static final String imageReference = ".+[^Рис]\\.\\s(.+(([(][Рр]ис\\.)|([Рр]исун)).+[^Рис]\\.)\\s";
    private Pattern patternImageReference;
    private StringBuilder seqImageReference;

    private static final String imageNumber = "[Рр]ис\\.\\s(\\d+)";
    private Pattern patternImageNumber;
    private List<String> order;

    public ArticalParser() {
        patternImageReference = Pattern.compile(imageReference);
        patternImageNumber = Pattern.compile(imageNumber);
        seqImageReference = new StringBuilder();
        order = new ArrayList<>();
    }

    public void parse() {
        try (BufferedReader br = Files.newBufferedReader(pathToFile, Charset.forName("windows-1251"))) {
            Matcher matcher;
            String line = br.readLine();
            while (line != null) {
                matcher = patternImageReference.matcher(line);
                if (matcher.find()) {
                    seqImageReference.append(matcher.group(1)).append("\n");
                    matcher = patternImageNumber.matcher(line);
                    while (matcher.find()) order.add(matcher.group(1));
                }
                line=br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(order);
    }

    public String getSentences() {
        return seqImageReference.toString();
    }

    public boolean isRightOrder() {
        String prev;
        String a = order.get(0);
        for (String s : order){
            if (a.compareToIgnoreCase(s) == 1) return  false;
            a = s;
        }
        return true;
    }

}
