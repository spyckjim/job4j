package ru.job4j.loop;

/**
 * класс Board рисует шахматную доску.
 * @author spyckjim (spyckjim@gmail.com)
 * @version 1.0
 * @since 12.03.2019
 */
public class Board {

    /**
     * метод формирует шахматную доску из символов "X" и "пробел".
     * @param width ширина доски.
     * @param height высота доски.
     * @return возвращает нарисованную доску.
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // условие проверки, что писать пробел или X
                if ((i + j) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод на новую строку.
            screen.append(ln);
        }
        return screen.toString();
    }
}