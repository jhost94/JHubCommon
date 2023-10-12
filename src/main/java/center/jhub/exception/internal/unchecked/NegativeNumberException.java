package center.jhub.exception.internal.unchecked;

public class NegativeNumberException extends GenericInternalUncheckedException {

    public NegativeNumberException() {
    }

    public NegativeNumberException(String message) {
        super(message);
    }

    public NegativeNumberException(Number number) {
        this("Invalid negative number: " + number);
    }
}
