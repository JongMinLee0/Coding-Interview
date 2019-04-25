package big_O_2;

public class big_O_solution12 {

	// 두 배열의 공통된 원소 갯수를 구해주는 코드이다.
	// b배열을 정렬한 뒤 이진 탐색으로 배열 a를 살펴본다. 수행 시간을 구하시오.
	// 구현되지 않은 메소드 들은 오류로 인하여 주석처리 하였다.
	int intersection(int[] a, int[] b) {
		//mergesort(b);
		int intersect = 0;
		for(int x : a) {
			//if(binarySearch(b,x) >= 0) {
				intersect++;
			}
		//}
		return intersect;
	}
}











/*
O(blogb+alogb), 먼저 배열 b를 정렬하는데 O(blogb)가 걸린다. 그 뒤 a의 각 원소마다 이진탐색을 수행해야 하므로 O(logb)가 소요되고
이를 모든 원소에 적용하면 O(alogb)가 된다.
*/