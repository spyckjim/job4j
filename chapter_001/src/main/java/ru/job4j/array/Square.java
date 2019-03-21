package ru.job4j.array;

/**
 *  класс Square.
 * @author spyckjim (spyckjim@gmail.com)
 * @version 1.0
 * @since 21.03.2019
 */
public class Square {

    /**
     * метод заполняет массив элементами возведенными в квадратю
     * @param bound число
     * @return результат заполнения
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int index = 0; index < bound; index++) {
            rst[index] = (index + 1) * (index + 1);
        }
        return rst;
    }
}