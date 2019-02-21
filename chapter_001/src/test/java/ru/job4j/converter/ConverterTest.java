package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {

    /**
     * Тест рубли в доллары.
     */
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.RubleToDollar(60);
        assertThat(result, is(1));
    }

    /**
     * Тест рубли в евро.
     */
    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.RubleToEuro(70);
        assertThat(result, is(1));
    }

    /**
     * Test доллары в рубли.
     */
    @Test
    public void when1DollarToRubleThen60() {
        Converter converter = new Converter();
        int result = converter.DollarToRuble(1);
        assertThat(result, is(60));
    }

    /**
     * Test евро в рубли.
     */
    @Test
    public void when1EuroToRubleThen70() {
        Converter converter = new Converter();
        int result = converter.EuroToRuble(1);
        assertThat(result, is(70));
    }
}
