package by.jonline.module2.sortirovka;

import java.util.Arrays;

public class Task06 {

	// сортировка шелла (по возрастанию)

	public static void main(String[] args) {

        double[] aa = { 11.2, 9.1, 8.4, 7.6, 5.4, 2.1 };

        int part = aa.length / 2;
        while (part >= 1) {
            for (int i = 0; i < aa.length; i++) {

                for (int j = i - part; j >= 0; j -= part) {
                    if (aa[j] > aa[j + part]) {
                        swap(aa, j, j + part);
                    }
                }
            }
            part = part / 2;
        }
        System.out.println(Arrays.toString(aa));
    }

    private static void swap(double[] qq, int a, int b) {

        double m;
        m = qq[a];
        qq[a] = qq[b];
        qq[b] = m;

    }
}