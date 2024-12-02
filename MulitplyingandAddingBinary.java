/*
 * Written by SA Welch
 */
import java.util.Scanner;
public class LetsFigureThisShitOut {
	// Professor I apologize about the name of this program...I got frustrated
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String binaryString;
		
		System.out.println("Hello, enter a binary number: ");
		binaryString = scanner.next();
		// The following loop takes the users input from above and basically takes a binary digit and multiplies it by base value.
		//The base value along with the exponent value is "smushed" together
		//Once the loop hits a Binary number, it then takes the binary digit and multiplies it by  your recently smushed Base and exponent value.
		int baseValue = 2;
		int expValue = 0;
		int powerValue = 1;
		int decNum = 0;
		int i = binaryString.length() - 1;
		
		while (i >= 0){
			if(binaryString.charAt(i) == '1'){
				for(int j = 0; j < expValue; j++){
					// this is the point in the loop where the actual value of our binary is added to the variable.
					powerValue +=baseValue;
				}
				decNum += powerValue;
				powerValue = 1;
			}
			i--;
			expValue++;
		}
		System.out.println("Decimal Number is: " + decNum);
		System.out.println("Please enter another Binary Number: ");
binaryString = scanner.next();
		// Once the first round of Binary numbers is converted, another loop is made to do the same thing to the next input of binary numbers.
		int baseValue1 = 2;
		int expValue1 = 0;
		int powerValue1 = 1;
		int decNum1 = 0;
		int i1 = binaryString.length() - 1;
		
		while (i1 >= 0){
			if(binaryString.charAt(i1) == '1'){
				for(int j = 0; j < expValue1; j++){
					powerValue1 +=baseValue1;
				}
				decNum1 += powerValue1;
				powerValue1 = 1;
			}
			i1--;
			expValue1++;
		}
		System.out.println("Decimal Number is: " + decNum1);
		// Finally, the end product of both converted Binary numbers is sent through another variable to be put together as a sum.
		int sum = decNum1 + decNum;
		{
			
			
		}
		System.out.println("Added together: " + sum);
					
				}
	{
				
				
			
		}
	}


		

	
