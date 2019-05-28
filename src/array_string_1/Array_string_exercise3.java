package array_string_1;

/*
 URL화 : 문자열에 들어 있는 모든 공백을 '%20'으로 바꿔주는 메서드를 작성하라. 최종적으로 모든 문자를 다 담을 수 있을 만큼 충분한
       공간이 이미 확보되어 있으며 문자열의 최종 길이가 함께 주어진다고 가정해도 된다..
 */
public class Array_string_exercise3 {

	public static void main(String[] args) {

		String st = "Mr John Smith";
		int leng = st.length();
		System.out.println(change(st, leng));

	}

	//문자열 배열로 바꾼뒤 값을 차례대로 탐색하며 바꿔준다.
	public static String change(String st, int leng) {
		String[] str = st.split("");
		String st2 = "";
		for(int i=0; i < str.length; i++) {
			if(str[i].equals(" "))
				str[i] = "%20";
			st2 += str[i];
		}
		return st2;
	}

}
