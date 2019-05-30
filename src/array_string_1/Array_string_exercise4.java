package array_string_1;

/*
 회문 순열 : 주어진 문자열이 회문(palindrome)의 순열인지 아닌지 확인하는 함수를 작성하라.
 회문이란 앞으로 읽으나 뒤로 읽으나 같은 단어 혹은 구절을 의미하며, 순열이란 문자열을 재배치하는 것을 뜻한다.
 회문이 꼭 사전에 등장하는 단어로 제한될 필요는 없다.

test case : Tact Coa
=> taco cat, atco cta
 */


// 문제를 잘 못 이해해서 풀었다...
// 주어진 문자열로 회문을 만들 수 있으면 회문 순열이다.
public class Array_string_exercise4 {

	public static void main(String[] args) {
		String[] input = { "Tact Coa", "taco cat", "atco cta", "aabbccbbaa", "abcdcba", "abcddcab" };
		for (String inp : input)
			if (palindrome(inp))
				System.out.println("회문순열 입니다.");
			else
				System.out.println("회문순열이 아닙니다.");

	}

	// 대소문자를 소문자로 통일 시킨뒤 공백을 제거한다.
	// 문자열의 길이가 짝수일 때와 홀수일 때로 나눠준다. 인덱스를 저장할 배열을 선언해 준다.

	public static boolean palindrome(String input) {
		
		String st = input.toLowerCase().replace(" ", "");
		int[] index = new int[26];

		if (st.length() % 2 == 0) { // 문자열의 길이가 짝수
			for (int i = 0; i < st.length(); i++) {
				index[st.charAt(i) - 'a'] += i;
			}
		} else { // 문자열의 길이가 홀수
			for (int i = 0; i < st.length(); i++) {
				if (i == (st.length() - 1) / 2)
					continue;
				index[st.charAt(i) - 'a'] += i;
			}
		}

		//인덱스를 더한 값을 인덱스-1 로 나눴을 떄 나머지가 0이면 같은 위치에 있는 것이다.
		for (int i = 0; i < index.length; i++) {
			if (index[i] % (st.length() - 1) != 0)
				return false;
		}
		return true;
	}

}
