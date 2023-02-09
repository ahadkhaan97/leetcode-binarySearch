fun main() {
    print(search(intArrayOf(-1, 0, 3, 5, 9, 12), 9))
    print(binarySearch(intArrayOf(-1, 0, 3, 5, 9, 12), 9))
}

fun search(nums: IntArray, target: Int): Int {
    return nums.indexOf(target)
}

@Suppress("KotlinConstantConditions")
fun binarySearch(nums: IntArray, target: Int): Int {
    var first = 0
    var last = nums.size - 1
    var mid: Int = (first + last) / 2
    while (first <= last) {
        if (nums[mid] < target) {
            first = mid + 1
        } else if (nums[mid] == target) {
            return mid
        } else {
            last = mid - 1
        }
        mid = (first + last) / 2
    }
    return if (first > last) {
        -1
    } else {
        mid
    }
}