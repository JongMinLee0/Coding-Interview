package array_string_1;

// M X M 행렬의 한 원소가 0일 경우, 해당 원소가 속한 행과 열의 모든 원소를 0으로 설정하는 알고리즘을 작성하라.

public class Array_string_exercise8 {

	public static void main(String[] args) {
		int[][] zeroArray = { { 1, 2, 3 }, { 4, 5, 0 }, { 7, 8, 9 } };

		// 메소드 호출
		findZero(zeroArray);
		// 확인을 위한 출력
		for (int i = 0; i < zeroArray.length; i++) {
			for (int k = 0; k < zeroArray[i].length; k++) {
				System.out.print(zeroArray[i][k] + " ");
			}
			System.out.println();
		}
	}

	// 먼저 배열을 돌며 0을 찾는다.
	// 찾은 원소의 인덱스를 바탕으로 모두 0으로 바꿔준다.
	public static void findZero(int[][] zeroArray) {
		int xIndex = 0;
		int yIndex = 0;

		// 0이 존재하는 배열의 인덱스를 찾아 저장
		zero: for (int i = 0; i < zeroArray.length; i++) {
			for (int k = 0; k < zeroArray[i].length; k++) {
				if (zeroArray[i][k] == 0) {
					xIndex = i;
					yIndex = k;
					break zero;
				}
			}
		}

		// 0이 존재하는 행과 열을 모두 0으로 변경
		for (int i = 0; i < zeroArray.length; i++) {
			zeroArray[xIndex][i] = 0;
			zeroArray[i][yIndex] = 0;
		}

	}
}
