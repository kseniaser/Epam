package string.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.ResourceBundle;

public class InfoDisplayer {

    private String language;
    private ResourceBundle bundle;


    public InfoDisplayer(){
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Choose language RU | EN");
            language = reader.readLine();
            if (language.equals("RU") || language.equals("ru"))
                chooseRu(reader);
            if (language.equals("EN") || language.equals("en"))
                chooseEn(reader);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private void chooseEn(BufferedReader reader) throws IOException {
        bundle = ResourceBundle.getBundle("prop", new Locale("en"));
        System.out.println("Write the number of question or \"stop\" to close the program.");
        System.out.println("Attention! The numbers of question are from 1 to 6.");
        String command = reader.readLine();
        while (!command.equals("stop")) {
            System.out.println(bundle.getString(command));
            command = reader.readLine();
        }
    }

    private void chooseRu(BufferedReader reader) throws IOException {
        bundle = ResourceBundle.getBundle("prop", new Locale("ru"));
        System.out.println("Введите номер вопроса или \"стоп\" для закрытия программы.");
        System.out.println("Внимание! Номера вопросов от 1 до 6.");
        String command = reader.readLine();
        while (!command.equals("stop")) {
            System.out.println(bundle.getString(command));
            command = reader.readLine();
        }
    }
}
