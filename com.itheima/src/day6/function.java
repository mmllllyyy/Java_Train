package day6;

import java.util.PriorityQueue;
import java.util.Queue;

import static day5.ArrayTrain.q3;

public class function {

    public static void main(String[] args) {
        System.out.println("q1 = " + q1(0.5, 23));
//        System.out.println("q3(10,20,30) = " + q3(10, 20, 30));

    }

    private static double q1(double a, double b) {
        return Math.min(a, b);
    }
}
