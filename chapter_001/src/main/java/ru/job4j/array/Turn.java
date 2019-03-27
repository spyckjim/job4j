package ru.job4j.array;

/**
 * класс Turn
 * @author spyckjim (spyckjim@gmail.com)
 * @version 1.0
 * @since 27.03.2019
 */
public class Turn {
    /**
     * метод переворачивает массив
     * @param array массив
     * @return перевернутый массив
     */
    public int[] back(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            int temp = array[index];
            array[index] = array[array.length - index - 1];
            array[array.length - index - 1] = temp;
        }
        return array;
    }
}