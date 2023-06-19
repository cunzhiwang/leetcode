/**
 * 搜索插入坐标
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