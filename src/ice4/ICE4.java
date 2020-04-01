package ice4;


public class ICE4 {
	
	public static int checkingTheNumberOfCharacters(String word, char character) {
		int result = 0;
		for(int i = 0; i<word.length(); i++) {
			if(word.charAt(i)==character) {
				result++;
			}
		}
		return result;
	}
	
	public static char calculateMaximumCharacter(char[] charArr) {
		char result = charArr[0];
		for(int i =0; i < charArr.length; i++) {
			if(charArr[i]>result) {
				result = charArr[i];
			}
		}
		return result;
	}
	
	public static boolean checkWordExist(String word, char character) {
		
		boolean result = false;
		
		for(int i =0; i < word.length(); i++) {
			if(word.charAt(i)==character) {
				result = true;
			}
		}
		
		return result;
		
	}
	
	
	public static void main(String[] args) {
		
		
		
	}
}
