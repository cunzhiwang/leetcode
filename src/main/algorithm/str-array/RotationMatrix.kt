package main.algorithm.`str-array`

/**
 * 旋转矩阵
 * [i][j]转换后为【j】【n-i-1】,其实就是把第一行转为倒数第一列，第二行转为倒数第二列
 */
fun rotate(matrix: Array<IntArray>) {
    val n = matrix.size
    val afterMatrix :Array<IntArray> = Array(n) { IntArray(n) { 0 } }

    // 转换
    for (i in matrix.indices) {
        for (j in matrix[0].indices) {
            afterMatrix[j][n-i-1] = matrix[i][j]
        }
    }

    for (i in matrix.indices) {
        for (j in matrix[0].indices) {
            matrix[i][j] = afterMatrix[i][j]
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