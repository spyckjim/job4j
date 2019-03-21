package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *  класс SquareTest.
 * @author spyckjim (spyckjim@gmail.com)
 * @version 1.0
 * @since 21.03.2019
 */
public class SquareTest {

    /**
     * тест массива с тремя элементами.
     */
    @Test
    public void whenBound3Then149() {
        int bound = 3;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[] {1, 4, 9};
        assertThat(rst, is(expect));
    }

    /**
     * тест массива с 4 элементами.
     */
    @Test
    public void whenBound4Then14916() {
        int bound = 4;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[] {1, 4, 9, 16};
        assertThat(rst, is(expect));
    }

    /**
     * тест массива с 6 элементами.
     */
    @Test
    public void whenBound6Then149162536() {
        int bound = 6;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[] {1, 4, 9, 16, 25, 36};
        assertThat(rst, is(expect));
    }
}