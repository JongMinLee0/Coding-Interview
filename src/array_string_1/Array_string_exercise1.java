package array_string_1;

import java.util.ArrayList;
/*
 * 중복이 없는가 : 문자열이 주어졌을 때, 이 문자열에 같은 문자가 중복되어 등장하는지 확인하는 알고리즘을 작성하라.
 * 자료구조를 추가로 사용하지 않고 풀 수 있는 알고리즘 또한 고민하라.
 */
public class Array_string_exercise1 {
	public static void main(String[] args) {
		// 리스트를 이용해서 만든 풀이
		/*
		String st = "abcdefghijklmnap";
		String[] str = st.split("");
		ArrayList<String> list = new ArrayList<String>();
		for(int i = 0; i < str.length; i++) {
			if(list.indexOf(str[i])==-1)
				list.add(str[i]);
			else {
				System.out.println("중복된 값이 있습니다.");
				System.exit(0);
			}
		}
		System.out.println("중복된 값이 없습니다.");
		*/
		
		//자료구조를 이용하지 않은 풀이
		String st = "abcdefghijklmnp";
		String[] str = st.split("");
		for(int i=0; i < str.length; i++) {
			for(int j=i+1; j < str.length-1; j++) {
				if(str[i].equals(str[j])) {
					System.out.println("중복된 값이 있습니다.");
					System.exit(0);
				}
			}
		}
		System.out.println("중복된 값이 없습니다.");
	}
}
