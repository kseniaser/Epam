package intro.task6;

/**
 * The Note class represents a single note in NoteBook.
 *
 * @autor Serafimova Ksenia
 */
public class Note {

    private String name;
    private String content;

    /**
     * Creates a new Note.
     *
     * @param name     String providing the exclusive name of note.
     * @param content  String providing the content of note.
     */
    public Note(String name, String content) {
        this.name = name;
        this.content = content;
    }

    /**
     * Creates a new Note.
     *
     * @param name  String providing the exclusive name of note.
     */
    public Note(String name) {
        this.name = name;
        this.content = "";
    }

    /**
     * @return name of note.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets new content
     *
     * @param content  String providing new content of note.
     */
    public Note setContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * Prints the name and content of Note.
     *
     */
    public void printNote() {
        System.out.print("NAME: " + name + "     CONTENT: " + content + "\n");
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return name.equals(obj);
    }
}