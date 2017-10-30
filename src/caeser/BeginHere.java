package caeser;

import javax.swing.JOptionPane;

public class BeginHere {

	public static void main(String[] args) {
		
		boolean again = true;
		CaeserCipher myCipher = new CaeserCipher();
		
		while (again == true) {
		Object[] selectionsArray = {"Encoder","Decoder","Cracker","Exit"};
		String showFirst = "Encoder";
		String selection = (String)JOptionPane.showInputDialog(
                null,
                "Please make your selection",
                "Caeser Cipher Program",
                JOptionPane.PLAIN_MESSAGE,
                null, 
                selectionsArray,
                showFirst);
		if (selection == null) selection = "Cancelled";
		JOptionPane.showMessageDialog(null, "You have selected " + selection);
		
		switch (selection) {
		case "Encoder":
				
				String msg = "Please enter the plain text to encode:";
				String plainText = JOptionPane.showInputDialog(null, msg).toLowerCase();
				
				msg = "Please enter the key:";
				String holder = JOptionPane.showInputDialog(null, msg);
				int key = Integer.parseInt(holder);
				
				String codedText = myCipher.encode(plainText, key);
				JOptionPane.showMessageDialog(null, "Your secret message is: " + codedText);
				
			break;
		case "Decoder":		

				msg = "Please enter the coded text to decode:";
				codedText = JOptionPane.showInputDialog(null, msg).toLowerCase();
				
				msg = "Please enter the key:";
				holder = JOptionPane.showInputDialog(null, msg);
				key = Integer.parseInt(holder);
				
				plainText = myCipher.decode(codedText, key);
				JOptionPane.showMessageDialog(null, "Your secret message is: " + plainText);
				
			break;
		case "Cracker":
			JOptionPane.showMessageDialog(null, "We are now in the Cracker switch block... add some code!");
			break;
		case "Exit":
			JOptionPane.showMessageDialog(null, "Goodbye, see you later!");
			System.exit(0);
			break;
		default:
			break;
		}
	}
	}

}
