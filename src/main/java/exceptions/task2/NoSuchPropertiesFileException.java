package exceptions.task2;

public class NoSuchPropertiesFileException extends Exception {
    public NoSuchPropertiesFileException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchPropertiesFileException(String message) {
        super(message);
    }
}
