package big_O_1;

public class big_O_ex2 {
     // 아래 코드의 시간 복잡도는 어떻게 되는가?
	
	void printPairs(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				System.out.println(array[i] + ", " + array[j]);
			}
		}
	}
}









/*  정답 : O(N^2)

안쪽 루프의 반복 횟수는 O(N)이고 이 루프가 N번 반복된다. 따라서 총 수행 시간은 O(N^2)이 된다.

*/