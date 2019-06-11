package array_string_1;

/*
행렬을 90도로 회전시킬 것이므로, 가장 간단한 방법은 레이어별로 회전하도록 구현하는 것이다.
가장 효율적인 방법은 인덱스 별로 교체작업을 수행하는 것이다.
제일 바깥쪽 레이어부터 안쪽으로 진행해 가면서 작업을 수행한다.
*/

/*
 이 방법은 O(n^2)이다. 적어도 n^2개의 원소를 모두 건드려봐야 하기 때문에 최선의 방법이라 할 수 있다.
 */
public class Array_string_solution7 {

	public static void main(String[] args) {
		String[][] img = { { " ", "*", "*", "*", " " }, { "*", "*", " ", "*", "*" }, { "*", "*", "*", "*", "*" },
				{ "*", "*", " ", "*", "*" }, { " ", "*", "*", "*", " " } };
		// printMethod(img);
		roTate(img);
		printMethod(img);
	}

	public static boolean roTate(String[][] matrix) {
		if (matrix.length == 0 || matrix.length != matrix[0].length)
			return false;
		int n = matrix.length;
		for (int layer = 0; layer < n / 2; layer++) {
			int first = layer;
			int last = n - 1 - layer;
			for (int i = first; i < last; i++) {
				int offset = 1 - first;
				String top = matrix[first][i]; // 윗 부분을 저장해 놓는다.

				// 왼쪽 -> 위쪽
				matrix[first][i] = matrix[last - offset][first];

				// 아래쪽 -> 왼쪽
				matrix[last - offset][first] = matrix[last][last - offset];

				// 오른쪽 -> 아래쪽
				matrix[last][last - offset] = matrix[i][last];

				// 위쪽 -> 오른쪽
				matrix[i][last] = top; // 오른쪽 <- 미리 저장해 놓은 top
			}
		}

		return true;
	}

	// 이미지를 출력해주는 메소드
	public static void printMethod(String[][] img) {
		for (int i = 0; i < img.length; i++) {
			for (int k = 0; k < img[i].length; k++) {
				System.out.print(img[i][k]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
