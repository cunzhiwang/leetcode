package algorithm.`str-array`.string

/**
 * 最长公共前缀
 * 输入：strs = ["flower","flow","flight"] 输出："fl"
 * @author cunzhiwang
 * @Date 2023/7/6 11:00
 */
fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) return ""
    var prefix = strs[0]
    for (i in 1 until strs.size) {
        while (strs[i].indexOf(prefix) != 0) {
            prefix = prefix.substring(0, prefix.length - 1)
            if (prefix.isEmpty()) return ""
        }
    }
    return prefix
}
fun main() {
    longestCommonPrefix(arrayOf(""))
}