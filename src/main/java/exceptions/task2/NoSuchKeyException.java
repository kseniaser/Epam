package exceptions.task2;

public class NoSuchKeyException extends Exception {
    public NoSuchKeyException(String message) {
        super(message);
    }

    public NoSuchKeyException(String message, Throwable cause) {

        super(message, cause);
    }
}
