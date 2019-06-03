package array_string_1;

public class Array_string_solution6_2 {

	public static void main(String[] args) {
		System.out.println(compress("aaabbccaa"));
		System.out.println(compress("abcaad"));
		System.out.println(compress("abbccsa"));
	}

	/*
	 * 앞의 두 방법 모두 압축된 문자열을 먼저 만든 뒤 압축된 문자열과 입력 문자열 중 길이가 작은 문자열을 반환한다. 하지만 길이를 먼저
	 * 확인해 볼 수 있다면, 연속으로 반복되는 문자가 그리 많지 않은 경우에 속도를 더 줄일 수 있다.
	 * 
	 * 하지만 문자열을 두 번 순회해야 하고 거의 비슷한 코드를 중복으로 작성해햐 한다는 단점이 있다.
	 */
	public static String compress(String str) {
		// 압축된 문자열의 길이가 입력 문자열보다 길다면 입력 문자열을 반환한다.
		int finalLength = countCompression(str);
		if (finalLength >= str.length())
			return str;

		StringBuilder compressed = new StringBuilder(finalLength); // 처음 크기
		int countConsecutive = 0;
		for (int i = 0; i < str.length(); i++) {
			countConsecutive++;

			// 다음문자와 현재 문자가 같이 않다면 현재 문자를 결가 문자열에 추가한다.
			if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				compressed.append(str.charAt(i));
				compressed.append(countConsecutive);
				countConsecutive = 0;
			}
		}
		return compressed.toString();
	}

	public static int countCompression(String str) {
		int compressdLength = 0;
		int countConsecutive = 0;
		for (int i = 0; i < str.length(); i++) {
			countConsecutive++;

			// 다음 문자와 현재 문자가 같지 않다면 길이를 증가시킨다.
			if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				compressdLength += 1 + String.valueOf(countConsecutive).length();
				countConsecutive = 0;
			}
		}
		return compressdLength;
	}
}
/*
 이 방법의 장점 중 하나는 StringBuilder의 크기를 미리 설정할 수 있다는 점이다. StringBuilde는 내부적으로 설정한 크기를 넘어갔을 때
 전체 크기를 두배로 느린다. 따라서 최종크기가 실제 필요로하는 크기의 두배일 수도 있다.
*/
