package center.jhub.exception.internal.unchecked;

public abstract class GenericInternalUncheckedException extends RuntimeException {
    public GenericInternalUncheckedException() {
    }

    public GenericInternalUncheckedException(String message) {
        super(message);
    }

    public GenericInternalUncheckedException(String message, Throwable cause) {
        super(message, cause);
    }

    public GenericInternalUncheckedException(Throwable cause) {
        super(cause);
    }
}
