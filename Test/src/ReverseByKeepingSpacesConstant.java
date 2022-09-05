
public class ReverseByKeepingSpacesConstant {
	public static void main(String[] args) {
		String str = "This is a India Country";

		char[] strArray = str.toCharArray();
		char[] result = new char[strArray.length];

		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i] == ' ') {
				result[i] = ' ';
			}
		}

		int j = result.length - 1;
		System.out.println(j);
	}

}
