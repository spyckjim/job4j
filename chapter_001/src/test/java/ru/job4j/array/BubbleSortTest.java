package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {

    /**
     * тест проверяет сортировку массива из 10 элементов алгоритмом пузырька
     */
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort bubble = new BubbleSort();
        int[] input = new int[] {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        int[] resultArray = bubble.sort(input);
        int[] expectArray = new int[] {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        assertThat(resultArray, is(expectArray));
    }

    /**
     * тест проверяет сортировку массива из 15 элементов алгоритмом пузырька
     */
    @Test
    public void whenSortArrayWithFifteenElementsThenSortedArray() {
        BubbleSort bubble = new BubbleSort();
        int[] input = new int[] {14, 1, 10, 5, 4, 2, 12, 3, 1, 7, 11, 8, 0, 5, 13};
        int[] resultArray = bubble.sort(input);
        int[] expectArray = new int[] {0, 1, 1, 2, 3, 4, 5, 5, 7, 8, 10, 11, 12, 13, 14};
        assertThat(resultArray, is(expectArray));
    }
}