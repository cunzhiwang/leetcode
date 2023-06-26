package main.algorithm.`str-array`

/**
 * 旋转矩阵
 */
fun rotate(matrix: Array<IntArray>) {
    val n = matrix.size

    // 沿着主对角线翻转矩阵
    for (i in 0 until n) {
        for (j in i + 1 until n) {
            val temp = matrix[i][j]
            matrix[i][j] = matrix[j][i]
            matrix[j][i] = temp
        }
    }

    // 左右翻转矩阵
    for (i in 0 until n) {
        for (j in 0 until n / 2) {
            val temp = matrix[i][j]
            matrix[i][j] = matrix[i][n - j - 1]
            matrix[i][n - j - 1] = temp
        }
    }
}

fun main() {
    val intervals = arrayOf(
        intArrayOf(1, 3),
        intArrayOf(2, 6),
        intArrayOf(8, 10),
        intArrayOf(15, 18)
    )
    println(rotate(intervals))
}