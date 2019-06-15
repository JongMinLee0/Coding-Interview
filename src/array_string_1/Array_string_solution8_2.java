package array_string_1;

public class Array_string_solution8_2 {

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

	// 행을 이용한 코드이다.
	// 첫 번째 행을 row배열로, 첫 번째 열을 column배열로 사용하면 공간 효율을 0(1)로 낮출 수 있다.
	
	public static void setZeros(int[][] matrix) {
		boolean rowHasZero = false;
		boolean colHasZero = false;

		// 첫 번째 행에 0이 있는지 확인
		for (int i = 0; i < matrix[0].length; i++) {
			if (matrix[0][i] == 0) {
				rowHasZero = true;
				break;
			}
		}

		// 첫 번째 열에 0이 있는지 확인
		for (int k = 0; k < matrix.length; k++) {
			if (matrix[k][0] == 0) {
				colHasZero = true;
				break;
			}
		}

		// 나머지 배열에 0이 있는지 확인
		for (int i = 1; i < matrix.length; i++) {
			for (int k = 1; k < matrix[0].length; k++) {
				if (matrix[i][k] == 0) {
					matrix[i][0] = 0;
					matrix[k][0] = 0;
				}
			}
		}

		// 첫 번째 열을 이용해서 행을 0으로 바꾼다.
		for (int i = 1; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				nullifyRow(matrix, i);
			}
		}

		// 첫 번째 행을 이용해서 열을 0으로 바꾼다.
		for (int k = 1; k < matrix[0].length; k++) {
			if (matrix[0][k] == 0) {
				nullifyColumn(matrix, 0);
			}
		}

		// 첫 번째 행을 0으로 바꾼다.
		if (rowHasZero)
			nullifyRow(matrix, 0);

		// 첫 번째 열을 0으로 바꾼다.
		if (colHasZero)
			nullifyColumn(matrix, 0);

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
