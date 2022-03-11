package com.rus;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] mas = {1, 2, 10, 532, 0, 21, 432, 12321, 1231 ,32132131};
        selectionSort(mas);
        System.out.println("Конечный результат  -   " + Arrays.toString(mas));
    }

    public static void selectionSort(int[] mas) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < mas.length; i++) {
                int pos = i;
                int min = mas[i];
                for (int j = i + 1; j < mas.length; j++) {
                    if (min > mas[j]) {
                        pos = j;
                        min = mas[j];
                        swapped = true;
                    }
                }
                mas[pos] = mas[i];
                mas[i] = min;
            }
            for (int i = 0; i < mas.length; i++) {
                int pos = i;
                int max = mas[i];
                for (int j = i + 1; j < mas.length; j++) {
                    if (max < mas[i]) {
                        pos = j;
                        max = mas[i];
                        swapped = true;
                    }
                }
                mas[pos] = mas[i];
                mas[i] = max;
            }

        } while (swapped);

    }

}
