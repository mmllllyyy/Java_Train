package day10;

import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;
import java.util.StringJoiner;

import static day5.ArrayTrain.q3;

public class StringTest {
    @Test
    void q2() {
        Scanner sc = new Scanner(System.in);
        String ori = sc.next();
        char[] charArray = ori.toCharArray();

        Random r = new Random();
        for (int i = 0; i < charArray.length; i++) {
            int index = r.nextInt(charArray.length);
            char temp = charArray[i];
            charArray[i] = charArray[index];
            charArray[index] = temp;
        }

        String string = new String(charArray);
//        数组没有重写toString，默认调用Object的toString
        String addr = charArray.toString();
        System.out.println(string);
//        打印的是地址
        System.out.println(addr);
    }

    @Test
    void q3() {
        char[] code = new char[5];
        Random r = new Random();

        int num_pos = r.nextInt(5);
        code[num_pos] = (char) ('0' + r.nextInt(10));

        int[] alpha = {'a', 'A'};
        for (int i = 0; i < 5; i++) {
            if (i == num_pos)
                continue;
            code[i] = (char) (alpha[r.nextInt(2)] + r.nextInt(26));
        }
        String s = new String(code);
        System.out.println(s);

    }

    @Test
    void q5() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("input string");
//        String str = sc.next();

        String str = "上海自来水来自海上";

        int length = str.length();
        boolean flag = true;
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("yes");
        else
            System.out.println("no");
    }

    @Test
    void q7(){
        int[] arr = {1,2,3};
        StringJoiner sj = new StringJoiner(",","[","]");
        for (int j : arr) {
            sj.add(String.valueOf(j));
        }
        System.out.println(sj.toString());
    }
}
