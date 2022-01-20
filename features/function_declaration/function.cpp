
vector<int> calculateStatistics(vector<int> scores) {
	var min = scores[0];
	var max = scores[0];
	var sum = 0;

	for (int i = 0; i < scores.size(); i++) {
		if(scores[i] > max) {
			max = scores[i];
		} else if (scores[i] < min) {
			min = scores[i];
		}
		sum += scores[i];
	}

	return [min, max, sum];
}
	
bool hasAnyMatches(vector<int> list,  bool (*condition)(int)) {
	
	for (int i = 0; i < list.size(); i++) {
		if (condition(list[i])) {
			return true;
		}
	}
	return false;
}
	

bool lessThanTen(int number) {
	return number < 10;
}


int main() {
	vector<int> statistics = m.calculateStatistics(vect{5, 3, 100, 3, 9});
	cout << statistics[2] << endl;
	cout << statistics[1] << endl;
	
	vector<int> numbers =  vect{20, 19, 7, 12};
	hasAnyMatches(numbers, &lessThanTen);
	
	return 0;
}