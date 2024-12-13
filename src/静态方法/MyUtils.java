package 静态方法;




/**
 * @Author xushupeng
 * @Date 2024-12-13 12:16
 */
public  class MyUtils {
    public static int getMax(int a,int b){
        return a>b?a:b;
    }
   //引入泛型方法
   public static <T extends Number> double getSum(T arr[]){
       double sum=0;
       for(int i=0;i<arr.length;i++){
           sum += arr[i].doubleValue();
       }
       return sum;
   }

   public static String getUpperString(String str){
       return str.toUpperCase();
   }
}
