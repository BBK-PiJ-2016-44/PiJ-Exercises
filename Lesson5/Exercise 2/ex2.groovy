// Exercise 2 


int[] checkAndReverse(int[] theArray) { 
	ArrayChecker myChecker = new ArrayChecker() 
	if (!myChecker.isSymmetrical(theArray)) { 
		int[] reversedArray = myChecker.reverse(theArray)
		for (in = 0; i < myChecker.length; i++) { 
		return theArray;
	} else { 
	return theArray;
	}
}

void printArray[int[] theArray) { 
	for (int i = 0; i < theArray.length; i++) {
		print theArray[i]
	}
	println ""
}

int[] = symArray = [1,3,4,5,8,5,4,3,1]
int[] = nonSymArray = [1,5,8,5,4,3,1] 

print "First array: "
printArray(checkAndReverse(symArray)) 
print "Second array: " 
printArray(checkAndReverse(nonSymArray)) 

