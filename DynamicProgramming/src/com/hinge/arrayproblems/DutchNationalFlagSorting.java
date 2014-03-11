package com.hinge.arrayproblems;

public class DutchNationalFlagSorting<T>
{
    public T[] sort(T[] array, T low, T middle, T high)
    {
        int lo = 0, mid = 0;
        int hi = array.length - 1;
        while (mid <= hi)
        {
            if (array[mid] == low)
            {
                // swap lo and mid
                swap(array, lo, mid);
                lo++;
                mid++;
            }
            else if (array[mid] == middle)
            {
                mid++;
            }
            else if (array[mid] == high)
            {
                swap(array, mid, hi);
                hi--;
            }
            else
            {
                throw new IllegalArgumentException("bad partitions passed: low: " + low + " mid: " + middle + " high: " + high);
            }
        }
        return array;
    }

    private void swap(T[] array, int index1, int index2)
    {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
