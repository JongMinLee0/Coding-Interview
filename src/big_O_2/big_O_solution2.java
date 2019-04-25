package big_O_2;

public class big_O_solution2 {

	// a^b를 계산하는 코드이다. 수행 시간을 구하시오.
	int power(int a, int b) {
		if (b < 0) {
			return 0; // 에러
		} else if (b == 0) {
			return 1;
		} else {
			return a * power(a, b - 1);
		}
	}
}








/*
O(b), 재귀호출을 한 번 할 때마다 1씩 줄어들므로 b번 반복된다.
*/