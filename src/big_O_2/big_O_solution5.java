package big_O_2;

public class big_O_solution5 {

	// 자연수의 제곱근을 구하는 코드이다.
	// 제곱근이 자연수가 아닐 때 완전제곱이 아니라면 -1을 반환한다.
	// n이 100이라면 먼저 50을 의심해본다. 50이 너무크다면 그보다 작은 숫자로 시도해본다.

	int sqrt(int n) {
		return sqrt_helper(n, 1, n);
	}

	int sqrt_helper(int n, int min, int max) {
		if (max < min)
			return -1; // 제곱근이 없다.
		int guess = (min + max) / 2;
		if (guess * guess == n) {// 찾았다!!
			return guess;
		} else if (guess * guess < n) {// 너무작다
			return sqrt_helper(n, guess + 1, max); // 더 큰 값으로 시도
		} else { // 너무 크다
			return sqrt_helper(n, min, guess - 1); // 더 작은 값으로 시도
		}
	}
}





/*
 O(logn), 제곱근을 찾기 위해 기본적으로 이진 탐색을 사용한다. 
따라서 수행시간은 O(logn)이다.
 */








/*
O(logn), 제곱근을 찾기 위해 기본적으로 이진 탐색을 사용한다. 따라서 수행시간은 O(logn)
 */
