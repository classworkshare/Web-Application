package chapter11.exception;

public class SystemException extends Exception {

  public SystemException(String message, Throwable cause,
      boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

  public SystemException(String message, Throwable cause) {
    super(message, cause);
  }

  public SystemException(String message) {
    super(message);
  }

  public SystemException(Throwable cause) {
    super(cause);
  }

}
