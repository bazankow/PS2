package base;

public class MyInteger {
	private int iValue = 1; //creates iValue and base case
	
	MyInteger() //constructor of object
	{
	}

	MyInteger(int newValue) //constructor of object with specified value
	{
		iValue = newValue;
	}
	
	//get method
	public int getValue(){
		return iValue;
	}
	
	//Tests iValue for even, odd, and prime
	public boolean isEven()
	{
		if (iValue%2 == 1)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public boolean isOdd()
	{
		if (iValue%2 == 0)
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
		if (iValue%2==0)
		{
			return false;
		}
		for(int i=3;i*i<=iValue;i+=2)
		{
			if(iValue%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	//Tests specified number num for even, odd, prime
	public static boolean isEven(int num)
	{
		if (num%2 == 1)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public static boolean isOdd(int num)
	{
		if (num%2 == 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public static boolean isPrime(int num)
	{
		if (num%2==0)
		{
			return false;
		}
		for(int i=3;i*i<=num;i+=2)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	//Tests an instance of MyInteger
	public static boolean isEven(MyInteger value){
		if(value.iValue%2==1) return false;
		else return true;
	}
	public static boolean isOdd(MyInteger value){
		if(value.iValue%2==0) return false;
		else return true;
	}
	public static boolean isPrime(MyInteger value){
		if(value.iValue%2==0) return false;
		for(int i=3;i*i<=value.iValue;i+=2){
			if (value.iValue%i==0) return false;
		}
		return true;
	}
	
	//equal to methods for an integer and an instance of MyInteger
	public boolean equals(int num){
		if (num==iValue) return true;
		else return false;
	}
	public boolean equals(MyInteger value){
		if (value.iValue==this.iValue) return true;
		else return false;
	}
	
}
