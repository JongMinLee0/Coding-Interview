package array_string_1;

/*
문자열 조작 문제를 풀 때 널리 쓰이는 방법 중 하나는 문자열을 뒤에서부터 거꾸로 편집해 나가는 것이다. 왜냐하면 이러게 해야 마지막 부분에 여유 공간을 만들어 유용하게
사용할 수 있기 때문이다. 이 방식을 이용하면 덮어쓸 걱정을 하지 않고 문자들을 바꿔나갈 수 있다.

이번 문제에서는 문자열을 두 번 훑어 나간다. 처음에는 문자열 내에 얼마나 많은 공백 문자가 있는지 살핀 뒤, 이를 통해 최종 문자열에 추가 공간이 얼마나 필요한지 계산한다.
두 번재 훑을 때에는 역방향으로 진행하면서 실제로 문자열을 편집한다. 공백을 만나면, 다음 위치에 %20을 복사하고, 공백문자가 아니면 원래 문자를 복사한다.
 */
public class Array_String_solution3 {

	public static void main(String[] args) {
		String st = "Mr John Smith";
		int leng = st.length();
		System.out.println(replaces(st.toCharArray(), leng));
	}

	public static String replaces(char[] str, int trueLength) {
		int spaceCount = 0, index, i = 0;
		for (i = 0; i < trueLength; i++) {
			if (str[i] == ' ')
				spaceCount++;
		}
		index = trueLength + spaceCount * 2;
		char[] str2 = new char[index];
		if (trueLength < str.length)
			str2[trueLength] = '\0'; // 배열의 끝
		for (i = trueLength - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				str2[index - 1] = '0';
				str2[index - 2] = '2';
				str2[index - 3] = '%';
				index = index - 3;
			} else {
				str2[index - 1] = str[i];
				index--;
			}
		}

		return String.valueOf(str2);
	}
}
/*
 * 자바의 String은 수정이 불가능(immutable)하기 때문에 문자배열(character array)를 사용했다. String을 직접
 * 사용할 경우 String을 새로 복사하여 사용해야 하는데, 그렇게 하면 한 번만 훑어서 결과를 반환할 수 있다.
 */