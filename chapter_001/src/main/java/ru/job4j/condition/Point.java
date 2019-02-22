package ru.job4j.condition;

/**
 * Расстояние между двумя точками
 * @author spyckjim (spyckjim@gmail.ru)
 * @version 1.0
 * @since 22.02.2019
 */
public class Point {
    private int x;
    private int y;

    /**
     *Конструктор
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Вычисляем расстояние между точками.
     * @return - расстояние
     */
    public double distanceTo(Point that) {
        return Math.sqrt(
                Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2)
        );
    }

    /**
     * метод main
     * @param args - args
     */
    public static void main(String[] args) {
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);
        System.out.println("x1 = " + a.x);
        System.out.println("y1 = " + a.y);
        System.out.println("x2 = " + b.x);
        System.out.println("y2 = " + b.y);

        double result = a.distanceTo(b);
        System.out.println("Расстояние между точками А и В : " + result);
    }
}