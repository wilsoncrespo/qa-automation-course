package edu.alsie.tdd.int2lcd;

import org.junit.Assert;
import org.junit.Test;

public class Int2LCDTest {
    @Test
    public void testLCDCellLengthIs7()
    {
        Int2LCD int2LCD = new Int2LCD();
        int[] emptyLCDCell = int2LCD.getEmptyLCDCell();

        int expected = 7;

        int actual = emptyLCDCell.length;

        Assert.assertEquals(expected, actual);
    }
}
