package ru.job4j.array;

/**
 * класс BubbleSort
 * @author spyckjim (spyckjim@gmail.com)
 * @version 1.0
 * @since 2.04.2019
 */
public class BubbleSort {

    /**
     * метод сортирует массив путем перестановки с помощью алгоритма пузырька
     * @param array сортируемый массив
     * @return отсортированный массив
     */
    public int[] sort(int[] array) {
        int length = array.length;
        for (int index = 0; index < length - 1; index++) {
            for (int j = 0; j < length - index - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}