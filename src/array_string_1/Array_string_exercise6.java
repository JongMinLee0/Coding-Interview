package array_string_1;

/*
 반복되는 문자의 개수를 세는 방식의 기본적인 문자열 압축 메서드를 작성하라. 예를 들어 문자열 aabbccccaaa를 압축하면 a2b1c4a3이 된다.
 만약 압축된 문자열의 길이가 기존 문자열의 길이보다 길다면 기존 문자열을 반환하라.
 */
public class Array_string_exercise6 {

	public static void main(String[] args) {
		System.out.println(comPreSsion("aaabbccaa"));
		System.out.println(comPreSsion("abcaad"));
		System.out.println(comPreSsion("abbccsa"));
	}
	
	// 문자열을 순회하면서 갯수를 셈과동시에 문자가 바뀔시 그 값을 저장해준다.
	public static String comPreSsion(String st) {
		String[] str = st.split("");
		String s1 = "";
		s1 += str[0];
		int count = 1;
		for (int i = 0; i < str.length-1; i++) {
			if(str[i].equals(str[i+1])) {
				count++;
			}else {
				s1 += (count+""+str[i+1]);
				count = 1;
			}	
		}
		s1 += count+"";
		return s1.length() < st.length() ? s1 : st;

	}
}
