package Core_javas7;

public class sub_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("PRANAV PRADDEP SHUKLA");
		String s2 = new String("SHUKLA");
		
		String s3 = new String("SHKLA");
		int loop=0;
		
		if(s1.contains(s2))		// string class contains() method 
		{
			System.out.println("String 2 is sub string of String1");
		}
		else
		{
			System.out.println("String 2 is not sub string of String1");
		}
		
		if(s1.contains(s3))		// string class contains() method
		{
			System.out.println("String 3 is sub string of String1");
		}
		else
		{
			System.out.println("String 3 is not sub string of String1");
		}
			
	}

}
