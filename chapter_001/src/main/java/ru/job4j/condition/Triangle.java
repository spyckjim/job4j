package ru.job4j.condition;

/**
 * класс Треугольник.
 * @author spyckjim (spyckjim@gmail.com)
 * @version 1.0
 * @since 28.02.2019
 */
public class Triangle {

    /**
     * Метод вычисления периметра по длинам сторон.
     * Формула.
     * (a + b + c) / 2
     * @param a расстояние между точками a b
     * @param b расстояние между точками a c
     * @param c расстояние между точками b c
     * @return Периметр.
     */
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    /**
     * Метод должен вычислить прощадь треугольканива.
     * Формула.
     * √ p *(p - ab) * (p - ac) * (p - bc)
     * где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
     * @return Вернуть прощадь, если треугольник существует или -1.
     */
    public double area(int x1, int y1, int x2, int y2, int x3, int y3) {
        double rsl = -1;
        Point point = new Point();
        double a = point.distance(x1, y1, x2, y2);
        double b = point.distance(x2, y2, x3, y3);
        double c = point.distance(x1, y1, x3, y3);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     * @param a Длина от точки a b.
     * @param b Длина от точки a c.
     * @param c Длина от точки b c.
     * @return результат
     */
    private boolean exist(double a, double c, double b) {
        return (a < (c + b) && c < (a + b) && b < (a + c));
    }
}