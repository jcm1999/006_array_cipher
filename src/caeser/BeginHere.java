package caeser;

import java.util.Scanner;

public class BeginHere {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		
		CaeserCipher myCipher = new CaeserCipher();
		
		System.out.println("Please enter the plain text to encode:");
		String plainText = kbd.nextLine();
		
		System.out.println("Please enter the key:");
		int key = kbd.nextInt();
		System.out.println("Your key is: " + key);
		
		String codedText = myCipher.encode(plainText, key);
		System.out.println("Your secret message is: " + codedText);

	}

}
