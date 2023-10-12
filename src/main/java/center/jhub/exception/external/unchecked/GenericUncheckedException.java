package center.jhub.exception.external.unchecked;

public abstract class GenericUncheckedException extends RuntimeException {
    public GenericUncheckedException() {
    }

    public GenericUncheckedException(String message) {
        super(message);
    }

    public GenericUncheckedException(String message, Throwable cause) {
        super(message, cause);
    }

    public GenericUncheckedException(Throwable cause) {
        super(cause);
    }
}
