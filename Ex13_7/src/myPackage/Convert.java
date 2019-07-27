package myPackage;

public class Convert {
	public String bracket(String str, String[] line) {
		String[] arr = str.split("\\s+");
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < line.length; j++) {
				if (arr[i].equalsIgnoreCase(line[j]))
					arr[i] = "<" + arr[i] + ">";
			}
		}
		for (int i = 0; i < arr.length; i++) {
			result = result + " " + arr[i];
		}
		return result;
	}
}
