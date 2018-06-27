package OOP.task3_4.heirarchy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NoteBook extends Storage {

    private List<Paper> noteBook;
    private String name = "NoteBook";

    public final String name() {
        return name;
    }

    public final double price() {
        double sum = 0;
        for (Paper paper : noteBook) {
            sum += paper.price();
        }
        return sum;
    }

    public NoteBook() {
        noteBook = new ArrayList<>();
        noteBook.add(new Paper());
    }

    public NoteBook(List<Paper> noteBook) {
        this.noteBook = noteBook;
    }

    private boolean canEqual(Object other) {
        return other instanceof Stationary;
    }

    @Override
    public boolean equals(Object o) {
        final NoteBook noteBook;
        return o == this
                || o instanceof NoteBook
                && (noteBook = (NoteBook) o).canEqual(this)
                && Double.compare(this.price(), price()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price());
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                noteBook +
                '}';
    }
}
