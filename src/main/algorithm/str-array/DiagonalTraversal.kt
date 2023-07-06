package main.algorithm.`str-array`

/**
 * 对角线遍历
 * 定义变量 row 和 col 表示当前遍历到的行和列，初始值为 0
 * 定义变量 d 表示遍历方向，初始值为 1，表示向右上方遍历
 */
fun findDiagonalOrder(mat: Array<IntArray>): IntArray {
    if (mat.isEmpty() || mat[0].isEmpty()) {
        return intArrayOf()
    }

    val m = mat.size
    val n = mat[0].size
    val result = IntArray(m * n)
    var row = 0
    var col = 0
    var d = 1

    for (i in result.indices) {
        result[i] = mat[row][col]
        // 左上角遍历
        row -= d
        col += d


        if (row < 0) {
            row = 0
            d = -d
        }
        if (col < 0) {
            col = 0
            d = -d
        }
        // 判断是否超出边界
        if (row >= m) {
            row = m - 1
            col += 2
            d = -d
        }
        if (col >= n) {
            col = n - 1
            row += 2
            d = -d
        }
    }

    return result

}
fun main() {

}