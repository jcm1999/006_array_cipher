package caeser;

public class CaeserCipher {

	private String alpha = "abcdefghijklmnopqrstuvwxyz0123456789.:'";

	public String encode(String plainText, int key) {

		String secretText = "";
		int index, keyAdded;

		for (int i = 0; i < plainText.length(); i++) {
			if (plainText.charAt(i) != ' ') {
				index = alpha.indexOf(plainText.charAt(i));

				/** Doug's Method **/
				keyAdded = (index + key) % alpha.length();

				secretText += alpha.charAt(keyAdded);

			} else {
				secretText += ' ';
			}
		}

		return secretText;

	}

}
