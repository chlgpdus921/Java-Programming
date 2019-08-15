package myPackage;

import java.util.*;

public class Ex14_2b {
	public static void main(String[] args) {
		String[] s = new String[] { "abc", "abc", "abc", "bdc", "bdc", "qe", "qe", "qe", "qe", "dfb" };
		HashSet<String> result = new HashSet<String>();
		result = arrayToHashSet(s);
		printSet(result);
		removeFromHashSet(result, "ab");
		printSet(result);
	}

	public static HashSet<String> arrayToHashSet(String[] s) {
		HashSet<String> hash = new HashSet<String>();
		for (int i = 0; i < s.length; i++) {
			hash.add(s[i]);
		}
		return hash;
	}

	public static void removeFromHashSet(HashSet<String> list, String s) {
		while (list.contains(s))
			list.remove(s);
	}

	public static void printSet(HashSet<String> result) {
		System.out.println("The set contains: ");
		for (Object obj : result.toArray()) {
			System.out.println(obj);
		}
	}
}
