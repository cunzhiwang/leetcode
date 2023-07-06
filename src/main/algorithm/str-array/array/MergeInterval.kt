package main.algorithm.`str-array`

/**
 * 合并区间
 */
fun merge(intervals: Array<IntArray>): Array<IntArray> {
    if (intervals.isEmpty()) return intervals
    // 1、对二维数组按照第一列升序排序
    intervals.sortBy { it[0] }
    // 2、进行合并数组
    val list = mutableListOf<IntArray>()
    var term = intervals[0] // 临时空间，1 判断是否需要合并集合，2 是否放入结果集
    for (i in 1 until intervals.size) {
        if (term[1] >= intervals[i][0]) {
            term[1] = term[1].coerceAtLeast(intervals[i][1])
        } else {
            list.add(term)
            term = intervals[i]
        }
    }
    list.add(term)
    return list.toTypedArray()
}

fun main() {
    val intervals = arrayOf(
        intArrayOf(1, 3),
        intArrayOf(2, 6),
        intArrayOf(8, 10),
        intArrayOf(15, 18)
    )
    println(merge(intervals)[0][0])
}