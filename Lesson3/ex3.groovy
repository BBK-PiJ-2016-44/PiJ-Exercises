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

int binary2decimal(String binaryNum) { 

	int decNum = 0
	for (i = 0;i <= binaryNum.length() ;i++) { 
	int binDigit = Character.getNumbericValue(binaryNum.charAt(i));		
	decNum = decNum + (binDigit*power2(binaryNum.length()-i))
	}
	return decNum

}
		

result = power(2,5) 
println result

result = power2(10)
println result

result = binary2decimal("1101")
println result




	
