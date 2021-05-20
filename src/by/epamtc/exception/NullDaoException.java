package by.epamtc.exception;

public class NullDaoException extends Exception{
    public NullDaoException() {
    }

    public NullDaoException(String message) {
        super(message);
    }

    public NullDaoException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullDaoException(Throwable cause) {
        super(cause);
    }

    public NullDaoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
