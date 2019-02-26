package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void DistanceToPoint() {
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);
       double result = a.distanceTo(b);
       double expect = 4.47213595499958;
        assertThat(result, is(expect));
    }
}
