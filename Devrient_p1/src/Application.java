import java.util.Scanner;

//pseudo-code is in encrypter class

public class Application{

	public static void main(String[] args) {
		
		Scanner digitReader = new Scanner(System.in);
		
		int digitOne, digitTwo, digitThree, digitFour;
		
		System.out.println("Please enter your 4-digit code with a space in between: ");
		
		digitOne = digitReader.nextInt();
		digitTwo = digitReader.nextInt();
		digitThree = digitReader.nextInt();
		digitFour = digitReader.nextInt();
		
		Encrypter.Encrypt(digitOne, digitTwo, digitThree, digitFour);
		
		Scanner inputValue = new Scanner(System.in);
		
		int newdigitOne, newdigitTwo, newdigitThree, newdigitFour;
		
		System.out.println("Please enter the encrypted code with spaces in between: ");
		
		newdigitOne = inputValue.nextInt();
		newdigitTwo = inputValue.nextInt();
		newdigitThree = inputValue.nextInt();
		newdigitFour = inputValue.nextInt();
		
		Decrypter.Decrypt(newdigitOne, newdigitTwo, newdigitThree, newdigitFour);
		
		digitReader.close();
		inputValue.close();
	}

}
