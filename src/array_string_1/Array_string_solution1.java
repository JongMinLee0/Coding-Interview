package array_string_1;
/*
 * 중복이 없는가 : 문자열이 주어졌을 때, 이 문자열에 같은 문자가 중복되어 등장하는지 확인하는 알고리즘을 작성하라.
 * 자료구조를 추가로 사용하지 않고 풀 수 있는 알고리즘 또한 고민하라.
 */

/*
 먼저 면접관에게 아스키문자인지 유니코드 문자열인지 물어봐야 한다.
 */


public class Array_string_solution1 {
	public static void main(String[] args) {
		String st = "abcdefg";
		if(isUniqueChars(st))
			System.out.println("중복값이 없습니다.");
		else
			System.out.println("중복값이 있습니다.");
		
		
	}
	
	/*
	 * boolean배열을 만들어서 같은 원소에 두번 접근하면 바로 false가 return
	 * 문자열의 길이가 문자 집합의 길이보다 클경우 바로 false를 return
	 * 이 코드의 시간복잡도는 O(n)이다.(n은 문자열 길이), 공간 복잡도는O(1)이다.
	 */
	static boolean isUniqueChars(String str) {
		if(str.length() > 128) return false;
		boolean[] char_set = new boolean[128];
		for(int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if(char_set[val]) {
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}
	
	/*
	 * 위의 코드에서 비트벡터를 사용하면 필요한 공간을 1/8로 줄일 수 있다.
	 * 그렇게 하면 하나의 int 변수만 사용해서 풀 수 있다.
	 */
	static boolean UniqueChars(String str) {
		int checker = 0;
		for(int i = 0; i < str.length(); i++) {
			int val = str.charAt(i) - 'a';
			if((checker & (1 << val)) > 0) {
				return false;
			}
			checker |= (1 << val);
		}
		return true;
	}
	
	/*
	 *자료구조를 추가로 사용하지 않는 경우
	 *1. 문자열 내의 각 문자를 다른 모든 문자와 비교한다. O(N^2)시간이 걸리고 공간복잡도는 O(1)이 된다.
	 *2. 입력 문자열을 수정해도 된다면, O(nlogn) 시간에 문자열을 정렬한뒤 처음 부터 훑어 나가면서
	     인접한 문자가 동일한지 검사한다.(이 때 많은 정렬 알고리즘이 공간을 추가로 쓴다는 점을 주의하라.)
	 */
	

}
