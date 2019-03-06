package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * class CounterTest
 */
public class CounterTest {

    /**
     * тест-метод вычисляет сумму всех четных чисел в диапозоне от 1 до 10.
     */
    @Test
    public void whenSumEvenNumbersFromOneToTenIsThirty() {
        Counter counter = new Counter();
        int result = counter.add(1, 10);
        assertThat(result, is(30));
    }
}
