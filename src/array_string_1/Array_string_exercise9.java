package array_string_1;

/*
 한 단어가 다른 문자열에 포함되어 있는지 판별하는 isSubstring이라는 메서드가 있다고 하자. 
 s1과 s2의 두 문자열이 주여졌고, s2가 s1을 회전시킨 결과인지 판별하고자 한다. isSubstring메서드를 한번만 호출해서 판별할 수 있는 코드를 작성하라.
 ex) waterbottle => erbottlewat
 */

public class Array_string_exercise9 {

	public static void main(String[] args) {
		String st1 = "waterbottle";
		String st2 = "erbottlewat";
		System.out.println(isSubstring(st1, st2));
		
		String st3 = "water";
		String st4 = "aterw";
		System.out.println(isSubstring(st3, st4));
		
		String st5 = "wattert";
		String st6 = "twatter";
		System.out.println(isSubstring(st5, st6));
	}

	public static boolean isSubstring(String st1, String st2) {
		int count = 0;
		int index = 0;
		// st2의 처음 문자와 같은 문자 찾기
		for (int i = 0; i < st2.length(); i++) {
			if (st2.charAt(0) == st1.charAt(i)) {
				index = i;
				break;
			}
		}
		int index2 = 0;
		for (int i = index; i < st2.length(); i++) {
			if(st2.charAt(index2)==st1.charAt(i)) {
				count++;
			}
			index2++;
			if(index2==st2.length()-1) {
				break;
			}
			if (i == st2.length() - 1) {
				i = -1;
			}
			
		}
		return count==st2.length()-1;
	}
}
