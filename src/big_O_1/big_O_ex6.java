package big_O_1;

public class big_O_ex6 {
	
	// 아래 코드의 시간 복잡도는 어떻게 될까?
	void reverse(int[] array) {
		for(int i = 0; i < array.length / 2; i++) {
			int other = array.length -i -1;
			int temp = array[i];
			array[i] = array[other];
			array[other] = temp;
		}
	}
}





/*
알고리즘은 O(N) 시간에 동작한다. 
배열의 절반만 살펴본다고 해서(즉, 반복횟수가 절반이라고 해서) big-O시간에 영향을 끼치는 것은 아니다.
*/