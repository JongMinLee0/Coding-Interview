package array_string_1;

/*
 문자열을 편집하는 기능에는 삽입, 삭제, 교체 기능이있다. 두 문자열이 주어졌을 때 문자열을 같게 만들기 위해
편집 푓수가 1회 이내인지를 확인하라
 */
public class Array_string_exercise5 {

	public static void main(String[] args) {
		System.out.println("pale ple " + editString("pale", "ple"));
		System.out.println("palse plee " + editString("pales", "pale"));
		System.out.println("pale bale " + editString("pale", "bale"));
		System.out.println("pale bake " + editString("pale", "bake"));
	}
	
	// 먼저 길이를 비교해서 길이가 다른 경우와 같은 경우로 나누었다.
	// 앞에서 부터 문자를 비교하며 다른 문자가 나올경우 갯수를 세서 1개를 넘어가면 false가 되도록 했다.
	public static boolean editString(String st1, String st2) {
		int count = 0;
		String[] st_1 = st1.split("");
		String[] st_2 = st2.split("");
		if (st1.length() > st2.length()) {
			int index = 0;
			for (int i = 0; i < st1.length(); i++) {
				if (index > st2.length() - 1) {
					count++;
					break;
				}
				if (!st_1[i].equals(st_2[index])) {
					count++;
					index--;
				}
				index++;
			}
		} else if (st1.length() == st2.length()) {
			for (int i = 0; i < st1.length(); i++) {
				if (st1.charAt(i) != st2.charAt(i))
					count++;
			}
		} else {
			int index = 0;
			for (int i = 0; i < st2.length(); i++) {
				if (index > st1.length() - 1) {
					count++;
					break;
				}
				if (!st_1[index].equals(st_2[i])) {
					count++;
					index--;
				}
				index++;
			}
		}

		return count <= 1;
	}

}
