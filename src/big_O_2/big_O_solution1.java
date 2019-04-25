package big_O_2;

public class big_O_solution1 {

	// 다음은 a와 b를 곱하는 코드이다. 수행 시간을 구하시오.
	int product(int a, int b) {
		int sum = 0;
		for (int i = 0; i < b; i++) {
			sum += a;
		}
		return sum;
	}
}








/*
O(b), for루프가 b번 반복한다.
*/