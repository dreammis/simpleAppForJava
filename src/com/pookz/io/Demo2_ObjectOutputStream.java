package com.pookz.io;

import com.zgyjyx.student.Girl;

import java.io.*;
import java.util.ArrayList;

public class Demo2_ObjectOutputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        objectOutputStreamGirl(); // 存档
//        ObjectInputStreamGirl();  // 读档

    }

    private static void ObjectInputStreamGirl() throws IOException, ClassNotFoundException {
        /*
        * 读档，读取ArrayList即可，然后遍历其就可以实现
        * */
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
        ArrayList g = (ArrayList)ois.readObject();
        ois.close();

        for (Object g1:g) {
            Girl g2 = (Girl)g1;
            System.out.println(g2.getName()+": " +g2.getAge());
        }
    }

    private static void objectOutputStreamGirl() throws IOException {
        /*
        * 对象序列化，写入a.txt文件
        * 之后补充的可以，将object写入容器中，之后可以将容器遍历即可
        * */

        Girl s = new Girl("wang", 12);
        Girl q = new Girl("sun", 14);
        ArrayList<Girl> garr = new ArrayList<>();
        garr.add(s);
        garr.add(q);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
        oos.writeObject(garr);
        oos.close();
    }
}
