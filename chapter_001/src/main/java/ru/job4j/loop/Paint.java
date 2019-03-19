package ru.job4j.loop;

import java.util.function.BiPredicate;

/**
 * красс собирает пирамиду из символов "^" и "пробел".
 * @author spyckjim (spyckjim@gmail.com)
 * @version 1.1
 * @since 12.03.2019
 */
public class Paint {

    /**
     * метод строит правую часть пирамиды.
     * @param height высота пирамиды.
     * @return результат построения правой части пирамиды.
     */
    public String rightTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= column
        );
    }

    /**
     * метод строит левую часть пирамиды.
     * @param height высота пирамиды.
     * @return результат построения левой части пирамиды.
     */
    public String leftTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= height - column - 1
        );
    }

    /**
     * метод собирает пирамиду из символов "^" и " побел"..
     * @param height высота пирамиды.
     * @return результат построения пирамиды.
     */
    public String pyramid(int height) {
        return this.loopBy(
                height,
                2 * height - 1,
                (row, column) -> row >= height - column - 1 && row + height - 1 >= column
        );
    }

    private String loopBy(int height, int widht, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != widht; column++) {
                if (predict.test(row, column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}