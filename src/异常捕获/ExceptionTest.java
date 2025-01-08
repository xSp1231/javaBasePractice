package 异常捕获;

/**
 * @Author xushupeng
 * @Date 2025-01-01 14:40
 */
public class ExceptionTest {
    public static void main(String[] args) throws NumOutRangeException {

        int a=1009 ;
//        try{
            if(a>100||a<0){
                throw new NumOutRangeException("数字超出范围",460);
            }
            else{
                System.out.println("数字在范围内");
            }
//        }
//        catch(NumOutRangeException e){
//            System.out.println(e.getMessage());
//        }
    }

}
