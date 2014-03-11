package com.hinge.arrayproblems;

import org.junit.Assert;
import org.junit.Test;

public class DutchNationalFlagSortingTest
{
    @Test
    public void test()
    {
        DutchNationalFlagSorting<Integer> sorter = new DutchNationalFlagSorting<Integer>();
        Integer[] sortedArray = sorter.sort(new Integer[] { 0, 0, 1, 2, 2, 0, 1, 2 }, 0, 1, 2);
        Assert.assertTrue(isSorted(sortedArray));
    }

    private boolean isSorted(Integer array[])
    {
        for (int i = 0; i < array.length - 1; i++)
        {
            if (array[i] > array[i + 1])
                return false;
        }
        return true;
    }
}
