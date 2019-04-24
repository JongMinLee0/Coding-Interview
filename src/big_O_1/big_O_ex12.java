package big_O_1;

public class big_O_ex12 {

	// 다음은 문자열로 나타낼 수 있는 순열(permutation)의 개수를 구하는 코드이다.
	// 시간복잡도를 구하라.

	void permutation(String str) {
		permutation(str, "");
	}

	void permutation(String str, String prefix) {
		if (str.length() == 0) {
			System.out.println(prefix);
		} else {
			for (int i = 0; i < str.length(); i++) {
				String rem = str.substring(0, i) + str.substring(i + 1);
				permutation(rem, prefix + str.charAt(i));
			}
		}
	}

}





/*
각 호출이 걸리는 시간이 얼마나 되는지 살펴봐야 한다.
1. 순열이 완성되는 시점에 permutation 함수가 몇 번이 호출되는가
길이가  7 인 문자열이 주어졌을 때 첫번째 자리는 7개의 선택권이 있고, 그 다음은 6개..
따라서 7*6*5*4*3*2*1이 되어 7!이된다. 따라서 가능한 경우는 n!이 될 것이다.

2. 순열 생성이 완성되기 전에 permutation 함수는 몇 번이 호출되는가
16~18번 줄이 몇번이나 호출됐는지 동시에 살펴보아야 한다. 모든 호출을 나타내는 거대한 호출 트리를 상상해보자.
말단(leaf)노드의 개수는 n!이 될테고 루트에서 각 말단 노드까지 거리는 n이 될 것이다.따라서 전체 노드(함수 호출)의 개수는 n*n!개를 넘지 못한다.

3. 각 함수 호출을 처리하는데 얼마나 오래 걸리나
문자열 전체를 출력하는데 O(N)이 걸리고, 문자열 연산 수행도 O(N), 길이의 합은 항상 n이 되는 것을 알 수 있다.
따라서 호출 트리의 각 노드가 처리하는 일은 O(n)이 된다.

4.총 수행 시간은 어떻게 되는가
permutation 함수는 O(n*n!)번(상한) 호출 되고 한 번 호출될 때마다 O(N)시간이 걸리므로
총 수행시간은 O(n^2*n!)을 넘지 않을 것이다.

*/
