fun calculateStatistics(scores: Array<Int>) : Triple(Int, Int, Int) {
    var min = scores[0]
    var max = scores[0]
    var sum = 0

    for(score in scores) {
        if(score > max) {
            max = score
        } else if (score < min) {
            min = score
        }
        sum += score
    }

    return Triple(min, max, sum)
}
val statistics = calculateStatistics(arrayOf(5, 3, 100, 3, 9))
println(statistics.sum)
println(statistics.2)

fun hasAnyMatches(list: List<Int>, condition: (Int) -> Bool) : Bool {
    for (item in list) {
        if (condition(item)) {
            return true
        }
    }
    return false
}
func lessThanTen(number: Int) : Bool {
    return number < 10
}
var numbers = listOf(20, 19, 7, 12)
hasAnyMatches(numbers, lessThanTen)