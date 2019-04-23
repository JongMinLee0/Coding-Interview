package big_O_1;

public class big_O_ex1 {
	
	// 아래 코드의 시간 복잡도는 어떻게 되는가?
	void foo(int[] array) {
		int sum = 0;
		int product = 1;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		for(int i = 0; i < array.length; i++) {
			product *= array[i];
		}
		System.out.println(sum + ", " + product);
	}
}








/* 정답 : O(N)
배열을 한 번 읽든 두 번 읽든 big-O시간을 구할 때 아무런 영향도 주지 않는다.
*/