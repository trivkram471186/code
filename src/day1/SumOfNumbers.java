package day1;

public class SumOfNumbers {

	int sumOfEvenNumbers(Integer start, Integer end)
	{
		int sum = 0;
		for(int i = start; i <= end; i++)
		{
			if(i % 2 == 0)
				sum = sum + i;
		}
		return sum;
	}
	
	int sumOfOddNumbers(Integer start, Integer end)
	{
		int sum = 0;
		for(int i = start; i <= end; i++)
		{
			if(i % 2 != 0)
				sum = sum + i;
		}
		
		return sum;		
	}
}
