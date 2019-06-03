package array_string_1;

public class Array_String_solution5_1 {

	public static void main(String[] args) {
		System.out.println("pale ple " + oneEditAway("pale", "ple"));
		System.out.println("palse plee " + oneEditAway("pales", "pale"));
		System.out.println("pale bale " + oneEditAway("pale", "bale"));
		System.out.println("pale bake " + oneEditAway("pale", "bake"));
	}

	/*
	 * 앞의 풀이를 보면 두 메소드가 매우 비슷한 걸 알수 있다. 이를 하나로 합쳐보자. 하나의 메서드로 합치기 위해서는 두 메서드가 비슷하게
	 * 동작해야 한다.
	 */

	public static boolean oneEditAway(String first, String second) {
		// 길이 체크 (길이가 2이상차이나면 false)
		if (Math.abs(first.length() - second.length()) > 1) {
			return false;
		}

		// 길이가 짧은 문자열과 긴 문자열 찾기
		String s1 = first.length() < second.length() ? first : second;
		String s2 = first.length() < second.length() ? second : first;

		int index1 = 0;
		int index2 = 0;
		boolean foundDifference = false;
		while (index2 < s2.length() && index1 < s1.length()) {
			if (s1.charAt(index1) != s2.charAt(index2)) {
				// 반드시 첫 번재로 다른 문자여야 한다.
				if (foundDifference)
					return false;
				foundDifference = true;
				if (s1.length() == s2.length()) // 교체의 경우 짧은 문자열의 포인터를 증가
					index1++;
			} else {
				index1++; // 동일하다면 짧은 문자열의 포인터를 증가
			}
			index2++; // 긴 문자열의 포인터는 언제나 증가.
		}

		return true;
	}
}
