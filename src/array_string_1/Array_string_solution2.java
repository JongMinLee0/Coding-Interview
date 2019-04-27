package array_string_1;

/*
 * 순열확인: 문자열 두 개가 주여졌을 때 이 둘이 서로 순열관계에 있는지 확인하는 메서드를 작성하라
 */
/*
 * 대소문자를 구분하는지, 공백도 하나의 문자로 취급할 것인가를 질문으로서 확인해야 한다.
 */

public class Array_string_solution2 {

	public static void main(String[] args) {
		String str = "edcbaqb";
		String str2 = "abcdeqc";
		
		if(permutation(str, str2)) {
			System.out.println("순열 관계에 있습니다.");
		}else
			System.out.println("순열 관계에 없습니다.");
	}
	
	/*
	 *1.정렬하기
	 * 어떤 면에서는 최적은 아니다. 하지만 깔끔하고 단순하며 이해하기 쉽다는 측면이 있다. 
	 */
	static public String sort(String str) {
		char[] content = str.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}
	static public boolean permutation(String str, String str2) {
		if(str.length() != str2.length()) {
			return false;
		}
		return sort(str).equals(sort(str2));
	}
	
	/*
	 * 2.갯수 세기
	 * 각 문자열의 갯수를 세서 비교하여 결정한다.
	 */
	
	static boolean permutation2(String str, String str2) {
		if(str.length() != str2.length())
			return false;
		int[] letters = new int[128]; // 가정
		
		char[] s_array = str.toCharArray();
		for(char c : s_array) { // s 내에서 각 문자의 출현 횟수를 센다.
			letters[c]++;
		}
		
		for(int i=0; i < str2.length(); i++) {
			int c = (int) str2.charAt(i);
			letters[c]--;
			if(letters[c]<0)
				return false;
		}
		
		return true;
	}
}
