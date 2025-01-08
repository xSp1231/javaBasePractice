package 断点调试;

/**
 * @Author xushupeng
 * @Date 2024-12-29 16:12
 */
public class FunctionUtil {
    public static int getMax(int a, int b) {
        return a > b ? a : b;
    }
    //数组求和
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    //获取对象的所有属性
    public static void getAllFields(Object obj) {
        Class clazz = obj.getClass();
        java.lang.reflect.Field[] fields = clazz.getDeclaredFields();
        for (java.lang.reflect.Field field : fields) {
            System.out.println(field.getName());
        }
    }
}
