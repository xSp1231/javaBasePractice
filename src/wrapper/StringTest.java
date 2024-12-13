package wrapper;

import java.net.SocketImpl;
import java.util.*;

/**
 * @Author xushupeng
 * @Date 2023-08-23 16:25
 */
public class StringTest {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);

        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Collections.sort(myNumbers);

        for (int i : myNumbers) {
            System.out.println(i);
        }
    }





}
