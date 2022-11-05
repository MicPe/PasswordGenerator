import java.util.Random;

public class Generator {
	
	public static char[] generatePassword(int length) {
		
		String capitelCaseLetterString = "ABCDEFGHIJKLMNOPRSTUYVWZX";
		String lowerCaseLetterString = capitelCaseLetterString.toLowerCase();
		String specialCharacterString = "*/!@#$%";
		String numbersCharacterString = "0123456789";
		String combinedCharacterString = capitelCaseLetterString.concat(lowerCaseLetterString).concat(specialCharacterString).concat(numbersCharacterString);
		Random random = new Random();
		char[] password = new char[length];
		
		password[0] = lowerCaseLetterString.charAt(random.nextInt(lowerCaseLetterString.length()));
		password[1] = capitelCaseLetterString.charAt(random.nextInt(capitelCaseLetterString.length()));
		password[2] = specialCharacterString.charAt(random.nextInt(specialCharacterString.length()));
		password[3] = numbersCharacterString.charAt(random.nextInt(numbersCharacterString.length()));
		
		for(int i = 4; i < length; i++) {
			password[i] = combinedCharacterString.charAt(random.nextInt(combinedCharacterString.length()));
		}
		return password;
	}
}
