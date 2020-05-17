package primePalindrome;

public class primePalindromeFinder {

	public primePalindromeFinder() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i=8;
		System.out.println("2");
		System.out.println("3");
		System.out.println("5");
		System.out.println("7");
		
		while(true)
		{
			// uses short circuiting with the and statements since on average
			// the palindrome check is faster to compute hence making it more efficient
			if(calcPalindrome(i)&&calcPrime(i))
			{
				System.out.println(i);
				i++;
				
			}
			else
			{
			i++;
			}
		}
	}
	
	//checks if l is a prime
	//more efficient since only checks to square root of the value which 
	//is the highest value required
	public static boolean calcPrime(double j)
	{
	    for(int i=2;i<Math.sqrt(j);i++) {
	        if(j%i==0)
	            return false;
	    }
	    return true;
	}
	//checks if l is the same value reversed
	public static boolean calcPalindrome(int l)
	{
		String reverse="";
		String b= Integer.toString(l);
		int len=b.length();
	

		if(b.length()==1)
		{
			return true;
		}
		else
		{
			for(int i = len- 1; i >-1; i--)
	        {
	            reverse = reverse + b.charAt(i);
	        }
			return reverse.equalsIgnoreCase(b);
			
		}
	}

}
