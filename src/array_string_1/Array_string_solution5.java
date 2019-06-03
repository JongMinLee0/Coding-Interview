package array_string_1;

public class Array_string_solution5 {

	public static void main(String[] args) {
		System.out.println("pale ple " + oneEditAway("pale", "ple"));
		System.out.println("palse plee " + oneEditAway("pales", "pale"));
		System.out.println("pale bale " + oneEditAway("pale", "bale"));
		System.out.println("pale bake " + oneEditAway("pale", "bake"));
	}

	/*
	 * 삽입과 삭제는 하나의 메소드로 합치고, 교체만 따로한다. 문자열의 길이따라 적용해야 할 메소드를 결정한다.
	 * 
	 * 주어진 문자열 중에서 짧은 문자열의 길이가 n이라고 할 때  O(n)의 시간이 걸린다.
	 * 문자열의 길이가 별로 차이가 없다면 짧은 문자열로 하든 긴 문자열로 하든 상관이 없다.
	 * 그러나 차이가 많이 난다면 O(1)의 시간이 걸릴 것이다. 따라서 두 문자열이 모두 길어야 수행시간이 비슷하다.
	 * 
	 */
	public static boolean oneEditAway(String first, String second) {
		if (first.length() == second.length()) {
			return oneEditReplace(first, second);
		} else if (first.length() + 1 == second.length()) {
			return oneEditInsert(first, second);
		} else if (first.length() - 1 == second.length()) {
			return oneEditInsert(second, first);
		}
		return false;
	}

	public static boolean oneEditReplace(String s1, String s2) {
		boolean foundDifference = false;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				if (foundDifference)
					return false;
				foundDifference = true;
			}
		}
		return true;
	}

	// s1에 문자 하나를 삽입해서 s2를 만들 수 있는지 확인
	public static boolean oneEditInsert(String s1, String s2) {
		int index1 = 0;
		int index2 = 0;
		while (index2 < s2.length() && index1 < s1.length()) {
			if (s1.charAt(index1) != s2.charAt(index2)) {
				if (index1 != index2) {
					return false;
				}
				index2++;
			} else {
				index1++;
				index2++;
			}
		}

		return true;
	}
}
