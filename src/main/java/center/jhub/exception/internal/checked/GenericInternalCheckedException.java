package center.jhub.exception.internal.checked;

public abstract class GenericInternalCheckedException extends Exception {

    public GenericInternalCheckedException() {
    }

    public GenericInternalCheckedException(String message) {
        super(message);
    }

    public GenericInternalCheckedException(String message, Throwable cause) {
        super(message, cause);
    }

    public GenericInternalCheckedException(Throwable cause) {
        super(cause);
    }
}
