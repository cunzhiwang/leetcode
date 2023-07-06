/**
 * 搜索插入坐标
 * 以数组 intervals 表示若干个区间的集合，其中单个区间为
 * intervals[i] = [starti, endi] 。请你合并所有重叠的区间，
 * 并返回 一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间
 */
class SearchInsertPosition {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var index=0
        for (i in nums.indices) {
            if(index!=nums.size-1&&nums[index]>=target) return index
            index = if (nums[i] >= target) {
                i
            }else{
                i+1
            }
        }

        return index
    }

}

fun main() {
    println(SearchInsertPosition().searchInsert(intArrayOf(1,3,5,6),5))

}