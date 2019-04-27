package array_string_1;

/*
 * 순열확인: 문자열 두 개가 주여졌을 때 이 둘이 서로 순열관계에 있는지 확인하는 메서드를 작성하라
 */

public class Array_string_exercise2 {

	public static void main(String[] args) {
		String str = "edcbaqb";
		String str2 = "abcdeqc";
		//중복을 허용하지 않는 경우 
		if(permuCheck(str, str2)) {
			System.out.println("순열 관계에 있습니다.");
		}else
			System.out.println("순열 관계에 없습니다.");
		
		//중복을 허용하는 경우
		if(permuCheck2(str, str2))
			System.out.println("순열 관계에 있습니다.");
		else
			System.out.println("순열 관계에 없습니다.");
	}

	// 중복을 허용하지 않는 경우
	static boolean permuCheck(String str, String str2) {
		if(str.length()!=str2.length())
			return false;
		boolean[] strArray = new boolean[128];
		for(int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			strArray[val] = true;
		}
		for(int k = 0; k < str2.length(); k++) {
			int val = str2.charAt(k);
			if(!strArray[val])
				return false;
		}
		return true;
	}

	// 중복을 허용하는 경우
	static boolean permuCheck2(String str, String str2) {
		if(str.length()!=str2.length())
			return false;
		int[] count = new int [128];
		int[] count2 = new int [128];
		for(int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			count[val]++;
		}
		for(int k = 0; k < str2.length(); k++) {
			int val = str2.charAt(k);
			count2[val]++;
		}
		for(int w = 0; w < count.length; w++) {
			if(count[w]!=count2[w])
				return false;
		}
		return true;
	}
}
