package big_O_1;

public class big_O_ex10 {
	// 다음 함수의 시간 복잡도는 얼마인가?
	
	boolean isPrime(int n) {
		for(int x = 2; x*x <= n; x++) {
			if(n%x==0) {
				return false;
			}
		}
		return true;
	}
}
// 위의 함수는 현재의 값보다 작은 수들로 나누어 봄으로써 소수인지를 판별하는 함수이다.
// n의 제곱근까지만 확인하는 함수이다.



/*
for루프의 내부 코드는 상수 시간에 동작한다. 따라서 최악의 경우에 for루프가 몇 번 반복하는지만 세어 보면 된다.
루프는 x=2부터 x*x=n까지 반복한다. 따라서 x=루트n(x가 n의 제곱근이 될 때까지) 반복한다.
즉, 시간 복잡도는 O(루트n)이다.

*/