package OOP.task3_4;

import OOP.task3_4.heirarchy.BegginnerSet;
import OOP.task3_4.heirarchy.NoteBook;
import OOP.task3_4.heirarchy.Paper;
import OOP.task3_4.heirarchy.Pen;
import OOP.task3_4.heirarchy.enums.Color;
import OOP.task3_4.heirarchy.enums.Format;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pen pen = new Pen();
        Paper paper = new Paper();
        Paper paper1 = new Paper(Format.A4, 10.0, Color.WHITE);
        Paper paper2 = new Paper(Format.A4, 13.0, Color.WHITE);

        List<Paper> noteBook = new ArrayList<>();
        noteBook.add(new Paper(Format.A3, 106.78, Color.RED));
        NoteBook nb = new NoteBook(noteBook);

        BegginnerSet begginnerSet = new BegginnerSet();
        begginnerSet.add(nb);
        begginnerSet.add(paper1);

        begginnerSet.sort();

        System.out.println(begginnerSet);


    }

}
