package big_O_2;

public class big_O_solution3 {

	// a%b를 계산하는 코드이다. 수행 시간을 구하시오
	int mod(int a, int b) {
		if (b <= 0) {
			return -1;
		}
		int div = a / b;
		return a - div * b;
	}
}







/*
O(1), 상수 시간에 동작한다.
*/