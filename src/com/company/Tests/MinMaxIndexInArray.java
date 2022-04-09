package com.company.Tests;

// Мин. и макс. индекс элемента в отсортированном массиве
public class MinMaxIndexInArray {
    public int[] test(int[] range, int target)
    {
        int leftIndex = findIndexLeft(range, target);

        int rigthIndex = findIndexRight(range, target);

        return new int[]{leftIndex, rigthIndex};
    }

    private int findIndexLeft(int[] range, int target)
    {
        for (int i=0; i<range.length; i++ )
        {
            if(range[i]== target)
                return i;
        }

        return -1;
    }

    private int findIndexRight(int[] range, int target)
    {
        for (int i=range.length-1; i>-1; i-- )
        {
            if(range[i]== target)
                return i;
        }

        return -1;
    }
}