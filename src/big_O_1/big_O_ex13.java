package big_O_1;

public class big_O_ex13 {
	
	// N번 째 피보나치 수(Fibonacci number)를 구하는 코드이다.
	int fib(int n) {
		if(n<=0) return 0;
		else if (n==1) return 1;
		return fib(n-1) + fib(n-2);
	}
}







/*
재귀 호출의 패턴을 이용하면 O(분기^깊이)가 된다.
각 호출 마다 분기가 2개 존재하므로 깊이가 N일 때 수행 시간은 O(2^N)이 된다.
*/