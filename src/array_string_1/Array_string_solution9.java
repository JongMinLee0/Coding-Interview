package array_string_1;

/* 문제를 잘못이해했다. isSubstring 메서드명으로 만들라는 줄 알았지만 String의 메서드를 이요하는 것이었다. */

public class Array_string_solution9 {

	public static void main(String[] args) {
		
	}
	// 여기서 isSubstring은 한 단어가 다른 문자열에 포함되어 있는지 판별하는 메서드이다.
	// s2가만약 회전되어있다면 s1s1의 부분문자열일 수 밖에 없다.
	public static boolean isRotation(String s1, String s2) {
		int len = s1.length();
		// s1과 s2의 길이가 같고 빈(empty) 문자열이 아닌지 확인한다.
		if(len==s2.length() && len > 0) {
			// s1과 s1을 합친 결과를 새로운 버퍼에 저장한다.
			String s1s1 = s1 + s1;
			//return isSubstring(s1s1, s2);
		}
		
		return false;
	}
}
