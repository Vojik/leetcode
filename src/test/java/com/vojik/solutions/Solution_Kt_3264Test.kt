package com.vojik.solutions

import org.junit.jupiter.api.Assertions.assertArrayEquals

import org.junit.jupiter.api.Test

class Solution_Kt_3264Test {

    @Test
    fun test1_whenSolution1() {
        assertArrayEquals(
            intArrayOf(8, 4, 6, 5, 6),
            Solution_3264().getFinalState(intArrayOf(2, 1, 3, 5, 6), 5, 2)
        )
    }

    @Test
    fun test2_whenSolution1() {
        assertArrayEquals(
            intArrayOf(16, 8),
            Solution_3264().getFinalState(intArrayOf(1, 2), 3, 4)
        )
    }

    @Test
    fun test1_whenSolution2() {
        assertArrayEquals(
            intArrayOf(8, 4, 6, 5, 6),
            SolutionKt_3264().getFinalState(intArrayOf(2, 1, 3, 5, 6), 5, 2)
        )
    }

    @Test
    fun test2_whenSolution2() {
        assertArrayEquals(
            intArrayOf(16, 8),
            SolutionKt_3264().getFinalState(intArrayOf(1, 2), 3, 4)
        )
    }
}