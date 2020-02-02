
public class Decrypter {
	
	//two scenarios:
	//0,1,2 > 7,8,9
	//3-9 > 0, 1, 2, 3, 4 ,5 ,6
	//if we put 0 in original; then we get 7, then modulo 10 leaves us with 7
	//if the encrypted value is 7, 8, 9; modulo didn't take effect
	//if the encrypted value is 0-6 then modulo did take effect
	//category 1: modulo not used (just subtract 7)
	//cat2: modulo used
	
	//if (EncryptedNum is greater than 6)
	// 	then subtract 7
	//else
	//	add 3
	
	public static void Decrypt(int newdigitOne , int newdigitTwo, int newdigitThree, int newdigitFour) {
		
		int temp1, temp2;
		
		if (newdigitOne > 6) {
			newdigitOne -= 7;
		} else {
			newdigitOne += 3;
		}
		
		if (newdigitTwo > 6) {
			newdigitTwo -= 7;
		} else {
			newdigitTwo += 3;
		}

		if (newdigitThree > 6) {
			newdigitThree -= 7;
		} else {
			newdigitThree += 3;
		}

		if (newdigitFour > 6) {
			newdigitFour -= 7;
		} else {
			newdigitFour += 3;
		}
		
		temp1 = newdigitOne;
		temp2 = newdigitTwo;
		
		newdigitOne = newdigitThree;
		newdigitThree = temp1;
		
		newdigitTwo = newdigitFour;
		newdigitFour = temp2;
		
		System.out.println("Your decrypted code is: " + newdigitOne + " " + newdigitTwo + " " + newdigitThree + " " + newdigitFour);
		
	}

}
