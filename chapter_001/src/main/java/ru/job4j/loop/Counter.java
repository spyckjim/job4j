package ru.job4j.loop;

/**
 * class Counter
 * @author spyckjim (spyckjim@gmail.com)
 * @since 05.03.2019
 */
public class Counter {

    /**
     *
     * @param start начало диапозона чисел.
     * @param finish конец диапозона чисел.
     * @return сумма четных чисел.
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int index = start; index <= finish; index++) {
            if (index % 2 == 0) {
                sum = sum + index;
            }
        }
        return sum;
    }
}
