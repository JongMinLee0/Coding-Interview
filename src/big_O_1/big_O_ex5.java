package big_O_1;

public class big_O_ex5 {
	// 아래 코드의 시간 복잡도는 어떻게 될까?
	
	void printUnorderedPairs(int[] arrayA, int[] arrayB) {
		for(int i=0; i < arrayA.length; i++) {
			for(int j = 0; j < arrayB.length; j++) {
				for(int k = 0; k < 100000; k++) {
					System.out.println(arrayA[i] + ", " + arrayB[j]);
				}
			}
		}
	}
}




/*
big_O_ex4와 같다.
100000은 여전히 상수항으로 간주되므로 달라지는 것은 없다. 수행시간은 O(ab)가 된다.
*/