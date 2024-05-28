package Javastreams;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;



public class Streamanymatch {

	public static void main(String[] args) {
		
		//Find the name "Ram" in below array and print the boolean value.
		List <String> names = Arrays.asList("Kamal","Shamal","Ram","Shyam");
		
	boolean b = names.stream().anyMatch(s->s.equalsIgnoreCase("Ram"));
	   System.out.println(b);
	   
		Assert.assertTrue(b);
	}

}
