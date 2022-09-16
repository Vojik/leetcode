package com.vojik.solutions

import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test

internal class Solution_2007Test {

    @Test
    fun test1_whenSolution1() {
        val actual = Solution_2007().findOriginalArray(intArrayOf(1, 3, 4, 2, 6, 8))
        assertArrayEquals(intArrayOf(1, 3, 4), actual)
    }

    @Test
    fun test2_whenSolution1() {
        val actual = Solution_2007().findOriginalArray(intArrayOf(6, 3, 0, 1))
        assertArrayEquals(intArrayOf(), actual)
    }

    @Test
    fun test3_whenSolution1() {
        val actual = Solution_2007().findOriginalArray(intArrayOf(1))
        assertArrayEquals(intArrayOf(), actual)
    }
}