package pub.guoxin.protocol.model.exception;

/**
 * Create by guoxin on 2018/6/14
 */
public class ProtocolFormatException extends RuntimeException {
    public ProtocolFormatException() {
        super();
    }

    public ProtocolFormatException(String message) {
        super(message);
    }

    public ProtocolFormatException(String message, Throwable cause) {
        super(message, cause);
    }
}
