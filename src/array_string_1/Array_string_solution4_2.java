package array_string_1;

public class Array_string_solution4_2 {

	public static void main(String[] args) {
		String[] input = { "tactCoa", "tacocat", "atcocta", "aabbccbbaa", "abcdcba", "abcddcab" };
		for (String inp : input)
			if (isPermutationOfPalindrome(inp))
				System.out.println("회문순열 입니다.");
			else
				System.out.println("회문순열이 아닙니다.");
	}
	
	/*
	 해법2) 어떤 알고리즘이 됐든 문자열을 한 번은 훑어야 하기 때문에 big-O 시간을 더 최적화 할 수 없다.
	 약간은 개선할 수 있다. 마지막에 홀수의 개수를 확인하기보단 문자열을 훑어 나가면서 동시에 개수를 확인 할 수 있다.
	 이렇게 하면 순회가 끝나자마자 회문인지 아닌지 알 수 있다.
	 
	 중요한 것은 이 방법이 더 최적화 된 방법이 아니라는 것이다.시간복잡도는 여전히 O(N)이고, 심지어 조금 더 느릴 수 있다. 
	 두번째 루프를 피했지만 각문자마다 수행해야 할 코드의 줄 수가 늘어났다. 최적화된 방법은 아니지만 또다른 해법중 하나라 할 수 있다.
	 */
	
	public static boolean isPermutationOfPalindrome(String phrase) {
		int countOdd = 0;
		int[] table = new int [Character.getNumericValue('z') - 
		                       Character.getNumericValue('a') + 1];
		for(char c : phrase.toCharArray()) {
			int x = getCharNumber(c);
			if(x!=-1) {
				table[x]++;
				if(table[x]%2 == 1) {
					countOdd++;
				}else {
					countOdd--;
				}
			}
		}
		return countOdd <= 1;
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
