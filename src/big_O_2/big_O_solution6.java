package big_O_2;

public class big_O_solution6 {
	// 자연수의 제곱근을 구하는 코드이다. 수행 시간을 구하시오.
	int sqrt(int n) {
		for (int guess = 1; guess * guess <= n; guess++) {
			if (guess * guess == n) {
				return guess;
			}
		}
		return -1;
	}
}






/*
O(루트n), guess * guess > n 이 되면 그냥 루프를 멈춘다. 
*/