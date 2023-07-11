package main.algorithm.`str-array`.string

/**
 * 翻转字符串里的单词
 * 输入：s = "the sky is blue"
 * 输出："blue is sky the"
 */
fun reverseWords(s: String): String {
    // 去掉左右空格
    val trim = s.trim()
    val splitStr: List<String> = trim.split(" ")

    val stringBuilder = StringBuilder()
    for (i in splitStr.reversed()){
        if(" " != i&&""!=i) {
            stringBuilder.append(i.trim())
            stringBuilder.append(" ")
        }
    }
        return stringBuilder.toString().trim()
}

fun main() {
    println(reverseWords("a good   example"))

}