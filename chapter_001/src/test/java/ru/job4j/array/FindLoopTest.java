package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * класс для теста класса FindLoop
 * @author spyckjim (spyckjim@gmail.com)
 * @version 1.0
 * @since 21.03.2019
 */
public class FindLoopTest {

    /**
     * тестирует поиск, когда элемент присутствует в массиве.
     */
    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    /**
     * тестирует поиск, когда элемент отсутствует в массиве.
     */
    @Test
    public void whenArrayHasNoEl() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 2;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}