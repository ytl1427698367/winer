package com.SortColection;

/**
 * Author：TaiLong
 * created:2019/9/6
 */

        import java.sql.SQLOutput;
        import java.util.*;

class Main {
    public static void main(String args[]) {
        int M;
        int S;
        int T;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            M = sc.nextInt();
            S = sc.nextInt();
            T = sc.nextInt();
            int time;
            int instance;
            int mofazhi;

            if (M / 10 * T * 50 >= S) {
                System.out.println("Yes");
                System.out.println(M / 10);
            } else {
                mofazhi = M - M / 10;
                time = T - M / 10;
                instance = 50 * M / 10 + 50 * ((time + 1) / 2);
                if (instance >= S) {
                    System.out.println("Yes");
                    System.out.println();
                } else if (instance < S) {
                    System.out.println("No");
                    System.out.println(instance);
                }
            }
        }
    }
}
