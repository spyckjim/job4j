package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * класс-тест ArrayCharTest
 * @author spyckjim (spyckjim@gmail.com)
 * @version 1.0
 * @since 29.03.2019
 */
public class ArrayCharTest {

    /**
     * тест, когда элементы массивов совпадают
     */
    @Test
    public void whenStartWithPrefixThenTrue() {
        ArrayChar word = new ArrayChar("Hello");
        boolean result = word.startWith("He");
        assertThat(result, is(true));
    }

    /**
     * тест, когда элементы массивов не совпадают
     */
    @Test
    public void whenNotStartWithPrefixThenFalse() {
        ArrayChar word = new ArrayChar("Hello");
        boolean result = word.startWith("Hi");
        assertThat(result, is(false));
    }
}