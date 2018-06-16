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

    @Test
    public void testLCDCellIsZero()
    {
        Int2LCD int2LCD = new Int2LCD();
        int[] zeroLCDCell = int2LCD.getZeroLCDCell();
        /**
         *
         *  _             1
         * | |    =>    1 0 1    =>    1101111
         * |_|          1 1 1
         *
         */
        int[] expected = new int[]{1,1,0,1,1,1,1};

        int[] actual = zeroLCDCell;

        Assert.assertArrayEquals(expected, actual);
    }
}
