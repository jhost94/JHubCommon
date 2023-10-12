package center.jhub.exception.external.checked;

public abstract class GenericCheckedException extends Exception {

    public GenericCheckedException() {
    }

    public GenericCheckedException(String message) {
        super(message);
    }

    public GenericCheckedException(String message, Throwable cause) {
        super(message, cause);
    }

    public GenericCheckedException(Throwable cause) {
        super(cause);
    }
}
