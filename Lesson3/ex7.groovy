// Exercise 7 Doubles practise

double total (double borrowed, double intRate) { 
	return (borrowed * (1  + (intRate/100))) 
} 
						
double perYear (double total, double noYears) {
	return total/noYears
}

double interestPayBackYears (double borrowedAmount, double totalAmount, double yearlyAmount) {
	double interestAmount = totalAmount - borrowedAmount
	double years = interestAmount/yearlyAmount
	return years
}


// Program start - inputs ************************************
println ("Amount borrowed: ") 
double amount = Double.parseDouble(System.console().readLine())

println ("Payback years: ") 
double noYears = Double.parseDouble(System.console().readLine())

println ("Interest rate in %: ") 
double intRate = Double.parseDouble(System.console().readLine())

// Calculations and outputs ****************************
double totalAmount = total(amount, intRate) 
double yearlyAmount = perYear(totalAmount, noYears)
double years = interestPayBackYears(amount, totalAmount, yearlyAmount)

println ("Total amount to pay back: " + totalAmount)

println ("Paying back " + yearlyAmount + " per year") 

println("Interest will be paid back in " + years + " years") 






