package string.task1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class CrazyLogger {

    private StringBuilder trace;

    public CrazyLogger(){
        trace = new StringBuilder();
        trace.append(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy : HH-mm - ")))
                .append("CrazyLogger created").append("\n");
    }

    public void putMessage (String message){
        trace.append(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy : HH-mm - ")))
                .append(message).append("\n");
    }

    @Override
    public String toString() {
        return trace.toString();
    }

    public void closeLogger (){
        trace = null;
    }

    public String findByString(String string){
        String[] strings = trace.toString().split("\n");
        StringJoiner joiner = new StringJoiner("\n");
        for (String s : strings)
            if (s.contains(string))
                joiner.add(s);
        return joiner.toString();
    }

    public String findByDate(LocalDate date){
        return Arrays.stream(trace.toString().split("\n"))
                .filter(s -> s.contains(date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))))
                .collect(Collectors.joining("\n"));
    }

    public String findByTime(LocalTime time){
        return Arrays.stream(trace.toString().split("\n"))
                .filter(s -> s.contains(time.format(DateTimeFormatter.ofPattern("HH-mm"))))
                .collect(Collectors.joining("\n"));
    }

}
