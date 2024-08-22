package com.vojik.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class Solution_35Test {

    @Test
    public void test1_whenSolution1() {
        assertEquals(2, new Solution_35().searchInsert(new int[]{1,3,5,6}, 5));
    }

    @Test
    public void test1_whenSolution2() {
        assertEquals(1, new Solution_35().searchInsert(new int[]{1,3,5,6}, 2));
    }

    @Test
    public void test1_whenSolution3() {
        assertEquals(4, new Solution_35().searchInsert(new int[]{1,3,5,6}, 7));
    }

    @Test
    public void test1_whenSolution4() {
        assertEquals(6, new Solution_35().searchInsert(new int[]{1,3,5,6,8,9,66}, 45));
    }
}