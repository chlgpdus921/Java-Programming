package myPackage;

import java.util.ArrayList;

public class Ex14_1a {
	public static void main(String[] args) {
		String[] s = new String[] { "abc", "Dfg", "sdds", "asdf", "gfe", "abp", "abd", "cdg", "qer", "dfb" };
		ArrayList<String> test = new ArrayList<String>();
		test = arrayToArrayList(s);
		for (int i = 0; i < test.size(); i++) {
			System.out.println(test.get(i));
		}
		removeFromArrayList(test, "ab");
		System.out.println("_____________remove test__________");
		for (int i = 0; i < test.size(); i++) {
			System.out.println(test.get(i));
		}
	}

	public static ArrayList<String> arrayToArrayList(String[] s) {
		ArrayList<String> arr = new ArrayList<String>();
		for (int i = 0; i < s.length; i++) {
			arr.add(s[i]);
		}
		return arr;
	}

	public static void removeFromArrayList(ArrayList<String> list, String s) {
		for (int i = 0; i < list.size(); i++) {
			while (list.get(i).contains(s))
				list.remove(i);
		}

	}
}
