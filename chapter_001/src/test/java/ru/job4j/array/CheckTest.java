package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * класс CheckTest
 * @author spyckjim (spyckjim@gmail.com)
 * @version 1.0
 * @since 28.03.2019
 */
public class CheckTest {

    /**
     * проверяет нечетное количество одинаковых элементов в массиве
     */
    @Test
    public void whenDataMonoByTrueThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, true};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    /**
     * проверяет нечетное количество разных элементов в массиве
     */
    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, false, true};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    /**
     * проверяет четное количество одинаковых элементов в массиве
     */
    @Test
    public void whenDataMonoByFalseThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[] {false, false, false, false};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    /**
     * проверяет четное количество разных элементов в массиве
     */
    @Test
    public void whenDataNotMonoByTrueExThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[] {false, true, false, true};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
}