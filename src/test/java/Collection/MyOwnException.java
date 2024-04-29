package Collection;

public class MyOwnException extends RuntimeException {
    MyOwnException() {
        super("you can not divide by Zero.");
    }

    MyOwnException(String message) {
        super(message);
    }
}
