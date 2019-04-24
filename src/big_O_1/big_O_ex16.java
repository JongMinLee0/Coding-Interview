package big_O_1;

public class big_O_ex16 {
	// 1과 n을 포함하여 그 사이에 있는 모든 2의 승수(powers of 2)를 출력하는 함수
	
	int powersOf2(int n) {
		if (n<1) {
			return 0;
		}else if(n==1) {
			return 1;
		}else {
			int prev = powersOf2(n/2);
			int curr = prev * 2;
			System.out.println(curr);
			return curr;
		}
	}
}






/*
수행 시간은 n이 1이 될 때까지 2로 나누는 횟수가 된다. 따라서 n을 절반씩 나누는
함수의 수행 시간은 O(logn)과 같다.

다른풀이)n이 커질 수록 수행시간의 변화를 살펴볼 것.(big-O가 의미하는 바와 동일)
n이 2배가 될때마다 함수의 호출 횟수는 한 번증가. 따라서 2^x=n에서 x
x = logn
*/
