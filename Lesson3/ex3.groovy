// Exercise 3 Binary and Decimal

int ans = 0

int power(int a, int b) {
	int ans = 0;
	ans = a**b;
	return ans;
} 

int power2(int a) { 
	int ans;
	ans = power(2,a);
	return ans;
}

int binary2decimal(String binaryNum) {   // Takes a binary string as a parameter, returns decimal number as int

	int decNum = 0
	for (i = 0;i < binaryNum.length() ;i++) { 
	int binDigit = Character.getNumericValue(binaryNum.charAt(i));		
	decNum = decNum + (binDigit*power2(binaryNum.length() -i -1))   // Uses power2 method
	}
	return decNum

}

String decimal2binary(String decStr) {   
	int decNum = Integer.parseInt(decStr)
	int wkNum = 0
	String result1 = ""
	String result2 = ""
	while (decNum > 1 || decNum !=0) {  
		wkNum = decNum % 2;
		if (wkNum == 1) {
			result1 += "1"
		} else { 
			result1 += "0"
		}
		decNum = decNum/2
	}

	for (int i = 0; i < result1.length(); i++) { 
		result2 += result1.charAt((result1.length()-i)-1)   //Constructs binary string from quotients
	}
	return result2;
}
		

//result = power(2,5) 
//println result

//result = power2(10)
//println result

//result = binary2decimal("1000101")
//println result

//result = decimal2binary("69")
//println result


// Program Starts here ******************************************************************** 

Boolean end = false
while (!end) {

	println ("Please enter what you would like to do: ")
	println ("(1) Binary to decimal")
	println ("(2) Decimal to binary")
	println ("Any other number to quit")  

	int choice = 0;
	choice = Integer.parseInt(System.console().readLine())
	switch (choice) { 
		case "1": 
			println "Enter binary number: " 
			String input = System.console().readLine()
			println ("The binary number " + input + " is " + binary2decimal(input) + " in decimal") 
			println ""
			break
		case "2": 
			println "Enter decimal number: " 
			String input = System.console().readLine()
			println ("The decimal number " + input + " is " + decimal2binary(input) + " in binary")
			println "" 
			break
		default:
			end = true
		
	}		
} 





	
