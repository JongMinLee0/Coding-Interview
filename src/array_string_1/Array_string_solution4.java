package array_string_1;


/* 회문 순열 : 회문을 만들 수 있는 순열
 문자의 길이가 홀수일 경우 단 한개의 문자만 홀수여야 한다.
 문자의 길이가 짝수일 경우 모든 문자의 갯수가 짝수여야 한다.
 */
public class Array_string_solution4 {
	public static void main(String[] args) {
		String[] input = { "tactCoa", "tacocat", "atcocta", "aabbccbbaa", "abcdcba", "abcddcab" };
		for (String inp : input)
			if (isPermutationOfPalindrome(inp))
				System.out.println("회문순열 입니다.");
			else
				System.out.println("회문순열이 아닙니다.");
	}
	
	// 해법1) 해시테이블을 이요해서 각 문자가 몇 번 등장했는지 센다. 그 다음엔 해시 테이블을 훑어가며 홀수 문자가 한 개이상인지 확인한다.
	// 이 알고리즘은 O(N)이 걸린다. (N은 문자열의 길이)
	public static boolean isPermutationOfPalindrome(String phrase) {
		int[] table = buildCharFrequencyTable(phrase);
		return checkMaxOneOdd(table);
	}
	
	
	// 홀수 문자가 한 개 이상 존재하는지 확인한다.
	public static boolean checkMaxOneOdd(int[] table) {
		boolean foundOdd = false;
		for(int count : table) {
			if(count % 2 == 1) {
				if(foundOdd)
					return false;
				foundOdd = true;
			}
		}
		return true;
	}
	
	// 각 문자에 숫자를 대응시킨다. a -> 0, b -> 1, c ->2 등등
	public static int getCharNumber(Character c) {
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int val = Character.getNumericValue(c);
		if(a <= val && val <= z)
			return val - a;
		
		return -1;
	}
	
	// 각 문자가 몇 번 등장했는지 센다.
	public static int[] buildCharFrequencyTable(String phrase) {
		int[] table = new int [Character.getNumericValue('z') - 
		                       Character.getNumericValue('a') + 1];
		for(char c : phrase.toCharArray()) {
			int x = getCharNumber(c);
			if(x != -1) {
				table[x]++;
			}
		}
		return table;
	}
	
}
