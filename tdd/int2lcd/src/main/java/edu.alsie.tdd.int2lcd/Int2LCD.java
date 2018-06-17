package edu.alsie.tdd.int2lcd;

public class Int2LCD {

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

    private String[] convertValuesToString(int[] lcdCellValue)
    {
        String[] stringCellValue = new String[3];
        for (int i = 0; i < lcdCellValue.length; i++) {
            if (i == 0)
            {
                stringCellValue[0] = getStringRow(0, lcdCellValue[i], 0);
            }
            if (i == 1)
            {
                stringCellValue[1] = getStringRow(lcdCellValue[i], lcdCellValue[i+1], lcdCellValue[i+2]);
                i += 2;
            }
            if (i == 4)
            {
                stringCellValue[2] = getStringRow(lcdCellValue[i], lcdCellValue[i+1], lcdCellValue[i+2]);
                i += 2;
            }
        }
        return stringCellValue;
    }

    private String getStringRow(int left, int central, int right)
    {
        return (left == 1 ? "|" : " ") + (central == 1 ? "_" : " ") + (right == 1 ? "|" : " ");
    }
}
