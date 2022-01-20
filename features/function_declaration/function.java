
public class Main implements Callable{
	public List<Integer> calculateStatistics(List<Integer> scores) {
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
	
	public boolean hasAnyMatches(List<Integer> list,  Callable condition) {
		for (int item in list) {
			if (condition.lessThanTen(item)) {
				return true;
			}
		}
		return false;
	}
	
	public static void main (String[] args) {
		Main m = new Main();
		var statistics = m.calculateStatistics([5, 3, 100, 3, 9]);
		System.out.println(statistics[2]);
		System.out.println(statistics[1]);
		
		List<Integer> numbers = new List<Integer>([20, 19, 7, 12]);
		Callable call = new Condition();
		m.hasAnyMatches(numbers, call);
	}
	
}

interface Callable {
	public boolean lessThanTen(int number);
}

class Condition implements Callable {
	public boolean lessThanTen(int number) {
		return number < 10;
	}
}