package by.epamtc.exception;

public class NullCrewException extends Exception {
    public NullCrewException() {
    }

    public NullCrewException(String message) {
        super(message);
    }

    public NullCrewException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullCrewException(Throwable cause) {
        super(cause);
    }

    public NullCrewException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
