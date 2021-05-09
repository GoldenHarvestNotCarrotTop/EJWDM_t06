package by.epamtc.exception;

public class NullPlaneException extends Exception{
    public NullPlaneException() {
    }

    public NullPlaneException(String message) {
        super(message);
    }

    public NullPlaneException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullPlaneException(Throwable cause) {
        super(cause);
    }

    public NullPlaneException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
