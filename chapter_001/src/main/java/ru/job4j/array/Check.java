package ru.job4j.array;

/**
 * класс Check
 * @author spyckjim (spyckjim@gmail.com)
 * @version 1.0
 * @since 28.03.2019
 */
public class Check {

    /**
     * метод проверяет, что все элементы в массиве true или false
     * @param data массив
     * @return возвращает true, если все значения  true или false иначе возвращается false
     */
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int index = 0; index < data.length - 1; index++) {
            if (data[index] == data[index + 1]) {
                result = true;
                break;
            }
        }
        return result;
    }
}