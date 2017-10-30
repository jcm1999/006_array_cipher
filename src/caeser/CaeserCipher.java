package caeser;

import javax.swing.JOptionPane;

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
	
	public String decode(String codedText, int key) {
		String plainText = "";
		for (int i = 0; i < codedText.length(); i++) {
			if (codedText.charAt(i) != ' ') {
				int index = alpha.indexOf(codedText.charAt(i));
				int keyAdded;
				
				if(index - key < 0) {
					keyAdded = alpha.length() + ((index - key) % alpha.length());
				}
				else if(index - key >= 0) {
					keyAdded = (index - key) % alpha.length();
				}
				else {
					keyAdded = 0;
				}
				
				plainText += alpha.charAt(keyAdded);
			}
			else {
				plainText += ' ';
			}
		}
		return plainText;
	}
	
	public String cracker(String codedText) {
		return null;
	}

}
