package day1;

public class Factorial {

	Integer calculateFactorial(Integer number)
	{
		if(number == 0) 
			return 1;
		
		return number * calculateFactorial(number - 1);
	}
}
