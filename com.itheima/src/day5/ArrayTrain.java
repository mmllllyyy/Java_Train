package day5;

import java.util.Random;
import java.util.Scanner;

public class ArrayTrain {
    public static void main(String[] args) {
        q1();
        q2();
        q3();
        q6();
    }

    public static void q1() {
        int[] a = {1, 2, 3, 4, 5};
        for (int x : a) System.out.print(x + " ");
        System.out.println();
    }

    public static void q2() {
        double[] a = {12.9, 53.54, 75.0, 99.1, 3.14};
        double ans = Double.POSITIVE_INFINITY;

        for (double x : a)
            if (x < ans)
                ans = x;
        System.out.println(ans);
    }

    public static void q3() {
        int[] a = new int[6];
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            a[i] = new Random().nextInt(100);
            sum += a[i];
        }
        System.out.println("sum = " + sum);
        for (int x : a) {
            System.out.print(x + " ");
        }
    }

    public static void q6() {
        int[] a = {12, 14, 23, 45, 66, 68, 70, 77, 90, 91, 0};
        try (Scanner sc = new Scanner(System.in)) {
            int ins = sc.nextInt();
            a[a.length - 1] = ins;
            for (int i = a.length - 1; i > 0; i--) {
                if (a[i] < a[i - 1]) {
                    int temp = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = temp;
                }
            }
        }
        for (int x : a) System.out.print(x + " ");

    }
}










