package ru.job4j.array;

import java.util.Arrays;
/**
 * класс ArrayDuplicate
 * @author spyckjim (spyckjim@gmail.com)
 * @version 1.0
 * @since 11.04.2019
 */
public class ArrayDuplicate {
    /**
     * метод проверяет массив на наличие дубликатов и удаляет их, если они имеются
     * @param array проверяемый массив
     * @return проверенный массив
     */
    public  String[] remove(String[] array) {
        int unique = array.length;
        for (int out = 0; out < unique; out++) {
            for (int in = out + 1; in < unique; in++) {
                if (array[out].equals(array[in])) {
                    array[in] = array[unique - 1];
                    unique--;
                    in--;
                }
            }
        }
        return Arrays.copyOf(array, unique);
    }
}