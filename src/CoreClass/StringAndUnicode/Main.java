package CoreClass.StringAndUnicode;

import java.lang.reflect.Array;
import java.util.Arrays;
import com.zgyjyx.student.*;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("qqq");
        sb.setLength(2);
        System.out.println(sb);
        sb.append("qq");
        System.out.println(sb.length());
        System.out.println(sb);
        String str = "whatfuck";
        char[] c_list = str.toCharArray();

        String[] str_list = {};


    }
}
