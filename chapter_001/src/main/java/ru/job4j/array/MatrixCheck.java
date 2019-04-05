package ru.job4j.array;
/**
 * класс MatrixCheck
 * @author spyckjim (spyckjim@gmail.com)
 * @version 1.0
 * @since 04.04.2019
 */
public class MatrixCheck {
    /**
     * метод проверяет, что все элементы по диагоналям двумерного массива равны true или false
     * @param data массив
     * @return результат
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        int length = data.length;
        for (int i = 0; i < length - 1; i++) {
            if (data[i][i] != data[i + 1][i + 1] || data[i][length - 1 - i] != data[i + 1][length - 2 - i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}