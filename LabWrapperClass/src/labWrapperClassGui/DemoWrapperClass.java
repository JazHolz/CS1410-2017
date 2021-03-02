package labWrapperClassGui;

public class DemoWrapperClass {

	public String MinMax() {
		String Byte = "Byte:\nMin: -128\nMax: 127\n\n";
		String Short = "Short:\nMin:  -32768\nMax: 32767\n\n";
		String Integer = "Integer:\nMin: -2147483648\nMax: 2147483647\n\n";
		String Long = "Long:\nMin: -9223372036854775808\nMax:9223372036854775807\n\n";
		return Byte + Short + Integer + Long;
	}

	public String toBinary(int number) {
		String b = Integer.toBinaryString(number);
		String o = Integer.toOctalString(number);
		String h = Integer.toHexString(number);
		return "Binary: " + b + "\nOctal: " + o + "\nHex: " + h;
	}

	public String charProperties(char c) {
		String S = Character.toString(c);
		String letter;
		String whitespace;
		String digit;
		String upperlower;
		if (S.matches("[a-zA-Z]")) {
			if (S.toUpperCase().equals(S)) {
				upperlower = S.toLowerCase();
			} else {
				upperlower = S.toUpperCase();
			}
			letter = S + "|" + upperlower;
		} else
			letter = "false";

		if (S.matches("[0-9]")) {
			digit = "true";
		} else
			digit = "false";
		if (S.matches("[\\s]")) {
			whitespace = "true";
		} else
			whitespace = "false";

		return "White Space: " + whitespace + "\nDigit: " + digit + "\nLetter: " + letter;
	}

}