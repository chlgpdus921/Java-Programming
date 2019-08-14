package myPackage;

import java.util.LinkedList;

public class Ex14_2c {
	public static void main(String[] args) {
		String[] s = new String[] { "abc", "abc", "abc", "bdc", "bdc", "qe", "qe", "qe", "qe", "dfb" };
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList = arrayToLinkedList(s);
		print(linkedList);
		System.out.println("_____________remove test__________");
		removeFromLinkedList(linkedList, "abc");
		print(linkedList);
		System.out.println("_____________remove test__________");

		removeFromLinkedList(linkedList, "bdc");
		print(linkedList);
	}

	public static LinkedList<String> arrayToLinkedList(String[] s) {
		LinkedList<String> linkedList = new LinkedList<String>();
		for (int i = 0; i < s.length; i++) {
			linkedList.add(s[i]);
		}
		return linkedList;
	}

	public static void removeFromLinkedList(LinkedList<String> list, String s) {
		while (list.contains(s))
			list.remove(s);
	}

	public static void print(LinkedList<String> list) {
		for (String e : list)
			System.out.println(e);
	}
}
