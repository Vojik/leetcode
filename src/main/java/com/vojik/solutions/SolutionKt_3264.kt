package com.vojik.solutions

import java.util.*

class SolutionKt_3264 {

    fun getFinalState(nums: IntArray, k: Int, multiplier: Int): IntArray {
        val minHeap = PriorityQueue<Pair<Int, Int>>(compareBy({ it.first }, { it.second }))
        nums.forEachIndexed { index, value ->
            minHeap.add(Pair(value, index))
        }

        repeat(k) {
            val (value, idx) = minHeap.poll()
            nums[idx] = value * multiplier
            minHeap.add(Pair(nums[idx], idx))
        }
        return nums
    }
}