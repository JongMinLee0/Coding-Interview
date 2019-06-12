package array_string_1;

/*
이미지를 표현하는 N x N 행렬이 있다. 이미지의 각 픽셀은 4바이트로 표현된다. 이 때 이미지를 90도 회전시키는 메서드를 작성한다.
행렬을 추가로 사용하지 않고서도 할 수 있는가?
*/
public class Array_string_exerciese7 {

	public static void main(String[] args) {
		String[][] img = { { " ", "*", " ", "*", " " }, { "*", "*", " ", "*", "*" }, { "*", "*", "*", "*", "*" },
				{ "*", "*", " ", "*", "*" }, { " ", "*", " ", "*", " " } };
		printMethod(img);
		roTate(img);
		printMethod(img);
	}

	public static void roTate(String[][] matrix) {
		// 횟수마다 시작 위치를 다르게 하기 위해서 밖에서 반복문 변수 지정
		int count = 0;
		int k = 0;
		int len = matrix.length - 1;
		int bottom = len; // 4
		// matrix[i].length = 5;
		for (int i = 0; i < matrix[i].length / 2; i++) {
			int offset = matrix.length - i - 1;
			for (; k < len; k++) {
				int offset2 = matrix.length - 1 - k;

				// 위에 있는 변수 저장
				String st = matrix[i][k];

				// 왼쪽에서 위
				matrix[i][k] = matrix[offset2][i];
				// 밑에서 왼쪽
				matrix[offset2][i] = matrix[offset][offset2];

				// 오른쪽에서 밑
				matrix[offset][offset2] = matrix[k][offset];

				// 오른쪽에 저장된 변수 저장
				matrix[k][offset] = st;
			}
			
			k = 0;
			count++;
			k += count;
			len--;
		}
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
/*
 * 뒤집기 전의 출력
 * * 
** **
*****
** **
 * * 

뒤집은 후 출력
 *** 
*****
  *  
*****
 *** 

 * 
 * 
 * 
 */