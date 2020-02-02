
public class Encrypter {
	//Read 4 digit code
	//Start encryption
	// 		Replace each digit by adding 7 to each digit
	//		for each digit divide new value ( original + 7) by 10 (use modulo)
	// 		Swap 1st and 3rd digits
	//		Swap 2nd and 4th digits
	// 		Print encrypted number
	
	//function to read 4 digit code and print
	public static void Encrypt(int digitOne , int digitTwo, int digitThree, int digitFour) {
		int temp1, temp2;
		
		digitOne = (digitOne + 7) % 10;
		digitTwo = (digitTwo + 7) % 10;
		digitThree = (digitThree + 7) % 10;
		digitFour = (digitFour + 7) % 10;
		
		temp1 = digitOne;
		temp2 = digitTwo;
		
		digitOne = digitThree;
		digitThree = temp1;
		
		digitTwo = digitFour;
		digitFour = temp2;
		
		
		System.out.println("Your encrypted code is: " + digitOne + " " + digitTwo + " " + digitThree + " " + digitFour);
		

	}

	
	

}
