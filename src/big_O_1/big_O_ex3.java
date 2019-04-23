package big_O_1;

public class big_O_ex3 {
	
	// 아래 코드의 시간 복잡도는 어떻게 되는가?
	void printUnorderedPairs(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			for(int j = i + 1; j < array.length; j++) {
				System.out.println(array[i] + ", " + array[j]);
			}
		}
	}
}








/* 정답 : O(N^2)
단순 패턴이 아닌 여러가지 방법으로 구해 보아야 한다.

1. 반복 횟수 세어 보기
처음에 j는 N-1번 그 다음에는 N-2, N-3....번 반복한다.
따라서 총 반복 횟수는
(N-1) + (N-2) + ... + 2 + 1
1에서 부터 N-1까지의 합은 N(N-1)/2 이므로 O(N^2)이 된다.

나머지 방법은 책을 참고 할 것.(p72)

*/