package caeser;

public class CaeserCipher {
	
	private String alpha = "abcdefghijklmnopqrstuvwxyz 0123456789.:'";

	public String encode(String plainText, int key) {
		
		String secretText = "";
		int index, keyAdded;
		
		//System.out.println("text, alpha length = " + alpha.length());
		//System.out.println("test, first char is: " + alpha.charAt(0));
		//System.out.println("test, last char is: " + alpha.charAt(alpha.length() - 1));
		
		/*
		for(int i = 0; i <= alpha.length() - 1; i++) {
			System.out.println(alpha.charAt(i));
		}
		System.out.println("\n\n");
		
		for(int i = 0; i < plainText.length(); i++) {
			
			System.out.println(plainText.charAt(i));
			
		}
		*/
		/*
		 * each char that I read from plainText I find the index in alpha
		 * for example, read A look up index for A get 0
		 *              read M look up index for M get 12
		 * then, add key to that index, so A index 0 becomes 0+key,
		 * and 0+key becomes my coded char
		 * let's say key = 1, then A index 0, 0 + 1 = 1, charAt 1 is B
		 * and that is my encoding
		 */
		
		for(int i=0; i<plainText.length(); i++) {
			
			index = alpha.indexOf(plainText.charAt(i));

			
			/** Doug's Method **/
			keyAdded = (index + key) % alpha.length();
			
			/**
			keyAdded = index + key;
			
			if(keyAdded >= alpha.length()) {
				keyAdded -= alpha.length();
			}
			**/
			
			if(keyAdded == 26){
				keyAdded = 27;
			}
			//System.out.println("encoded is " + alpha.charAt(keyAdded));
			
			secretText += alpha.charAt(keyAdded);
			
		}
		
		
		return secretText;
		
	}

}
