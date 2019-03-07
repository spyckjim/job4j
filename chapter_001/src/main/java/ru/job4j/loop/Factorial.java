package ru.job4j.loop;

/**
 *  класс Factorial.
 * @author spyckjim (spyckjim@gmail.com)
 * @since 06.03.2019
 */
public class Factorial {

    /**
     * метод вычисляет факториал числа n.
     * @param n положительное целое числою
     * @return возвращает результат вычислений.
     */
    public int calc(int n) {
        int result = 1;
        for (int f = 1; f <= n; f++) {
            result = result * f;
        }
        return result;
    }
}
