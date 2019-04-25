package big_O_2;

public class big_O_solution4 {

	// 자연수 나눗셈을 수행하는 코드이다. 수행시간을 구하시오.
	// 단 a와 b는 모두 양의 정수이다.
	int div(int a, int b) {
		int count = 0;
		int sum = b;
		while (sum <= a) {
			sum += b;
			count++;
		}
		return count;
	}
}






/*
O(a/b), 변수 count의 값은 정확이 a/b가 된다. while 루프는 count의 값만큼 반복하므로 정확히 a/b번 반복한다.
*/