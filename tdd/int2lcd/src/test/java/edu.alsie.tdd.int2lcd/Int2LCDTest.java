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
        int[] oneLCDCell = int2LCD.getOneLCDCell();
        /**
         *
         *                0
         *   |    =>    0 0 1    =>    0001001
         *   |          0 0 1
         *
         */
        int[] expected = new int[]{0,0,0,1,0,0,1};

        int[] actual = oneLCDCell;

        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void testLCDCellIsTwo()
    {
        Int2LCD int2LCD = new Int2LCD();
        int[] twoLCDCell = int2LCD.getTwoLCDCell();
        /**
         *
         *  _             1
         *  _|    =>    0 1 1    =>    1011110
         * |_           1 1 0
         *
         */
        int[] expected = new int[]{1,0,1,1,1,1,0};

        int[] actual = twoLCDCell;

        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void testLCDCellIsThree()
    {
        Int2LCD int2LCD = new Int2LCD();
        int[] threeLCDCell = int2LCD.getThreeLCDCell();
        /**
         *
         *  _             1
         *  _|    =>    0 1 1    =>    1011011
         *  _|          0 1 1
         *
         */
        int[] expected = new int[]{1,0,1,1,0,1,1};

        int[] actual = threeLCDCell;

        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void testLCDCellIsFour()
    {
        Int2LCD int2LCD = new Int2LCD();
        int[] fourLCDCell = int2LCD.getFourLCDCell();
        /**
         *
         *                0
         * |_|    =>    1 1 1    =>    0111001
         *   |          0 0 1
         *
         */
        int[] expected = new int[]{0,1,1,1,0,0,1};

        int[] actual = fourLCDCell;

        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void testLCDCellIsFive()
    {
        Int2LCD int2LCD = new Int2LCD();
        int[] fiveLCDCell = int2LCD.getFiveLCDCell();
        /**
         *
         *  _             1
         * |_     =>    1 1 0    =>    1110011
         *  _|          0 1 1
         *
         */
        int[] expected = new int[]{1,1,1,0,0,1,1};

        int[] actual = fiveLCDCell;

        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void testLCDCellIsSix()
    {
        Int2LCD int2LCD = new Int2LCD();
        int[] sixLCDCell = int2LCD.getSixLCDCell();
        /**
         *
         *  _             1
         * |_     =>    1 1 0    =>    1110111
         * |_|          1 1 1
         *
         */
        int[] expected = new int[]{1,1,1,0,1,1,1};

        int[] actual = sixLCDCell;

        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void testLCDCellIsSeven()
    {
        Int2LCD int2LCD = new Int2LCD();
        int[] secenLCDCell = int2LCD.getSevenLCDCell();
        /**
         *
         *  _             1
         *   |    =>    0 0 1    =>    1001001
         *   |          0 0 1
         *
         */
        int[] expected = new int[]{1,0,0,1,0,0,1};

        int[] actual = secenLCDCell;

        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void testLCDCellIsEight()
    {
        Int2LCD int2LCD = new Int2LCD();
        int[] eigthLCDCell = int2LCD.getEightLCDCell();
        /**
         *
         *  _             1
         * |_|    =>    1 1 1    =>    1111111
         * |_|          1 1 1
         *
         */
        int[] expected = new int[]{1,1,1,1,1,1,1};

        int[] actual = eigthLCDCell;

        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void testLCDCellIsNine()
    {
        Int2LCD int2LCD = new Int2LCD();
        int[] nineLCDCell = int2LCD.getNineLCDCell();
        /**
         *
         *  _             1
         * |_|    =>    1 1 1    =>    1111011
         *  _|          0 1 1
         *
         */
        int[] expected = new int[]{1,1,1,1,0,1,1};

        int[] actual = nineLCDCell;

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testStringValueForDigitZero()
    {
        Int2LCD int2LCD = new Int2LCD();
        String[] zeroLCDCellStringValue = int2LCD.getZeroLCDCellStringValue();
        /**
         *
         *  _             1
         * | |    =>    1 0 1    =>    1101111    =>    " _ ", "| |", "|_|"
         * |_|          1 1 1
         *
         */
        String[] expected = new String[]{" _ ", "| |", "|_|"};

        String[] actual = zeroLCDCellStringValue;

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testStringValueForDigitOne()
    {
        Int2LCD int2LCD = new Int2LCD();
        String[] oneLCDCellStringValue = int2LCD.getOneLCDCellStringValue();
        /**
         *
         *                0
         *   |    =>    0 0 1    =>    0001001    =>    "   ", "  |", "  |"
         *   |          0 0 1
         *
         */
        String[] expected = new String[]{"   ", "  |", "  |"};

        String[] actual = oneLCDCellStringValue;

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testStringValueForDigitTwo()
    {
        Int2LCD int2LCD = new Int2LCD();
        String[] twoLCDCellStringValue = int2LCD.getTwoLCDCellStringValue();
        /**
         *
         *  _             1
         *  _|    =>    0 1 1    =>    1011110    =>    " _ ", " _|", "|_ "
         * |_           1 1 0
         *
         */
        String[] expected = new String[]{" _ ", " _|", "|_ "};

        String[] actual = twoLCDCellStringValue;

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testStringValueForDigitThree()
    {
        Int2LCD int2LCD = new Int2LCD();
        String[] threeLCDCellStringValue = int2LCD.getThreeLCDCellStringValue();
        /**
         *
         *  _             1
         *  _|    =>    0 1 1    =>    1011011    =>    " _ ", " _|", " _|"
         *  _|          0 1 1
         *
         */
        String[] expected = new String[]{" _ ", " _|", " _|"};

        String[] actual = threeLCDCellStringValue;

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testStringValueForDigitFour()
    {
        Int2LCD int2LCD = new Int2LCD();
        String[] fourLCDCellStringValue = int2LCD.getFourLCDCellStringValue();
        /**
         *
         *                0
         * |_|    =>    1 1 1    =>    0111001    =>    "   ", "|_|", "  |"
         *   |          0 0 1
         *
         */
        String[] expected = new String[]{"   ", "|_|", "  |"};

        String[] actual = fourLCDCellStringValue;

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testStringValueForDigitFive()
    {
        Int2LCD int2LCD = new Int2LCD();
        String[] fiveLCDCellStringValue = int2LCD.getFiveLCDCellStringValue();
        /**
         *
         *  _             1
         * |_     =>    1 1 0    =>    1110011    =>    " _ ", "|_ ", " _|"
         *  _|          0 1 1
         *
         */
        String[] expected = new String[]{" _ ", "|_ ", " _|"};

        String[] actual = fiveLCDCellStringValue;

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testStringValueForDigitSix()
    {
        Int2LCD int2LCD = new Int2LCD();
        String[] sixLCDCellStringValue = int2LCD.getSixLCDCellStringValue();
        /**
         *
         *  _             1
         * |_     =>    1 1 0    =>    1110111    =>    " _ ", "|_ ", "|_|"
         * |_|          1 1 1
         *
         */
        String[] expected = new String[]{" _ ", "|_ ", "|_|"};

        String[] actual = sixLCDCellStringValue;

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testStringValueForDigitSeven()
    {
        Int2LCD int2LCD = new Int2LCD();
        String[] sevenLCDCellStringValue = int2LCD.getSevenLCDCellStringValue();
        /**
         *
         *  _             1
         *   |    =>    0 0 1    =>    1001001    =>    " _ ", "  |", "  |"
         *   |          0 0 1
         *
         */
        String[] expected = new String[]{" _ ", "  |", "  |"};

        String[] actual = sevenLCDCellStringValue;

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testStringValueForDigitEight()
    {
        Int2LCD int2LCD = new Int2LCD();
        String[] eightLCDCellStringValue = int2LCD.getEightLCDCellStringValue();
        /**
         *
         *  _             1
         * |_|    =>    1 1 1    =>    1111111    =>    " _ ", "|_|", "|_|"
         * |_|          1 1 1
         *
         */
        String[] expected = new String[]{" _ ", "|_|", "|_|"};

        String[] actual = eightLCDCellStringValue;

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testStringValueForDigitNine()
    {
        Int2LCD int2LCD = new Int2LCD();
        String[] nineLCDCellStringValue = int2LCD.getNineLCDCellStringValue();
        /**
         *
         *  _             1
         * |_|    =>    1 1 1    =>    1111011    =>    " _ ", "|_|", " _|"
         *  _|          0 1 1
         *
         */
        String[] expected = new String[]{" _ ", "|_|", " _|"};

        String[] actual = nineLCDCellStringValue;

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testGet123AsLCDList()
    {
        Int2LCD int2LCD = new Int2LCD();
        int[] oneLCDCell = int2LCD.getOneLCDCell();
        /**
         *
         *     _  _             0    1    1
         *   | _| _|    =>    0 0 10 1 10 1 1    =>    [[0001001], [1011110], [1011011]]
         *   ||_  _|          0 0 11 1 00 1 1
         *
         */
        int[][] expected = {{0,0,0,1,0,0,1}, {1,0,1,1,1,1,0}, {1,0,1,1,0,1,1}};

        int[][] actual = int2LCD.getNumberAsLCDList(123);

        Assert.assertArrayEquals(expected, actual);
    }
}
