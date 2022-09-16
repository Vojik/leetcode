package com.vojik.solutions

class Solution_2007 {

    fun findOriginalArray(changed: IntArray): IntArray {
        if (changed.size % 2 != 0) return IntArray(0)

        val map = mutableMapOf<Int, Int>()
        changed.forEach { map[it] = map.getOrDefault(it, 0) + 1 }

        val result = IntArray(changed.size / 2) { 0 }
        var idx = 0

        changed.sorted().forEach { num ->
            if (map[num]!! > 0) {
                map[num] = map[num]!! - 1

                if ((map[num * 2] ?: 0) > 0) {
                    result[idx++] = num
                    map[num * 2] = map[num * 2]!! - 1;
                } else {
                    return IntArray(0)
                }
            }
        }
        return result
    }
}