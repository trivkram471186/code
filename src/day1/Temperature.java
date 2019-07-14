package day1;

public class Temperature {

	Double convertToFarenheit(Double celcius)
	{
		return celcius * 9 / 5 + 32;
	}
	
	Double convertToCelcius(Double faranheit)
	{
		return (faranheit - 32) * 5 / 9;
	}
}
