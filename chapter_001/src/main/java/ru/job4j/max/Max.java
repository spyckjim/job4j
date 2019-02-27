package ru.job4j.max;

/**
 * Класс Max
 */
public class Max {
    /**
     * Максимум из двух чисел.
     * @param first первое число.
     * @param second второе число.
     * @return максимальное из двух чисел.
     */
    public int max(int first, int second) {
       return first > second ? first : second;
    }
}
