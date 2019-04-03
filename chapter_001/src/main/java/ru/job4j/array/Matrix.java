package ru.job4j.array;

/**
 * класс Matrix
 * @author spyckjim (spyckjim@gmail.com)
 * @version 1.0
 * @since 03.04.2019
 */
public class Matrix {

    /**
     * метод строит таблицу, заполненную значениями перемноженных индексов массивов
     * @param size размер таблицы
     * @return построенная таблица
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}