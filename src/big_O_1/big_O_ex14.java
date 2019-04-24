package big_O_1;

public class big_O_ex14 {
	
	// 0부터 n까지 피보나치 수열 전부를 출력하는 코드이다. 
	// 이 코드의 시간 복잡도는 무엇일까?
	
	void allFib(int n) {
		for (int i =0; i < n; i++) {
			System.out.println(i + ": " + fib(i));
		}
	}
	int fib(int n) {
		if (n <= 0) return 0;
		else if (n==1) return 1;
		return fib(n-1) + fib(n-2);
	}
}






/*
fib(n)이 O(2^n) 걸리고 총 n번 호출되므로, O(n2^n) 으로 성급히 결론지으려 할 수 있다. (나도 그랬다./ 신중해야 한다.)

바로 위 논리의 잘못된 점은 n이 변한다는 것이다. 물론 fib(n)은 O(2^n)이 걸리지만 n번의 호출이 모두 다른 n을 사용하므로 이를 반영해서 계산하는 것이
중요하다. 따라서 총 걸린 시간은 2^1+2^2+2^3....+2^n과 같다. 즉, 여전히 O(2^n)이다.
*/
