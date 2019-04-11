package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;
/**
 * класс-тест ArrayDuplicateTest
 * @author spyckjim (spyckjim@gmail.com)
 * @version 1.0
 * @since 11.04.2019
 */
public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] input = {"Liza", "Olga", "Masha", "Valeria"};
        String[] except = {"Liza", "Olga", "Masha", "Valeria"};
        String[] result = duplicate.remove(input);
        assertThat(result, arrayContainingInAnyOrder(except));
    }
    @Test
    public void whenArrayHasDuplicatesThenDropIt() {
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] input = {"Liza", "Olga", "Masha", "Liza", "Valeria"};
        String[] except = {"Liza", "Olga", "Masha", "Valeria"};
        String[] result = duplicate.remove(input);
        assertThat(result, arrayContainingInAnyOrder(except));
    }
    @Test
    public void whenArrayAllDuplicateThenDropIt() {
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] input = {"Liza", "Liza", "Liza", "Liza", "Liza"};
        String[] except = {"Liza"};
        String[] result = duplicate.remove(input);
        assertThat(result, arrayContainingInAnyOrder(except));
    }
}