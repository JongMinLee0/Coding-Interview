package big_O_2;

public class big_O_solution11 {

	// 정렬된 문자열 중 길이가 k인 모든 문자열을 출력하는 코드이다.
	// 이 코드는 길이가 k인 모든 문자열을 생성한 뒤 정렬되어 있는지를 확인하는 과정을 거친다.
	// 수행 시간을 구하시오.
	int numChars = 26;

	void printSortedStrings(int remaining) {
		printSortedStrings(remaining, "");
	}

	void printSortedStrings(int remaining, String prefix) {
		if (remaining == 0) {
			if (isInOrder(prefix)) {
				System.out.println(prefix);
			}
		} else {
			for (int i = 0; i < numChars; i++) {
				char c = ithLetter(i);
				printSortedStrings(remaining - 1, prefix + c);
			}
		}
	}

	boolean isInOrder(String s) {
		for (int i = 1; i < s.length(); i++) {
			int prev = ithLetter(s.charAt(i - 1));
			int curr = ithLetter(s.charAt(i));
			if (prev > curr) {
				return false;
			}
		}
		return true;
	}

	char ithLetter(int i) {
		return (char) (((int) 'a') + i);
	}
}












/*
O(kc^k), 여기서 k는 문자열의 길이, c는 알파벳의 개수다. 모든 문자열을 생성하는데 걸리는 시간은 O(c^k)이 걸리고,
각 문자열이 정렬된 문자열인지 확인하는데는 O(k)시간이 걸리므로 총 수행 시간은 O(kc^k)이 된다.
*/