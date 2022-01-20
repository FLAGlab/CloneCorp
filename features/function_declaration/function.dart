List<int> calculateStatistics(List<int> scores) {
    var min = scores[0];
    var max = scores[0];
    var sum = 0;

    for(int score in scores) {
        if(score > max) {
            max = score;
        } else if (score < min) {
            min = score;
        }
        sum += score;
    }

    return [min, max, sum];
}
var statistics = calculateStatistics([5, 3, 100, 3, 9]);
print(statistics[2]);
print(statistics[1]);

bool hasAnyMatches(List<int> list,  Function(int)) {
    for (int item in list) {
        if (condition(item)) {
            return true;
        }
    }
    return false;
}
bool lessThanTen(int number) {
    return number < 10;
}
var numbers = [20, 19, 7, 12];
hasAnyMatches(numbers, lessThanTen)