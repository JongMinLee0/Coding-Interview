package array_string_1;

public class Array_string_solution4_3 {

	public static void main(String[] args) {
		String[] input = { "tactCoa", "tacocat", "atcocta", "aabbccbbaa", "abcdcba", "abcddcab" };
		for (String inp : input)
			if (isPermutationOfPalindrome(inp))
				System.out.println("회문순열 입니다.");
			else
				System.out.println("회문순열이 아닙니다.");
	}
	
	/*
	 해법3) 우리는 등장 횟수와 관계 없이 짝수인지 홀수 인지만 알면 문제를 풀 수 있다.
	 등장할 때마다 비트를 1로 치환해 줄 것이다.
	 마지막으로 한개 이하의 비트가 1로 세팅되어 있느지 확인해주면 된다.
	(중요방법) 비트에서 1을 뺀다음 AND연산을 수행했을때 그 결과가 0 이라면 정확히 한 비트만 1로 세팅된 것이다.(확인해보면 알 수 있다.)
	물론 다른방법들과 마찬가지로 O(N)의 시간이 걸린다.
	 */
	
	public static boolean isPermutationOfPalindrome(String phrase) {
		int bitVector = createBitVector(phrase);
		return bitVector == 0 || checkExactlyOneBitSet(bitVector);
	}
	
	// 문자열에 대한 비트 벡터를 만든다. 값이 i인 문자가 등장하면 i번째 비트값을 바꾼다.
	public static int createBitVector(String phrase) {
		int bitVector = 0;
		for(char c : phrase.toCharArray()) {
			int x = getCharNumber(c);
			bitVector = toggle(bitVector, x);
		}
		return bitVector;
	}
	
	// 정수의 i번째 비트값을 바꾼다.
	public static int toggle(int bitVector, int index) {
		if(index < 0) return bitVector;
		int mask = 1<<index;
		if((bitVector & mask) == 0) {
			bitVector |= mask;
		}else {
			bitVector &= ~mask;
		}
		return bitVector;
	}
	
	//정확히 비트 한개만 1로 세팅됐는지 확인하기 위해 주어진 정수 값에서 1을 뺀뒤 원래값과 AND연산을 한다.
	public static boolean checkExactlyOneBitSet(int bitVector) {
		return (bitVector & (bitVector - 1)) == 0;
	}
	
	public static int getCharNumber(Character c) {
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int val = Character.getNumericValue(c);
		if(a <= val && val <= z)
			return val - a;
		
		return -1;
	}
}
