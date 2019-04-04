package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * тест-класс MatrixCheckTest
 * @author spyckjim (spyckjim@gmail.com)
 * @version 1.0
 * @since 04.04.2019
 */
public class MatrixCheckTest {
    /**
     * тест, когда диагонали заполнены одинаковыми значениями(нечетное количество элементов)
     */
    @Test
    public void whenDataMonoByTrueThenTrue() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, true},
                {false, true, true},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }
    /**
     * тест, когда диагонали заполнены разными значениями(нечетное количество элементов)
     */
    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, false},
                {false, false, true},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
    /**
     * тест, когда диагонали заполнены одинаковыми значениями(четное количество элементов)
     */
    @Test
    public void whenDataMonoByTrueThenTrue1() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {false, true},
                {true, false}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }
    /**
     * тест, когда диагонали заполнены разными значениями(четное количество элементов)
     */
    @Test
    public void whenDataNotMonoByTrueThenFalse1() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true},
                {false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
}