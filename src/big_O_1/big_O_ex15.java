package big_O_1;

public class big_O_ex15 {
	// 다음은 피보나치 수열을 0부터 n까지 모두 출력하는 코드이다.
	//그러나 전과는 다르게 이전에 계산된 결과값을 정수 배열에 저장(즉, 캐시)한다.
	//알고리즘에 이미 저장된 값이 있다면 그 캐시값을 반환한다. 수행시간은 어떻게 되겠는가?
	
	void allFib(int n) {
		int[] memo = new int[n+1];
		for(int i=0; i < n; i++) {
			System.out.println(i + ": " + fib(i, memo));
		}
	}
	
	int fib(int n, int[] memo) {
		if (n <= 0) return 0;
		else if (n==1) return 1;
		else if (memo[n]>0) return memo[n];
		memo[n] = fib(n-1, memo) + fib(n-2, memo);
		return memo[n];
	}
}







/*
알고리즘의 각 단계를 하나씩 집어보자. i=0부터...
fib(i)를 호출할 때마다 fib(i-1)과 fib(i-2)의 계산은 이미 끝나 있고 그 값은 캐시 배열에 저장되어 있을 것이다.
따라서 단순히 캐시값을 찾아서 더한 뒤 그 결과를 캐시 배열에 다시 저장하고 반환해주기만 하면 된다. 이 일련의 과정은
상수시간 안에 동작한다. 상수 시간의 일을 N번 반복하므로 총 O(N) 시간이 걸린다.
=> 메모이제이션(memoization)
*/
