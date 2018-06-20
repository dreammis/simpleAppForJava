package ExceptionBase;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class ExceptionE {
    public static void main(String[] args) {
        try {
            String s = "qweqweqwe";
            System.out.println(s.getBytes("q"));

        } catch (UnsupportedEncodingException e){
            System.out.println(e);
        }
    }
}
