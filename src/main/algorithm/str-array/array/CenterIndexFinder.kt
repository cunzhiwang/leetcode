package main.algorithm.`str-array`

import java.util.*

/**
 * 寻找数据中心索引
 */
class CenterIndexFinder {
    fun pivotIndex(nums: IntArray): Int {
        val total = Arrays.stream(nums).sum()
        var sum = 0;
        for (i: Int in nums.indices) {
            if (2 * sum + nums[i] == total) {
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }
}

fun main() {
    println(CenterIndexFinder().pivotIndex(intArrayOf(2, 1, -1)))
}