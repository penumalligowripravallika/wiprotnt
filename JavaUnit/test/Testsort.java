package com.wipro.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.wipro.task.DailyTask;

public class Testsort {

    @Test
    public void testSortValues() {

        DailyTask obj = new DailyTask();

        int[] actual = obj.sortValues(new int[] {5,2,8,1,3});

        int[] expected = {1,2,3,5,8};

        assertArrayEquals(expected, actual);
    }
}
