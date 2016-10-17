print "Please type in some text: "
String str = System.console().readLine()

print str
int length = str.length() 
for (int i = 0; i < length; i++) {
	print str.charAt(length - i - 1);
}

//print ln ""

