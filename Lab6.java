//Lindsay Swanson
//2/22/16

public class Lab6
{
	public static long numOunces(double dPounds)
	{
		double ounces;
		long convert;
		
		ounces = dPounds * 16;
		convert = Math.round(ounces);
		
		return convert;
	}
	public static boolean isEvenlyDivisibleBy(long num, long denom)
	{
		if (num % denom == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static char charEncrypt(char c)
	{
		//get ascii code for input character
		int lc = (int) c;
		
		//pass ascii code to numOunces
		long user = numOunces(lc);
		long denom = 3;
		
		boolean value = isEvenlyDivisibleBy(user, denom);
		
		char newchar = (char) (c + 1);
		char oldchar = (char) (c - 1);
				
		//if value is evenly divisible by three
		if (value == true)
		{
			return newchar;
		}
		else
		{
			return oldchar;
		}
			//return character that has the ascii code that is one greater than original
			//else return character with ascii code one lower than original
	}
	public static void main(java.lang.String[] args)
	{
		char var = IO.readChar("Enter a character ");
		if (var == 46)
		{
			break;
		}
		else
		{
			System.out.print(charEncrypt(var));
		}

	}
}