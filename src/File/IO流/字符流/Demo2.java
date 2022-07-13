package File.IO流.字符流;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s="哈哈";
        byte[] byt=s.getBytes("GBK");
        String ss=new String(byt,"GBK");
        System.out.println(ss);
    }
}
//用什么编码就要用什么解码