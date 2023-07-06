package main.algorithm.`str-array`

/**
 * 零矩阵
 */
fun setZeroes(matrix: Array<IntArray>): Unit {
    val rows = matrix.size
    val cols = matrix[0].size
    val rowSet = mutableSetOf<Int>()
    val colSet = mutableSetOf<Int>()

    // 找出需要清零的行和列
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            if (matrix[i][j] == 0) {
                rowSet.add(i)
                colSet.add(j)
            }
        }
    }

    // 清零行
    for (row in rowSet) {
        for (j in 0 until cols) {
            matrix[row][j] = 0
        }
    }

    // 清零列
    for (col in colSet) {
        for (i in 0 until rows) {
            matrix[i][col] = 0
        }
    }
}
fun main() {
    val matrix = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 0, 6),
        intArrayOf(7, 8, 9)
    )
    println("Original matrix:")
    printMatrix(matrix)

    setZeroes(matrix)
    println("Zero matrix:")
    printMatrix(matrix)
}

fun printMatrix(matrix: Array<IntArray>) {
    for (row in matrix) {
        println(row.joinToString(" "))
    }
}

