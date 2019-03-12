package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

    /**
     *
     * @author spyckjim (spyckjim@gmail.com)
     * @version 1
     * @since 12.03.2019
     */
    public class BoardTest {

        /**
         * тест, когда сторона доски равна 3.
         */
        @Test
        public void when3x3() {
            Board board = new Board();
            String rsl = board.paint(3, 3);
            String ln = System.lineSeparator();
            assertThat(rsl, is(
                    String.format("X X%s X %sX X%s", ln, ln, ln)
                    )
            );
        }

        /**
         * Тест, когда ширина доски 5, а высота 4.
         */
        @Test
        public void when5x4() {
            Board board = new Board();
            String rsl = board.paint(5, 4);
            String ln = System.lineSeparator();
            assertThat(rsl, is(String.format("X X X%s X X %sX X X%s X X %s", ln, ln, ln, ln)));
        }
    }