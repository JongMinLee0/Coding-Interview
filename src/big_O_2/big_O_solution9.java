package big_O_2;

public class big_O_solution9 {

	/*
	 * 배열에 새로운 값을 추가할 때마다 더 크기가 큰 배열을 새로 만든뒤 해당 배열을 반환하는 함수이다. 배열을 복사하는데 걸리는 시간을
	 * 구하시오.
	 */
	int[] copyArray(int[] array) {
		int[] copy = new int[0];
		for (int value : array) {
			copy = appendToNew(copy, value);
		}
		return copy;
	}

	int[] appendToNew(int[] array, int value) {
		// copy all elements over to new array
		int[] bigger = new int[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			bigger[i] = array[i];
		}
		// 새로운 원소 추가
		bigger[bigger.length - 1] = value;
		return bigger;
	}
}





/*
O(n^2), 여기서 n은 배열에 있는 원소 개수와 같다. appendToNew를 처음 호출 하면 원소 한 개를 복사한다.
두 번째에는 두 개를, 세 번째에는 세 개를 복사하고 이 과정이 반복된다. 따라서 총 수행 시간은 1부터 n까지의 합과 같으므로
O(n^2)이다.
*/