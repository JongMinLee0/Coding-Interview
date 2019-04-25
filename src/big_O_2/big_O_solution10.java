package big_O_2;

public class big_O_solution10 {

	// 숫자의 각 자릿수를 합하는 코드이다. 수행시간을 구하라.
	int sumDigits(int n) {
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
}








/*
O(logn), 수행 시간은 자릿수의 개수와 같다. 자릿수의 개수가 d라면 해당 숫자는 아무리 커도 10^d보다 작을 수 밖에 없다.
만약 n=10^d라면 d = logn이 되고 따라서 수행시간은 O(logn)이다.
*/