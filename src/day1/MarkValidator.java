package day1;

public class MarkValidator {

	boolean isPass(int mark)
	{
		if(mark >= 40 )
			return true;
		
		return false;
	}
	
	String markGrade(int mark)
	{
		if(isPass(mark))
		{
			if(mark > 90)
				return "A";
			else if(mark > 75 && mark <= 90)
				return "B";
			else if(mark > 60 && mark <= 75)
				return "C";
			else
				return "D";
		}
		
		return "D";
	}
	
	String markGradeUsingSwitch(int mark)
	{
		if(isPass(mark))
		{
			switch(mark)
			{
			case 91:
			case 92:
			case 93:
			case 94:
			case 95:
			case 96:
			case 97:
			case 98:
			case 99:
			case 100:
						return "A";
			case 76:
			case 77:
			case 78:
			case 79:
			case 80:
			case 81:
			case 82:
			case 83:
			case 84:
			case 85:
			case 86:
			case 87:
			case 88:
			case 89:
			case 90:
						return "B";
			case 61:
			case 62:
			case 63:
			case 64:
			case 65:
			case 66:
			case 67:
			case 68:
			case 69:
			case 70:
			case 71:
			case 72:
			case 73:
			case 74:
			case 75:
						return "C";
				
			default:
						return "D";
			}
		}
		
		return "D";
	}
}
