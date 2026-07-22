package com.wipro.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.wipro.task2.DailyTask2;

public class TestCheckPresence {

    @Test
    public void testCheckPresence() {

        DailyTask2 obj = new DailyTask2();

        int[] arr = {5,2,8,1,3};

        assertTrue(obj.checkPresence(arr,8));

        assertFalse(obj.checkPresence(arr,10));
    }
}