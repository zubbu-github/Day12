package day12;

public class StringDemo {

	public static void main(String[] args) {
	
		String s = "Hello";
		System.out.println("The 1st String value is " + s);
		System.out.println("The Length of 1st string is " + s.length());
	
		String s1 = new String(" World");
		System.out.println("The 2nd String value is " + s1);
		System.out.println("The Length of 2nd string is " + s1.length());
		
		String s2 = s.concat(s1);
		System.out.println("The 1st and 2nd String values is " + s2);
		System.out.println("The Length of 2nd string is " + s2.length());
		
		String s3 ="Hello";
		System.out.println("The 3rd String value is " + s3);
		
		String s4 ="Java";
		System.out.println("The 4th String value is " + s4);
		
		if(s==s3)
		{
			System.out.println("Print S = S3");
		}
		else {
			System.out.println("Print S != S3");
		}
		 System.out.println("s and s3 are equal values " + (s.equals(s3)));
	}

}
