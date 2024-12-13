package fileStream;

public class fileTest {
    public static  void checkNumber(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number must be positive");
        }
        else{
            System.out.println("Suitable");
        }
    }
    public static void main(String[] args) {
      checkNumber(-9);
    }
}
