package edu.alsie.tdd.int2lcd;

public class Int2LCD {

    private int width;
    private int height;

    public Int2LCD()
    {
        this(1, 1);
    }

    public Int2LCD(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    public int[] getEmptyLCDCell() {
        return new int[7];
    }
    public int[] getZeroLCDCell() {
        return new int[]{1,1,0,1,1,1,1};
    }
    public int[] getOneLCDCell() {
        return new int[]{0,0,0,1,0,0,1};
    }
    public int[] getTwoLCDCell() {
        return new int[]{1,0,1,1,1,1,0};
    }
    public int[] getThreeLCDCell() {
        return new int[]{1,0,1,1,0,1,1};
    }
    public int[] getFourLCDCell() {
        return new int[]{0,1,1,1,0,0,1};
    }
    public int[] getFiveLCDCell() {
        return new int[]{1,1,1,0,0,1,1};
    }
    public int[] getSixLCDCell() {
        return new int[]{1,1,1,0,1,1,1};
    }
    public int[] getSevenLCDCell() {
        return new int[]{1,0,0,1,0,0,1};
    }
    public int[] getEightLCDCell() {
        return new int[]{1,1,1,1,1,1,1};
    }
    public int[] getNineLCDCell() {
        return new int[]{1,1,1,1,0,1,1};
    }

    public String[] getZeroLCDCellStringValue()
    {
        int[] zeroLCDCellValue = getZeroLCDCell();
        return convertValuesToString(zeroLCDCellValue);
    }

    public String[] getOneLCDCellStringValue()
    {
        int[] oneLCDCellValue = getOneLCDCell();
        return convertValuesToString(oneLCDCellValue);
    }

    public String[] getTwoLCDCellStringValue()
    {
        int[] twoLCDCellValue = getTwoLCDCell();
        return convertValuesToString(twoLCDCellValue);
    }

    public String[] getThreeLCDCellStringValue()
    {
        int[] threeLCDCellValue = getThreeLCDCell();
        return convertValuesToString(threeLCDCellValue);
    }

    public String[] getFourLCDCellStringValue()
    {
        int[] fourLCDCellValue = getFourLCDCell();
        return convertValuesToString(fourLCDCellValue);
    }

    public String[] getFiveLCDCellStringValue()
    {
        int[] fiveLCDCellValue = getFiveLCDCell();
        return convertValuesToString(fiveLCDCellValue);
    }

    public String[] getSixLCDCellStringValue()
    {
        int[] sixLCDCellValue = getSixLCDCell();
        return convertValuesToString(sixLCDCellValue);
    }

    public String[] getSevenLCDCellStringValue()
    {
        int[] sevenLCDCellValue = getSevenLCDCell();
        return convertValuesToString(sevenLCDCellValue);
    }

    public String[] getEightLCDCellStringValue()
    {
        int[] eightLCDCellValue = getEightLCDCell();
        return convertValuesToString(eightLCDCellValue);
    }

    public String[] getNineLCDCellStringValue()
    {
        int[] nineLCDCellValue = getNineLCDCell();
        return convertValuesToString(nineLCDCellValue);
    }

    private String[] convertValuesToString(int[] lcdCellValue)
    {
        int totalHeight = getCalculatedHeight();
        int secondSegmentStart = 1;
        int secondSegmentEnd = (totalHeight - 1) / 2;
        int thirdSegmentStart = secondSegmentEnd + 1;
        int thirdSegmentEnd = totalHeight - 1;
        String[] stringCellValue = new String[totalHeight];
        for (int i = 0; i < lcdCellValue.length; i++) {
            if (i == 0)
            {
                stringCellValue[0] = getDigitStringRow(0, lcdCellValue[i], 0);
            }
            if (i == 1)
            {
                if (secondSegmentEnd == 1)
                {
                    stringCellValue[1] = getDigitStringRow(lcdCellValue[i], lcdCellValue[i+1], lcdCellValue[i+2]);
                } else
                {
                    for (int j = secondSegmentStart; j < secondSegmentEnd; j++) {
                        stringCellValue[j] = getDigitStringRow(lcdCellValue[i], 0, lcdCellValue[i+2]);
                    }
                    stringCellValue[secondSegmentEnd] = getDigitStringRow(0, lcdCellValue[i+1], 0);
                }
                i += 2;
            }
            if (i == 4)
            {
                if (thirdSegmentEnd == 2)
                {
                    stringCellValue[2] = getDigitStringRow(lcdCellValue[i], lcdCellValue[i+1], lcdCellValue[i+2]);
                }
                else
                {
                    for (int j = thirdSegmentStart; j < thirdSegmentEnd; j++) {
                        stringCellValue[j] = getDigitStringRow(lcdCellValue[i], 0, lcdCellValue[i+2]);
                    }
                    stringCellValue[thirdSegmentEnd] = getDigitStringRow(0, lcdCellValue[i+1], 0);
                }
                i += 2;
            }
        }
        return stringCellValue;
    }

    private String getDigitStringRow(int left, int central, int right)
    {
        if (width == 1 && height == 1)
        {
            return (left == 1 ? "|" : " ") + (central == 1 ? "_" : " ") + (right == 1 ? "|" : " ");
        }
        String stringRow = "";
        if (left == 1 || right == 1)
        {
            stringRow += (left == 1 ? "|" : " ") + getHorizontalLine(" ") + (right == 1 ? "|" : " ");
        } else
        {
            stringRow += " " + (central == 1 ? getHorizontalLine("_") : getHorizontalLine(" ")) + " ";
        }
        return stringRow;
    }

    private String getHorizontalLine(String value)
    {
        String horizontalLine = "";
        for (int i = 0; i < width; i++) {
            horizontalLine += value;
        }
        return horizontalLine;
    }

    public int[][] getNumberAsLCDList(int number)
    {
        int digitsLength = ((int) Math.log10((double) number)) + 1;
        int[][] lcdList = new int[digitsLength][7];
        int n = number;
        int i = digitsLength - 1;
        while (n > 0)
        {
            int digit = n % 10;
            int[] digitAsLCDList = getNumberAsLCDCell(digit);
            lcdList[i] = digitAsLCDList;
            n = n / 10;
            i--;
        }
        return lcdList;
    }

    private int[] getNumberAsLCDCell(int digit)
    {
        switch (digit)
        {
            case 0 : return getZeroLCDCell();
            case 1 : return getOneLCDCell();
            case 2 : return getTwoLCDCell();
            case 3 : return getThreeLCDCell();
            case 4 : return getFourLCDCell();
            case 5 : return getFiveLCDCell();
            case 6 : return getSixLCDCell();
            case 7 : return getSevenLCDCell();
            case 8 : return getEightLCDCell();
            case 9 : return getNineLCDCell();
            default: return new int[7];
        }
    }

    public String[][] getNumberAsLCDStringValue(int number)
    {
        int[][] lcdValues = getNumberAsLCDList(number);
        String[][] lcdValuesAsString = new String[lcdValues.length][getCalculatedHeight()];
        for (int i = 0; i < lcdValues.length; i++) {
            lcdValuesAsString[i] = convertValuesToString(lcdValues[i]);
        }
        return lcdValuesAsString;
    }

    public String getNumberAsLCDStringRenderedValue(int number)
    {
        String numberAsLCDStringRenderedValue = "";
        String[][] numberAsLCDStringValue = getNumberAsLCDStringValue(number);
        for (int i = 0; i < getCalculatedHeight(); i++) {
            for (int j = 0; j < numberAsLCDStringValue.length; j++) {
                numberAsLCDStringRenderedValue += numberAsLCDStringValue[j][i];
            }
            numberAsLCDStringRenderedValue += "\n";
        }
        return numberAsLCDStringRenderedValue.substring(0, numberAsLCDStringRenderedValue.length() - 1);
    }

    private int getCalculatedHeight()
    {
        return height > 1 ? ((height * 2) + 3) : 3;
    }
}
