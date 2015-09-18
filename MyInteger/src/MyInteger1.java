public class MyInteger 
{
	private int value;
	public MyInteger(int value)
	{
		this.value = value;		
	}
	public int getValue()
	{
		return value;
	}
	public boolean isEven()
	{
		if(this.value % 2==0)
		{
			return true;
		}
		else
		{
		return false;	
		}
	}
	public static boolean isEven(int value)
	{
		if(value % 2 == 0)
		{
			return true;
		}
		else
		{
		return false;	
		}
	}
	public static boolean isEven(MyInteger myInt)
	{
		if(myInt.getValue() % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;	
		}
	}
	public boolean isOdd()
	{
		if(this.value % 2 == 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public static boolean isOdd(int value)
	{
		if(value % 2 == 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public static boolean isOdd(MyInteger myInt)
	{
		if(myInt.getValue() % 2 == 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public boolean isPrime()
	{
		int i = 2;
		int number = 0;
		while (i <= value / 2)
		{
			if (value % i == 0)
			{
				number = 1;
			}
			i++;
		}	
		if(number == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean isPrime(int value)
	{
		int i = 2;
		int number = 0;
		while (i <= value / 2)
		{
			if (value % i == 0)
			{
				number = 1;
			}
			i++;
		}	
		if(number == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean isPrime(MyInteger myInt)
	{
		int integer = myInt.getValue();
		int i = 2;
		int number = 0;
		while (i <= integer / 2)
		{
			if (integer % i == 0)
			{
				number = 1;
			}
			i++;
		}	
		if(number == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean equals(int x) 
	{
		if (value == x)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean equals(MyInteger x)
	{
		return equals(x.getValue());
	}
	char[] chart = {'1','2','3','4'};
	String t = "1234";
	
	public static int parseInt(String t)
	{
		return Integer.parseInt(t);
	}
	public static int parseInt(char[] t)
	{
		return parseInt(new String(t));
	}
}
