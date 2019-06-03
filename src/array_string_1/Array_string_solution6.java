package array_string_1;

public class Array_string_solution6 {

	public static void main(String[] args) {
		System.out.println(compressBad("aaabbccaa"));
		System.out.println(compressBad("abcaad"));
		System.out.println(compressBad("abbccsa"));
	}

	// 직관적인 방법의 풀이
	// 문자열을 순회하면서 새로운 문자열에 문자들을 복사해 넣고, 반복되는 횟수를 세면된다.
	// 매번 현재 문자와 다음 문자가 같은지 체크하고, 같지 않으면 압축된 형태로 문자열에 추가해준다.
	public static String compressBad(String str) {
		String compressedString = "";
		int countConsecutive = 0;
		for (int i = 0; i < str.length(); i++) {
			countConsecutive++;

			// 다음 문자와 현재문자가 같지 않다면 현재 문자를 결과 문자열에 추가해준다.
			if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				compressedString += "" + str.charAt(i) + countConsecutive;
				countConsecutive = 0;
			}
		}
		return compressedString.length() < str.length() ? compressedString : str;
	}
	/* 
	 p를 원래 문자열의 길이, k를 같은 문자가 연속되는 부분 문자열의 개수라고 했을 때, 총 수행시간은 O(p + k^2) 이 된다.
	 결과적으로 이 알고리즘은 느리다.
	 */
}
