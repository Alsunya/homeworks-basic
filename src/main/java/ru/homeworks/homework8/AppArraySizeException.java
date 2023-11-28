package src.main.java.ru.homeworks.homework8;

public class AppArraySizeException extends IllegalArgumentException{

    public AppArraySizeException() {
    }

    public AppArraySizeException(String s) {
        super(s);
    }

    public AppArraySizeException(String message, Throwable cause) {
        super(message, cause);
    }

    public AppArraySizeException(Throwable cause) {
        super(cause);
    }
}
