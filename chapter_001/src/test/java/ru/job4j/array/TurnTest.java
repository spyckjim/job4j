package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * класс-тест TurnTest
 * @author spyckjim (spyckjim@gmail.com)
 * @version 1.0
 * @since 27.03.2019
 */
public class TurnTest {

    /**
     * метод проверяет переворот массива с четным количеством элементов
     */
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2};
        int[] resultArray = turner.back(input);
        int[] expectArray = new int[] {2, 6, 1, 4};
        assertThat(resultArray, is(expectArray));
    }

    /**
     * метод проверяет переворот массива с нечетным количеством элементов
     */
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {1, 2, 3, 4, 5};
        int[] resultArray = turner.back(input);
        int[] expectArray = new int[] {5, 4, 3, 2, 1};
        assertThat(resultArray, is(expectArray));
    }
}