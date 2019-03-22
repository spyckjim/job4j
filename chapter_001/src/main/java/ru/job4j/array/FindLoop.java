package ru.job4j.array;

/**
 * класс FindLoop
 * @author spyckjim (spyckjim@gmail.com)
 * @version 1.0
 * @since 21.03.2019
 */
public class FindLoop {

    /**
     * метод ищет элемент в массиве.
     * @param data массив.
     * @param el искомый элемент.
     * @return значение найденного элемента.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}