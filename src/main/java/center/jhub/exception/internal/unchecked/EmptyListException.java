package center.jhub.exception.internal.unchecked;

public class EmptyListException extends GenericInternalUncheckedException {
    public EmptyListException(String message) {
        super(message);
    }

    public EmptyListException() {
        this("Empty list");
    }
}
