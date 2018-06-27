package intro.task6;

/**
 * The NoteBook class represents set of notes.
 * The names of notes are exclusive.
 *
 * @autor Serafimova Ksenia
 */
public class NoteBook {
    private Note[] notes;
    private int index;

    /**
     * Creates a new NoteBook.
     *
     * @param size     String providing the size of NoteBook.
     */
    public NoteBook(int size) {
        this.notes = new Note[size];
        this.index = 0;
    }

    /**
     * Checks name for exclusivity in NoteBook
     *
     * @param name   String providing the name of Note.
     */
    private boolean ableToAdd(String name) {
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] != null && notes[i].equals(name)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks NoteBook for overflow.
     *
     */
    private boolean checkIndex() {
        if (index < notes.length) {
            return true;
        } else {
            System.out.print("NO MEMORY");
            return false;
        }
    }

    /**
     * Adds Note to NoteBook.
     * If the Note with the same name already exists, then overwrites the content of Note.
     *
     * @param name       String providing the exclusive name of Note to add.
     * @param contetnt   String providing the content of Note.
     */
    public void addNote(String name, String contetnt) {
        if (!ableToAdd(name)) {
            changeNote(name, contetnt);
            return;
        }
        if (checkIndex()) {
            notes[index] = new Note(name, contetnt);
            index++;
        }

    }

    /**
     * Adds Note to NoteBook with no content.
     *
     * @param name   String providing the exclusive name of Note to add.
     */
    public void addNote(String name) {
        if (!ableToAdd(name)) {
            return;
        }
        if (checkIndex()) {
            notes[index] = new Note(name);
            index++;
        }
    }


    /**
     * Deletes Note with @param name from NoteBook.
     *
     * @param name   String providing the name of Note to delete.
     */
    public void deleteNote(String name) {
        int param = 0;
        for (int i = 0; i < notes.length; i++) {
            if (notes[i].equals(name)) {
                param = i;
                break;
            }
        }
        for (int i = param + 1; i < notes.length; i++) {
            notes[i - 1] = notes[i];
        }
        index--;
    }


    /**
     * Changes the content of Note with @param name in NoteBook.
     *
     * @param name      String providing the name of Note to change.
     * @param content   String providing the content of Note.
     */
    public void changeNote(String name, String content) {
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] != null && notes[i].equals(name)) {
                notes[i].setContent(content);
            }
        }
    }

    /**
     * Prints all notes in NoteBook
     *
     */
    public void printAllNotes() {
        for (Note param : notes) {
            if (param != null) {
                param.printNote();
            }
        }
    }
}