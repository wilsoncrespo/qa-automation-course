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
    @Test
    public void testLCDCellIsOne()
    {
        Int2LCD int2LCD = new Int2LCD();
        int[] zeroLCDCell = int2LCD.getOneLCDCell();
        /**
         *
         *                0
         *   |    =>    0 0 1    =>    0001001
         *   |          0 0 1
         *
         */
        int[] expected = new int[]{1,1,0,1,1,1,1};

        int[] actual = zeroLCDCell;

        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void testLCDCellIsTwo()
    {
        Int2LCD int2LCD = new Int2LCD();
        int[] zeroLCDCell = int2LCD.getTwoLCDCell();
        /**
         *
         *  _             1
         *  _|    =>    0 1 1    =>    1011110
         * |_           1 1 0
         *
         */
        int[] expected = new int[]{1,1,0,1,1,1,1};

        int[] actual = zeroLCDCell;

        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void testLCDCellIsThree()
    {
        Int2LCD int2LCD = new Int2LCD();
        int[] zeroLCDCell = int2LCD.getThreeLCDCell();
        /**
         *
         *  _             1
         *  _|    =>    0 1 1    =>    1011011
         *  _|          0 1 1
         *
         */
        int[] expected = new int[]{1,1,0,1,1,1,1};

        int[] actual = zeroLCDCell;

        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void testLCDCellIsFour()
    {
        Int2LCD int2LCD = new Int2LCD();
        int[] zeroLCDCell = int2LCD.getFourLCDCell();
        /**
         *
         *                0
         * |_|    =>    1 1 1    =>    0111001
         *   |          0 0 1
         *
         */
        int[] expected = new int[]{1,1,0,1,1,1,1};

        int[] actual = zeroLCDCell;

        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void testLCDCellIsFive()
    {
        Int2LCD int2LCD = new Int2LCD();
        int[] zeroLCDCell = int2LCD.getFiveLCDCell();
        /**
         *
         *  _             1
         * |_     =>    1 1 0    =>    1110011
         *  _|          0 1 1
         *
         */
        int[] expected = new int[]{1,1,0,1,1,1,1};

        int[] actual = zeroLCDCell;

        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void testLCDCellIsSix()
    {
        Int2LCD int2LCD = new Int2LCD();
        int[] zeroLCDCell = int2LCD.getSixLCDCell();
        /**
         *
         *  _             1
         * |_     =>    1 1 0    =>    1110111
         * |_|          1 1 1
         *
         */
        int[] expected = new int[]{1,1,0,1,1,1,1};

        int[] actual = zeroLCDCell;

        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void testLCDCellIsSeven()
    {
        Int2LCD int2LCD = new Int2LCD();
        int[] zeroLCDCell = int2LCD.getSevenLCDCell();
        /**
         *
         *  _             1
         *   |    =>    0 0 1    =>    1001001
         *   |          0 0 1
         *
         */
        int[] expected = new int[]{1,1,0,1,1,1,1};

        int[] actual = zeroLCDCell;

        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void testLCDCellIsEight()
    {
        Int2LCD int2LCD = new Int2LCD();
        int[] zeroLCDCell = int2LCD.getEightLCDCell();
        /**
         *
         *  _             1
         * |_|    =>    1 1 1    =>    1111111
         * |_|          1 1 1
         *
         */
        int[] expected = new int[]{1,1,0,1,1,1,1};

        int[] actual = zeroLCDCell;

        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void testLCDCellIsNine()
    {
        Int2LCD int2LCD = new Int2LCD();
        int[] zeroLCDCell = int2LCD.getNineLCDCell();
        /**
         *
         *  _             1
         * |_|    =>    1 1 1    =>    1111001
         *   |          0 0 1
         *
         */
        int[] expected = new int[]{1,1,0,1,1,1,1};

        int[] actual = zeroLCDCell;

        Assert.assertArrayEquals(expected, actual);
    }
}
