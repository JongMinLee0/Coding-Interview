package array_string_1;

public class Array_string_solution8 {

	public static void main(String[] args) {
		int[][] zeroArray = { { 1, 2, 3 }, { 4, 5, 0 }, { 7, 8, 9 } };

		// 메소드 호출
		setZeros(zeroArray);
		// 확인을 위한 출력
		for (int i = 0; i < zeroArray.length; i++) {
			for (int k = 0; k < zeroArray[i].length; k++) {
				System.out.print(zeroArray[i][k] + " ");
			}
			System.out.println();
		}
	}

	// 아래 알고리즘은 0 있는 행과 열을 기록하기 위해 2개의 배열을 사용했다.
	// 그 뒤 이 배열의 값에 따라서 행과 열을 전부 0으로 바꾸었다. 이 알고리즘의 공간복잡도는 O(N)이다.
	public static void setZeros(int[][] matrix) {
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];

		// 값이 0인 행과 열의 인덱스를 저장한다.
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					row[i] = true;
					column[j] = true;
				}
			}
		}

		// 행의 원소를 전부 0으로 바꾼다.
		for (int i = 0; i < row.length; i++) {
			if (row[i])
				nullifyRow(matrix, i);
		}

		// 열의 원소를 전부 0으로 바꾼다.
		for (int k = 0; k < column.length; k++) {
			if (column[k])
				nullifyColumn(matrix, k);
		}
	}

	public static void nullifyRow(int[][] matrix, int row) {
		for (int i = 0; i < matrix[0].length; i++)
			matrix[row][i] = 0;
	}

	public static void nullifyColumn(int[][] matrix, int col) {
		for (int i = 0; i < matrix.length; i++)
			matrix[i][col] = 0;
	}

}
