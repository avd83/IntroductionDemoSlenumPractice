
public class StringAnditsMethodsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// belo is the statement that create object(s) for String class
		String s = ("Abahy Vijaykumar Dere");
		
       // below is the statement that remove the blank space in string 	using array
		String[] SplitString = s.split(" ");	
		//below are the statements are use for print output
		System.out.println(SplitString[0]);
		System.out.println(SplitString[1]);
		System.out.println(SplitString[2]);
		
		String[] SplitString1 = s.split("Vijaykumar");	
		//below are the statements are use for print output
		System.out.println(SplitString1[0]);
		System.out.println(SplitString1[1]);
		
		//trim method use for remove the space before string.
		System.out.println(SplitString1[1].trim());
		
		//below loop include charAt method find that count of character in string .
		for(int i=0;i<s.length();i++)
		{
		System.out.println(s.charAt(i));
		}
		
		//reverse the string from last to first character
		for(int i=s.length()-1;i>=0;i--)
		{
		System.out.println(s.charAt(i));
		}
	}
	
}
