package ru.job4j.condition;

/**
 * Расстояние между двумя точками
 * @author spyckjim (spyckjim@gmail.com)
 * @version 1.0
 * @since 22.02.2019
 */
public class Point {

    /**
     * Вычисляем расстояние между точками.
     * @return - расстояние
     */
    public double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(
                Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

}