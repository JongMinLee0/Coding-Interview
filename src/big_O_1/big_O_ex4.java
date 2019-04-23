package big_O_1;

public class big_O_ex4 {
	// 아래 코드의 시간 복잡도는 어떻게 되는가?
	
	void printUnorderedPairs(int[] arrayA, int[] arrayB) {
		
		for(int i = 0; i < arrayA.length; i++) {
			for(int j = 0; j < arrayB.length; j++){
				if(arrayA[i] < arrayB[j]) {
					System.out.println(arrayA[i] + "," + arrayB[j]);
				}
			}
		}
	}
}








/* 잘 쪼개서 분석해 보자
j 루프 안에 있는 if문은 상수 시간에 수행가능한 단순한 문장이므로 O(1) 시간이라 말할 수 있다.
arrayA의 원소 하나당 안쪽 for 루프는 b(=arrayB.length)회 반복된다. 따라서 a(=arrayA.length)일 때
수행시간은 O(ab)가 된다.

O(N^2)으로 알고 있던 실수를 범하지 말자. 서로 다른 두 개의 입력이 주어지므로 O(N^2)이라고 말하면 안 된다.
두 배열의 크기를 모두 고려해야 한다.
*/