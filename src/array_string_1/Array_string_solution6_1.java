package array_string_1;

public class Array_string_solution6_1 {

	public static void main(String[] args) {
		System.out.println(compress("aaabbccaa"));
		System.out.println(compress("abcaad"));
		System.out.println(compress("abbccsa"));
	}
	
	// solution6의 느린문제를 StringBuilder를 이용해 개선할 수 있다.
	public static String compress(String str) {
		StringBuilder compressed = new StringBuilder();
		int countConsecutive = 0;
		for(int i=0; i < str.length(); i++) {
			countConsecutive++;
			
			// 다음문자와 현재 문자가 같지 않다면 현재 문자를 결과 문자열에 추가한다.
			if(i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)) {
				compressed.append(str.charAt(i));
				compressed.append(countConsecutive);
				countConsecutive=0;
			}
		}
		
		return compressed.length() < str.length() ? compressed.toString() : str;
	}
}
