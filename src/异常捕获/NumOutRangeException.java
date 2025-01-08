package 异常捕获;

/**
 * @Author xushupeng
 * @Date 2025-01-01 14:39
 */
public class NumOutRangeException extends Exception{

    private int code;
    public NumOutRangeException(String message) {
        super(message);
    }
    public NumOutRangeException(String message,int code) {
        super(message);
       this.code = code;

    }
}
